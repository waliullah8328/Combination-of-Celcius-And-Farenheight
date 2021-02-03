package com.company;

import java.util.Scanner;

public class CelciousFarenheight {

    public static void Celsius(double x)
    {
        double cel = 0.55556 * (x-32);
        System.out.println("Celsius temperature : "+cel);

    }



    public static void Fahrenheit(double x)
    {
        double F = 1.8 * x + 32;
        System.out.println("Fahrenheit temperature : "+F);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit ");
        System.out.print("Please Enter Your Digit : ");
        n = input.nextInt();
        switch(n)
        {
            case 1:
                double a;
                System.out.print("Please Enter Your Fahrenheit temperature: ");
                a = input.nextDouble();
                Celsius(a);
                break;
            case 2:
                double b;
                System.out.print("Please Enter Your Celsius temperature: ");
                b = input.nextDouble();
                Fahrenheit(b);


        }
    }
}
