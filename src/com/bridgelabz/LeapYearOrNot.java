package com.bridgelabz;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = input.nextInt();
        if (year%400 ==0 ){

            System.out.println(year+" is leap year");
        } else if (year %4 ==0 && year%100!=0) {

            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+" is leap not year");
        }
    }
}
