package com.stackroute.javeexercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileProgramTest {
    FileProgram fp;

    @Before
    public void setUp() throws Exception {
        fp=new FileProgram();
    }

    @After
    public void tearDown() throws Exception {
        fp=null;
    }
    @Test
    public void check(){
        String res=fp.checkFile(new File("/home/mrudula/Desktop/file.txt"));
        assertEquals("mrudula is good",res);
    }
}