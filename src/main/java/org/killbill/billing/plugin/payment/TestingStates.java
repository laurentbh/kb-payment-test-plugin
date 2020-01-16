package org.killbill.billing.plugin.payment;

import org.killbill.billing.payment.plugin.api.PaymentPluginApi;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

public class TestingStates {

    private final Set<String> allowedMethods;

    public enum Actions {
        ACTION_RETURN_PLUGIN_STATUS_PENDING,
        ACTION_RETURN_PLUGIN_STATUS_ERROR,
        ACTION_RETURN_PLUGIN_STATUS_CANCELED,
        THROW_EXCEPTION,
        RETURN_NIL
    }

    private final Map<Actions, Set<String>> states;

    public TestingStates() {
        this.states = new HashMap<>();

        final Class cls = PaymentPluginApi.class;
        final Method[] methods = cls.getMethods();
        this.allowedMethods = Arrays.stream(methods).map(Method::getName).collect(Collectors.toSet());
    }

    //    public Actions getAction

    public void add(final Actions action, @Nullable final String forMethod) {

        //        if (forMethod == null) {
        //            this.states.put(action, OldTestPaymentPluginAPI.getAuthorizedMethods());
        //        }
        //        else {
        //            Set<String> methods = this.states.get(action);
        //            if (methods == null) {
        //                methods = new HashSet<>();
        //            }
        //            methods.add(forMethod);
        //        }
    }
}
