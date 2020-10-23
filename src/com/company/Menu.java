package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static int menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Start a new game");
        System.out.println("2 - View HighScore");
        System.out.println("3 - Quit");


        switch (input.nextInt()) {
            case 1:
                System.out.println("Let's  play if you dare !");
               Level.level();
                break;
            case 2:
                Score[] arr = {new Score(321, "ffff"), new Score(131, "aaaa"), new Score(121, "cccc"), new Score(121, "cccc"), new Score(121, "cccc"), new Score(121, "cccc")};

                Arrays.sort(arr, new SortByDecreasingOrder());

                System.out.println("\nRANKING :" + "\nIf your name appear here, congratulations you made it to the top 5 !\n");
                for (int i = 0; i < 5; i++)
                    System.out.println(arr[i]);
                break;
            case 3:
                System.out.println("We knew that you were afraid, good bye");
                System.exit(0);
                break;
            default:
                System.out.println("Really ? Please retry and be focus");

        }
            return input.nextInt();
        }
    }


