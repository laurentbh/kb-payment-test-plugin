package org.killbill.billing.plugin.paymenttest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT;


@JsonInclude(NON_ABSENT)
public class Payload {

    private final String action;
    private final int    sleepTime;

    @JsonCreator
    public Payload(@JsonProperty("CONFIGURE_ACTION") final String action,
                   @JsonProperty("SLEEP_TIME_SEC") final int sleepTime) {
        this.action = action;
        this.sleepTime = sleepTime;
    }

    public String getAction() {
        return this.action;
    }

    public int getSeepTime() {
        return this.sleepTime;
    }
}
