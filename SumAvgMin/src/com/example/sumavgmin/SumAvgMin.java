package com.example.sumavgmin;

import java.util.Scanner;

public class SumAvgMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int number = 0;
        int total = 0;
        int counter = 1;



        while (number != -42) {


            total = total + number;
            ++counter;

            System.out.print(" Enter number you desire: ");
            number = scan.nextInt();
            if(counter != 0) {
                int average = total / 10;
            int current = number;

            if (current > maximum) {
                maximum = current;

            }
            if (current < minimum) {

                minimum = current;
                System.out.printf("The average of the inputed numbers are %d%n", average);
            }





               }

        }

        System.out.printf("The Minimum number is: %d%n", minimum);
        System.out.printf("The Maximum number is: %d", maximum);

    }

}

