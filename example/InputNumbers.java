package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class InputNumbers {
    Scanner reader = new Scanner(System.in);
    public Integer kundenInputNumber(int index){
        System.out.println("Please input integer number:"+index);
        Integer num = reader.nextInt();
        return num;
    }
    public ArrayList<Integer> kundenArray(){
        ArrayList<Integer> kundenArray = new ArrayList<>();
        System.out.println("Please input 3 integer numbers:");
        for (int i = 1; i < 4; i++) {
            kundenArray.add(kundenInputNumber(i));
            System.out.println("You input the next numbers:");
            System.out.println(kundenArray);
        }
        return kundenArray;
    }
}
