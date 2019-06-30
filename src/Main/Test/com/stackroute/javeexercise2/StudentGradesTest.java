package com.stackroute.javeexercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades sg;

    @Before
    public void setUp() throws Exception {
        sg=new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        sg=null;
    }
    @Test
    public void check(){
        int res=sg.grade(4,new int[]{20,30,40,50});
        assertEquals(50,res);
    }
}