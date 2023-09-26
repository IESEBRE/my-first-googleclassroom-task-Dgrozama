package org.example;

public class Condicionals1 {
    public static void main(String[] args) {
        /*Sentència if
        if(condició: true/false){
            instruccions s'executen si la informació és certa...*/

        int age = 10;
        //Mostraré un missatge només si la edat és superior a 15.
        if (age >= 15) {
            System.out.println("La edat és superior a 15");
        } else if (age < 15) {
            System.out.println("La edat és menor a 15");
        }
    }
}
