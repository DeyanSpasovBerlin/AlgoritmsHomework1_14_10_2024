package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HomeworkTask task = new HomeworkTask();
        //task.readFile();
        InputNumbers input = new InputNumbers();
        SumNumbers sum = new SumNumbers();
        sum.sumKundenArray(input.kundenArray());


    }
}