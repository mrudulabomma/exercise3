package com.stackroute.javeexercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram {

    public String checkFile(File f){
        String line = "";
        String rev = "";
        int len = 0;
        try {
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
            {
                rev=rev.concat(line);
            }
            len=rev.length();
            bufferedReader.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading file named '" + f + "'");
        }
        return rev;
    }

}
