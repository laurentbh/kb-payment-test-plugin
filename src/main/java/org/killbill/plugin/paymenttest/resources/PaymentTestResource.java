package org.killbill.plugin.paymenttest.resources;

import org.jooby.mvc.Body;
import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;
import org.killbill.plugin.paymenttest.core.State;
import org.killbill.plugin.paymenttest.model.Payload;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Path("/")
public class PaymentTestResource {

    private final State state;

    @Inject
    public PaymentTestResource(final State state) {
        this.state = state;
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
