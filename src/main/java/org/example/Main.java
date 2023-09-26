package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

     boolean variable = true;
     boolean segona = false;

        System.out.println(variable && segona); //and
        System.out.println(segona || segona); //or

     int age = 17;
     String name = "John";

        System.out.println(name.equals("John") || !(age > 17));

        System.out.println(name.equals("John") && !(age > 17)); //NAME = John

        System.out.println(name.equals("John") || !(name.equals("Jane")) && age >= 16 && age <25);

        double valorReal = 2.34;
        int valorEnter = (int)valorReal; //casting (és a dir, passa el 2.34 a 2)
        String text = "" + 56; //genera string 56
        text = Integer.toString(56); //genera string 56
        valorEnter = Integer.parseInt(text); //valorEnter contindrá un 56
        }
        }