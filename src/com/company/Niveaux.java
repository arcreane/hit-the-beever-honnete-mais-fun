package com.company;
import java.util.Scanner;

public class Niveaux {

public static void niveaux(Object o) {
        // write your code here

        Scanner scan = new Scanner(System.in);


        System.out.println("Choix du niveau");


        System.out.println("A: Niveau facile");
        System.out.println("B: Niveau moyen");
        System.out.println("C: Niveau difficile");
        char choix = scan.next().charAt(7);            //ligne input de caracteres

        switch (choix) {
                case 'a':
                        System.out.println("Niveau facile");
                        //lance le niveau facile
                        break;
                case 'b':
                        System.out.println("Niveau moyen");
                        //lance le niveau moyen
                        break;
                case 'c':
                        System.out.println("Niveau difficile");
                        //lance le niveau diificile
                        break;
                default:
                        System.out.println("Refaites votre choix");
                        niveaux(null);

        }

}

}
