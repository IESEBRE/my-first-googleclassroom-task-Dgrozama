package org.example;

import java.util.Scanner;

public class BuletiNotes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int nota;
        nota = ent.nextInt();
        if (nota >=1 && nota <=4) {
            System.out.println("Suspes");
        }
        else if (nota >=5 && nota <=6) {
            System.out.println("Aprovat");
        }
        else if (nota >=7 && nota <=8) {
            System.out.println("Notable");
        }
        else if (nota >=9 && nota <=10) {
            System.out.println("Excelent");
        }
    }
}
