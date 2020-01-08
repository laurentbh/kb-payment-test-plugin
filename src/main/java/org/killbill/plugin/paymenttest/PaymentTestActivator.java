package org.killbill.plugin.paymenttest;

import org.killbill.billing.osgi.api.OSGIPluginProperties;
import org.killbill.billing.osgi.libs.killbill.KillbillActivatorBase;
import org.killbill.billing.payment.plugin.api.PaymentPluginApi;
import org.killbill.billing.plugin.core.resources.jooby.PluginApp;
import org.killbill.billing.plugin.core.resources.jooby.PluginAppBuilder;
import org.killbill.plugin.paymenttest.core.State;
import org.killbill.plugin.paymenttest.core.TestPaymentPluginAPI;
import org.killbill.plugin.paymenttest.resources.PaymentTestResource;
import org.osgi.framework.BundleContext;

import java.util.Hashtable;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

public class PaymentTestActivator extends KillbillActivatorBase {
    public static final String PLUGIN_NAME = "killbill-payment-test";


    public PaymentTestActivator() {


    }

    @Override
    public void start(final BundleContext context) throws Exception {

        super.start(context);

        final State state = new State();
        final TestPaymentPluginAPI testPlugin = new TestPaymentPluginAPI(state);

        registerPaymentPluginApi(context, testPlugin);

        final PluginApp pluginApp = new PluginAppBuilder(PLUGIN_NAME,
                                                         this.killbillAPI,
                                                         this.logService,
                                                         this.dataSource,
                                                         super.clock,
                                                         this.configProperties).withRouteClass(PaymentTestResource.class)
                                                                               .withService(this.killbillAPI)
                                                                               .withService(this.roOSGIkillbillAPI)
                                                                               .withService(super.clock)
                                                                               .build();

        final HttpServlet httpServlet = PluginApp.createServlet(pluginApp);
        registerServlet(context, httpServlet);
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        super.stop(context);
    }

    private void registerPaymentPluginApi(final BundleContext context, final PaymentPluginApi api) {
        final Hashtable<String, String> props = new Hashtable<>();
        props.put(OSGIPluginProperties.PLUGIN_NAME_PROP, PLUGIN_NAME);
        this.registrar.registerService(context, PaymentPluginApi.class, api, props);
    }

    private void registerServlet(final BundleContext context, final Servlet servlet) {
        final Hashtable<String, String> props = new Hashtable<>();
        props.put(OSGIPluginProperties.PLUGIN_NAME_PROP, PLUGIN_NAME);
        this.registrar.registerService(context, Servlet.class, servlet, props);
    }
}
