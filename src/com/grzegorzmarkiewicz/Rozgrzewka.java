package com.grzegorzmarkiewicz;

import java.util.Scanner;

public class Rozgrzewka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku.");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int k = 0; k < n - 2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        n = scanner.nextInt();

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if ((j < (n / 2) - i) || (j > (n / 2) + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 7; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == (n / 2 + 1) && i == 0 || i == n) {
                    System.out.print("*");
                } else if (j == ((n / 2 + 1) + i) || j == ((n / 2 + 1) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

            }
        }
    }

}
