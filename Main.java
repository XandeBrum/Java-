/*
 * Dit programma is een eenvoudige rekenmachine, Het programma
 * vraagt de gebruiker om een operator (+, -, *, / of %) en twee getallen en toont vervolgens de som,
 * inclusief antwoord, op het scherm.
 * @author Xande
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean geldigOperator;
        char operator;

        do {
            //vragen van de operator
            System.out.print("Kies een operator: ");
            operator = scanner.next().charAt(0);

            geldigOperator = isGeldigeOperator(operator);

            //als er S wordt ingevuld dan stop het programma
            if (operator == 'S') {
                break;
            }
            else if (geldigOperator == false) {
                //de rest van de scanner inputs wordt gestuurd naar de: " isGeldigeOperator()" methode
                System.out.println("Fout");
                geldigOperator = isGeldigeOperator(operator);
            }            //als alles klopt dan kun je twee komagetallen invoeren
            else if (geldigOperator == true) {
                System.out.print("Noem twee kommagetallen: ");
                double getal1 = scanner.nextDouble();
                System.out.print("Noem nog een kommagetal: ");
                double getal2 = scanner.nextDouble();
                //als laatste wordt de printBerekening() methode geroepen om de berekening te doen
                printBerekening(operator, getal1, getal2);
            }
//
//            //als de operator niet geldig is dan wordt er gevraagd om een nieuwe input todat het geldig is
//            if (geldigOperator == false) {
//                while (geldigOperator == false) {
//                    System.out.print("Foute operator! kies een geldige operator!: ");
//                    operator = scanner.next().charAt(0);
//                    geldigOperator = isGeldigeOperator(operator);
//                }
//            }


        } while (operator != 'S');
    }

    //+, -, *, /, %.
    public static boolean isGeldigeOperator(char karakter) {

        boolean geldig;
        //als de operator/karakter geldig is dan return true, else return false
        if (karakter == '+' || karakter == '-' || karakter == '*' || karakter == '/' || karakter == '%') {
            geldig = true;
        } else {
            geldig = false;
        }

        return geldig;
    }

    public static void printBerekening(char operator, double getal1, double getal2) {

        //switch omdat je weet welke operators je kan krijgen
        switch (operator) {
            case '+':
                double som = getal1 + getal2;
                System.out.println(getal1 + " + " + getal2 + " = " + som);
                break;
            case '*':
                double product = getal1 * getal2;
                System.out.println(getal1 + " * " + getal2 + " = " + product);
                break;
            case '-':
                double min = getal1 - getal2;
                System.out.println(getal1 + " - " + getal2 + " = " + min);
                break;
            case '/':
                double deel = getal1 / getal2;
                System.out.println(getal1 + " / " + getal2 + " = " + deel);
                break;
            case '%':
                double modulo = getal1 % getal2;
                System.out.println(getal1 + " % " + getal2 + " = " + modulo);
                break;
        }
    }

}
