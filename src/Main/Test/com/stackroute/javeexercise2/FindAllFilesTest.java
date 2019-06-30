package com.stackroute.javeexercise2;

import com.stackroute.javeexercise2.FindAllFiles;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FindAllFilesTest {

    FindAllFiles findAllFiles;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        findAllFiles = new FindAllFiles();
    }

    @Test
    public void checkWhetherFileContentIsCorrect() throws IOException {
        expectedResult = findAllFiles.findAndReadFiles(new String[] {"home/mrudula/Desktop/", "file.txt"});
        actualResult = "Calculates the frequency of the words in a given file\n";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherFileIsPresent() throws IOException {
        expectedResult = findAllFiles.findAndReadFiles(new String[] {"", "file1.txt"});
        actualResult = "Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown()throws Exception {
        findAllFiles = null;
    }
}