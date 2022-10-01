package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> averages = new ArrayList<Double>();

        String proceed = "yes";
        int hits, atbat;
        double lowest;

        while (proceed.equalsIgnoreCase("yes"));

        System.out.println("Enter the number of times at bats and number of hits: ");
        atbat = input.nextInt();
        hits = input.nextInt();
        averages.add((double) hits / atbat);

        System.out.println(" Do you wish to proceed another player? (yes/no)");
        proceed = input.next();


        lowest=averages.get(0);
        for(double x:averages){

            System.out.println(x);
            if (x < lowest) {
                lowest = x;
                System.out.println("The lowest average is: " + lowest);
            }
        }

    }


}
