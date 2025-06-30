package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Addition addition = new Addition();
        System.out.println("Performing addition...");
        System.out.println("Enter 2 numbers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = addition.add(a, b);
        System.out.println("The result of addition is: " + result);
        sc.close();
    }
}