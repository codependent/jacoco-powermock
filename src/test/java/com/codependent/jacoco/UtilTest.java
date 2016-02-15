package com.codependent.jacoco;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Util.class})
public class UtilTest {

    @Test
    public void testSay() throws Exception {
        PowerMockito.mockStatic(Util.class);
        Mockito.when(Util.say(Mockito.anyString())).thenReturn("hello:mandy");
        Assert.assertEquals("hello:mandy", Util.say("sid"));
    }

}
