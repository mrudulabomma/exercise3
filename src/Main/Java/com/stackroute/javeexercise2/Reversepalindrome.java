package com.stackroute.javeexercise2;

public class Reversepalindrome {
    public String reverse(String word) {
       char[] reverse=word.toCharArray();
       String rev="";
       for(int i=reverse.length-1;i>=0;i--) {
           rev = rev + reverse[i];
       }
       if (word.equals(rev))
                return "palindrome";
            else
                return "not a palindrome";

    }

}
