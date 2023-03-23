package org.example;

import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Draw a rectangle");
            System.out.println("2. Draw a square triangle");
            System.out.println("3. Draw a isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter width: ");
                    int width = sc.nextInt();
                    System.out.println("Enter height");
                    int height =sc.nextInt();
                    for ( int i = 0; i < width; i++){
                        for (int j = 0; j < height; j++){
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                break;
                case 2:
                    System.out.println("Enter height:");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    for (int i = n; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    for (int a = 1; a <= n; a++) {
                        String str = " ";
                        for (int i = 1; i <= n - a; i++) {
                            str += ' ';
                        }
                        for (int j = 1; j <= a; j++) {
                            str += '*';
                        }
                        System.out.println(str);
                    }
                    System.out.println(" ");
                    for (int a = n; a >= 0; a--) {
                        String str = " ";
                        for (int i = 1; i <= n - a; i++) {
                            str += ' ';
                        }
                        for (int j = 1; j <= a; j++) {
                            str += '*';
                        }
                        System.out.println(str);
                    }
                    break;
                case 3:
                    System.out.println("Enter height: ");
                    int h = sc.nextInt();
                    for (int i = 0; i <= h; i++){
                        for (int j = 0; j < 2 * h; j++){
                            if (Math.abs(h - j) <= i-1){
                                System.out.printf(" * ");
                            } else {
                                System.out.printf("   ");
                            }
                        }
                        System.out.println(" ");
                    }break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }

        }
    }
}

