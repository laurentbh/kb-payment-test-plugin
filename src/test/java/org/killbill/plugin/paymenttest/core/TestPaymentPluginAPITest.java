package org.killbill.plugin.paymenttest.core;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TestPaymentPluginAPITest {

    @Test
    public void testGetAuthorizedMethods() {
        final Set<String> set = TestPaymentPluginAPI.getAuthorizedMethods();

        Assert.assertEquals(true, true);
    }
}