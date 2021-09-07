package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class cInterest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float A, P, r, n, t;

        System.out.print("What is the principle amount? ");
        P = input.nextFloat();
        System.out.print("What is the rate? ");
        r = input.nextFloat();
        System.out.print("What is the number of years? ");
        t = input.nextFloat();
        System.out.print("What is the number of times the interest is compounded per year? ");
        n = input.nextFloat();

        A = P * (float) Math.pow((1 + (r / 100) / n), n*t);
        System.out.printf("$%.0f invested at %.2f%% for %.0f years compounded %.0f times per year is $%.2f.", P, r, t, n, A);
    }
}
