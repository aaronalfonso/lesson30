package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner data = new Scanner(new File("average.txt"));
        int index = -1;

        String dataSet[] = new String[10];

        while(data.hasNext()){
            index++;
            String name = data.next();
            int avg = 0;
            int numberOfGrades = 0;
            while(data.hasNextBigInteger()){
                avg += data.nextInt();
                numberOfGrades++;
            }
            avg /= numberOfGrades;

            System.out.println(name + ", Average = " + avg);
        }


    }
}
