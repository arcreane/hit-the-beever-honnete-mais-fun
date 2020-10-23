package com.company;
import java.util.Scanner;

public class Quite {
    /** <p>we display the menu and then the user is allowed to pick out an option</p>*/
    /* the condition SWITCH offer 3 possibilities :
    - log into the levels' choices -> lead into the levels' menu
    - view the high score
    - quite the game
     */

    //Starting menu
    public static void menu(Object o){

        Scanner scMenu = new Scanner(System.in);

        //we display the menu
        System.out.println("Faits un choix");

        System.out.println("--------------");
        System.out.println("- N : new game");
        System.out.println("- V : view high score ");
        System.out.println("- q : quite -> understandable... moles can be scary : sucker !");

        //user pick out an option
        char choice = scMenu.next().charAt(0);

        switch (choice){
            case "N" :
                System.out.println();
                break;
            case "V" :
                System.out.println(); // fonction tableau high score ?
            case "Q" :
                System.out.println("Safe call ! you can't compete with moles !");
            default:
                System.out.println("Don't waste my time and make the right choice ...!");
            choice(o: null);
        }
    }
}
