package org.killbill.billing.plugin.payment;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

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
        ACTION_THROW_EXCEPTION,
        RETURN_NIL
    }

    // key is method, "*" is for any method
    @JsonSerialize
    private final Map<String, Actions> states;

    public TestingStates() {
        this.states = new HashMap<>();

        final Class cls = PaymentTestPluginApi.class;
        final Method[] methods = cls.getMethods();
        // TODO: remove method like hashCode, notify, toString ...
        this.allowedMethods = Arrays.stream(methods).map(Method::getName).collect(Collectors.toSet());
    }

    public boolean add(final Actions action, @Nullable final String forMethod) {

        if (forMethod != null) {
            if (this.allowedMethods.contains(forMethod) == false) {
                return false;
            }
        }
        final String method = (forMethod != null) ? forMethod : "*";
        this.states.put(method, action);
        return true;
    }

    public Map<String, Actions> getStates() {
        return this.states;
    }
}
