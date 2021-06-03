/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readEuros();
        String Num2 = myApp.readExchangeRateUS();
        int amount_from = Integer.parseInt(Num1);
        double rate_to = 100;
        double rate_from = Double.parseDouble(Num2);
        double amount_to = myApp.calcDollar(amount_from, rate_from, rate_to);
        String outputString = myApp.generateOutputString(amount_from, rate_from, amount_to);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readEuros(){
        System.out.print("How many euros are you exchanging? ");
        return in.nextLine();
    }

    public String readExchangeRateUS(){
        System.out.print("What is the exchange rate? ");
        return in.nextLine();
    }

    public double calcDollar(double amount_from, double rate_from, double rate_to){
        return ((amount_from * rate_from) / rate_to);
    }

    public String generateOutputString(int amount_from, double rate_from, double amount_to){
        return String.format("%d euros at an exchange rate of %.2f is\n%.2f U.S. dollars.", amount_from, rate_from, amount_to);
    }
}