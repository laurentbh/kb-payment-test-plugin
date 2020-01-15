package org.killbill.plugin.paymenttest.core;

import org.killbill.billing.plugin.paymenttest.TestingStates;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StateTest {

    @Test
    public void test() {
        final TestingStates.Actions actions = TestingStates.Actions.valueOf("ACTION_RETURN_PLUGIN_STATUS_ERROR");


        Assert.assertEquals(true, true);
    }

}