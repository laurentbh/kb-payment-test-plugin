package org.killbill.plugin.paymenttest.core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StateTest {

    @Test
    public void test() {
        final State.Actions actions = State.Actions.valueOf("ACTION_RETURN_PLUGIN_STATUS_ERROR");


        Assert.assertEquals(true, true);
    }

}