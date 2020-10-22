package com.company;

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

    }
}