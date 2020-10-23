package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int selection;

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Start a new game");
        System.out.println("2 - View HighScore");
        System.out.println("3 - Quit");

        selection = input.nextInt();


        if (selection == 2) {
            ;
            Score[] arr = {new Score(321, "ffff"), new Score(131, "aaaa"), new Score(121, "cccc"), new Score(121, "cccc"), new Score(121, "cccc"), new Score(121, "cccc")};

            Arrays.sort(arr, new SortByDecreasingOrder());

            System.out.println("\nRANKING :" + "\nIf your name appear here, congratulations you made it to the top 5 !\n");

            for (int i = 0; i < 5; i++)
                System.out.println(arr[i]);
        }
        return selection;
    }
}