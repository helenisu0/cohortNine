package com.example.helloworld;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int number;
        int total = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print(" Enter number you desire: ");
            number = scan.nextInt();
            total = total + number;
            ++counter;
            int current =  number;
            if(current > maximum){
                maximum = current;

            }
            if (current < minimum){

                minimum = current;
            }



        }
        int average = total / 10;
        System.out.printf("The average of the inputed numbers are %d%n", average);
        System.out.printf("The Minimum number is: %d%n", minimum);
        System.out.printf("The Maximum number is: %d", maximum);
    }


}





