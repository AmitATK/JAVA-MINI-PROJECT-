package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Numberguessingproject{

public static void main(String[] args)
{
    System.out.print("Enter a number (1-100) :"); 
    Scanner sc= new Scanner(System.in);
    int mynumber = (int)(Math.random()*100);
    int usernumber;
    do {
        System.out.println("Guess my number");
        usernumber = sc.nextInt();
        if (usernumber == mynumber)
        {
            System.out.println("Correct you choose correct number ");
        }
        else if (usernumber != mynumber)
        {
            System.out.println("Number is not correct");
        }
        else if (usernumber<mynumber)
        {
            System.out.println("number is less then my number");
        }
        else
        {
            System.out.println("Please type correct number");
        }
    }while (usernumber>=0);
    System.out.print("My number was :"+mynumber);
}
}
