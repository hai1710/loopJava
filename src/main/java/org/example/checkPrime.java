package org.example;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is a not prime number.");
        } else {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
