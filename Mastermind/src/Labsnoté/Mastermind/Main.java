package Labsnoté.Mastermind;

import java.util.Scanner;

public class Main {


    private static int tentatives;


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);



        do {

            int a1 = Sc.nextInt();
            int a2 = Sc.nextInt();
            int a3 = Sc.nextInt();
            int a4 = Sc.nextInt();

            if (a1 == 1 && a2 == 2 && a3 == 3 && a4 == 4) {
                System.out.println("J'ai la quequette qui colle et les bonbons qui font des bons");
            } else if (a1 == 1 && a2 == 2 && a3 == 4 && a4 == 3) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 1 && a2 == 3 && a3 == 2 && a4 == 4) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 1 && a2 == 3 && a3 == 4 && a4 == 2) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 1 && a2 == 4 && a3 == 3 && a4 == 2) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 1 && a2 == 4 && a3 == 2 && a4 == 3) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 2 && a2 == 1 && a3 == 3 && a4 == 4) {
                System.out.println("Mal placé" + " " + "Bien placé");
            } else if (a1 == 2 && a2 == 1 && a3 == 4 && a4 == 3) {
                System.out.println("Mal placé");
            } else if (a1 == 2 && a2 == 4 && a3 == 3 && a4 == 1) {
                System.out.println("Mal placé" + " " + "Bien placé");
            } else if (a1 == 2 && a2 == 4 && a3 == 1 && a4 == 3) {
                System.out.println("Mal Placé");
            } else if (a1 == 2 && a2 == 3 && a3 == 4 && a4 == 1) {
                System.out.println("Mal placé");
            } else if (a1 == 2 && a2 == 3 && a3 == 1 && a4 == 4) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 3 && a2 == 1 && a3 == 4 && a4 == 2) {
                System.out.println("Mal placé");
            } else if (a1 == 3 && a2 == 1 && a3 == 2 && a4 == 4) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 3 && a2 == 4 && a3 == 1 && a4 == 2) {
                System.out.println("Mal placé");
            } else if (a1 == 3 && a2 == 4 && a3 == 2 && a4 == 1) {
                System.out.println("Mal placé");
            } else if (a1 == 3 && a2 == 2 && a3 == 4 && a4 == 1) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 3 && a2 == 2 && a3 == 1 && a4 == 4) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 4 && a2 == 3 && a3 == 2 && a4 == 1) {
                System.out.println("Mal placé");
            } else if (a1 == 4 && a2 == 3 && a3 == 1 && a4 == 2) {
                System.out.println("Mal placé");
            } else if (a1 == 4 && a2 == 1 && a3 == 3 && a4 == 2) {
                System.out.println("Mal placé" + " " + "Bien placé");
            } else if (a1 == 4 && a2 == 1 && a3 == 2 && a4 == 3) {
                System.out.println("Mal placé");
            } else if (a1 == 4 && a2 == 2 && a3 == 3 && a4 == 1) {
                System.out.println("Mal placé" + " " +  "Bien placé");
            } else if (a1 == 4 && a2 == 2 && a3 == 1 && a4 == 3) {
                System.out.println("Mal placé" + " " +  "Bien placé");

            }

            tentatives++;


            if (tentatives == 10) {
                System.out.println("Plus de tentatives");
            }
        } while (tentatives < 10);
        System.out.println("retentez votre chance");

        Sc.close();
    }
}




