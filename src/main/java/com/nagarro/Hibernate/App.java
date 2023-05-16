package com.nagarro.Hibernate;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc=new Scanner(System.in);
        SearchProduct search=new SearchProduct();
        search.start();
        String color,size,gender;
        int outputPrefer;
        char ch='Y';

        while(Character.toUpperCase(ch)=='Y')
        {

            System.out.print("Enter Colour Of The T-Shirt : ");
            color = sc.nextLine();
            System.out.print("Enter Size Of T-Shirt:(S/M/L/XL): ");
            size = sc.nextLine();
            System.out.print("Enter Gender:(M for Male / F for Female / U for Other) : ");
            gender = sc.nextLine();
            System.out.println("Select The Output Preference You Want :  ");
            System.out.println(" Press 1 for Sorted by Price");
            System.out.println(" Press 2 for Sorted by Rating");
            System.out.println(" Press 3 for Sorted by Both");
            System.out.print("Enter Preference Choice (1/2/3) Only : ");

            outputPrefer = sc.nextInt();

            search.readFile(color, size, gender, outputPrefer);

            System.out.println("Do you want to search again? Y (Yes)/N (No):-");
            ch=sc.next().charAt(0);
            sc.nextLine();

        }
        search.stopThread();
        sc.close();
    }
}
