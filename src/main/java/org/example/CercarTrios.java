package org.example;
import java.util.Scanner;

public class CercarTrios {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int C1, C2, C3;
        C1 = ent.nextInt();
        C2 = ent.nextInt();
        C3 = ent.nextInt();

        if (C1 == C2 && C2 == C3 && C3 == C1) {
            System.out.println("SI");

            }  else {
            System.out.println("NO");}

        }
        }

