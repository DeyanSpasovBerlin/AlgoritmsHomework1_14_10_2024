package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HomeworkTask {
    public void showHomeworkTask() throws IOException {
        File HomeworkTask = new File("HomeworkTask.pdf");
        System.out.println(" The path is: "+HomeworkTask.getCanonicalPath());
        Scanner reader  = new Scanner(new File("D:\\TEL-RAN\\Projects\\Lessons\\Algorithms\\Homework1_14_10_2024\\HomeworkTask.pdf"));
    }

}
