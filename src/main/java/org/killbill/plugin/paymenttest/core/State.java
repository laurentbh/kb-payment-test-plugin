package org.killbill.plugin.paymenttest.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;

public class State {

    public enum Actions {
        ACTION_RETURN_PLUGIN_STATUS_PENDING,
        ACTION_RETURN_PLUGIN_STATUS_ERROR,
        ACTION_RETURN_PLUGIN_STATUS_CANCELED,
        THROW_EXCEPTION,
        RETURN_NIL
    }

    private final Map<Actions, Set<String>> states;

    public State() {
        this.states = new HashMap<>();
    }

    //    public Actions getAction

    public void add(final Actions action, @Nullable final String forMethod) {

        if (forMethod == null) {
            this.states.put(action, OldTestPaymentPluginAPI.getAuthorizedMethods());
        }
        else {
            Set<String> methods = this.states.get(action);
            if (methods == null) {
                methods = new HashSet<>();
            }
            methods.add(forMethod);
        }
    }
}
