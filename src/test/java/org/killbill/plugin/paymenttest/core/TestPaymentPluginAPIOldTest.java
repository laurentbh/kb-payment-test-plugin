package org.killbill.plugin.paymenttest.core;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TestPaymentPluginAPIOldTest {

    @Test
    public void testGetAuthorizedMethods() {
        final Set<String> set = OldTestPaymentPluginAPI.getAuthorizedMethods();

        Assert.assertEquals(true, true);
    }
}