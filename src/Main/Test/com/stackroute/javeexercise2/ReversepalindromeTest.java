package com.stackroute.javeexercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversepalindromeTest {
    Reversepalindrome rp;

    @org.junit.Before
    public void setUp() throws Exception {
        rp=new Reversepalindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        rp=null;
    }
    @Test
    public void checkReversepalindrome(){
        String res=rp.reverse("madam");
        assertEquals("palindrome",res);

    }
}