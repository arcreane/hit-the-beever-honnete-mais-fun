package com.company;

/** We upload into the Menu class, 2 methods' lists included in the Arrays' and the Scanner class*/

import java.util.Arrays;
import java.util.Scanner;

/** The Menu class is used by the player to choose between "start a new game" or View High Score or
 *  The input object created from the Scanner class means that Java is awaiting an action from the user
 * */


public class Menu {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("WHACK A FROG 🐸");
        System.out.println("-------------------------");
        System.out.println("-------------------------\n");

        System.out.println("Choose from these choices");
        System.out.println("-------------------------");
        System.out.println("1 - Start a new game");
        System.out.println("2 - View HighScore");
        System.out.println("3 - Quit");

        System.out.println("-------------------------\n");

        /** the Switch condition expect a choice from the player between 3 cases
         * Case 1 holds a "level function that leads to the Level class that store 3 levels of difficulties
         * Case 2 holds an array listing the scores related to the player's name
         * @param input.nextInt()
         * @return input.nextInt()
         * @param status
         * */

        switch (input.nextInt()) {
            case 1:
                System.out.println("Let's  play if you dare !");
               Level.level();
                break;
            case 2:
                Score[] arr = {new Score(321, "ffff"), new Score(131, "aaaa"), new Score(121, "cccc"), new Score(121, "cccc"), new Score(121, "cccc"), new Score(121, "cccc")};

                Arrays.sort(arr, new SortByDecreasingOrder());

                System.out.println("\nIf your name appear here, congratulations you made it to the top 5 !\n");
                for (int i = 0; i < 5; i++)
                    System.out.println(arr[i]);
                break;
            case 3:
                System.out.println("We knew that you were afraid, goodbye ! \n\n"+"----- Si JAVA bien, c'est JAVAmine! -----");
                System.exit(0);
                break;
            default:
                System.out.println("Really ? Please, retry and be focus");

        }
            return input.nextInt();
        }
    }


