package org.killbill.billing.plugin.payment.resources;

import org.jooby.mvc.Body;
import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;
import org.killbill.billing.plugin.payment.TestingStates;
import org.killbill.billing.plugin.payment.model.Payload;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Path("/")
public class PaymentTestResource {

    private final TestingStates testingStates;

    @Inject
    public PaymentTestResource(final TestingStates testingStates) {
        this.testingStates = testingStates;
    }

    @Path("status")
    @GET
    public void status() {

    }

    @Path("configure")
    @POST
    public void configure(@Body final Payload payload) {
    }
}
