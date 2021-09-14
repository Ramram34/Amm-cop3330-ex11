/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double result = 0.0;

        System.out.println("Let's Exchange Some Currency!" + "\r\n" +
                            "How many Euros would you like to exchange?");

        double euros = in.nextDouble();

        System.out.println("What is the exchange rate?");

        double exchangeRate = in.nextDouble();

        double dollars = Math.round(euros * exchangeRate * 100.0)/100.0;

        System.out.println(euros + " Euros at an Exchange Rate of " +
                exchangeRate + " is " + dollars + " U.S. Dollars.");

    }
}
