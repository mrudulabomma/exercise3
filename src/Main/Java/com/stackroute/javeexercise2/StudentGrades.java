package com.stackroute.javeexercise2;

public class StudentGrades {
    int i, min, value, max = 0;
    int sum = 0;
    float avg;

    public int grade(int n, int arr[]) {
        for (i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println(avg);
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                return min;
            }
            else {
                int max = 0;
                for (i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                return max;


            }


        }
        return min;
    }
}
