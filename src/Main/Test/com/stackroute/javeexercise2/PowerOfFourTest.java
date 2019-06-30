package com.stackroute.javeexercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour pf;

    @Before
    public void setUp() throws Exception {
        pf=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        pf=null;
    }
    @Test
    public void checkPowerOfFour()
    {
        String res=pf.checkPower(16);
        assertEquals("true power of 4",res);
    }
}