package org.example;

import java.util.Scanner;

public class iguals {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num1, num2;
        num1 = ent.nextInt();
        num2 = ent.nextInt();

        if (num1 == num2) {
            System.out.println("Si que són iguals.");

        }  else {
            System.out.println("No, no son iguals");}

    }
}

