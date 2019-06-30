package com.stackroute.javeexercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTests {
    EvenNumTest en;

    @Before
    public void setUp() throws Exception {
        en=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        en=null;
    }

    @Test
    public void check(){
        boolean res=en.isEven(4);
        assertEquals(true,res);
    }
}