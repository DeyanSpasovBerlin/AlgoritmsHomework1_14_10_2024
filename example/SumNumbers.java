package org.example;

import java.util.ArrayList;

public class SumNumbers {
 private    Integer num1;
 private    Integer num2;
 private    Integer num3;


    public void sumKundenArray(ArrayList<Integer> arr){
        int bufer = 0;
        System.out.println("We have next "+arr.size()+" integer number:");
        System.out.println(arr);
        System.out.println("The sum of this number is:");
        for (int i = 0; i < arr.size(); i++) {
            bufer += arr.get(i);
            System.out.print("\tTemporary sum: \t"+bufer+"\n");

        }
        System.out.println("\nThe total sum of "+arr.size()+" is: "+bufer);
    }
}
