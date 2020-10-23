package com.company;

import java.util.Scanner;

public class Level {


    public static int level() {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Choose the level\n");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");


        switch (input.nextInt()) {
            case 1:
                System.out.println("   0 1 2 3 4");
                WhackAMole whackAMoleEasy = (new WhackAMole(10, 5));


                while (whackAMoleEasy.attemptsLeft > 0) {
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Enter the x and y coordinates of where you would like to take a whack."
                            + "\n" +
                            "You have a maximum of 10 attempts to get all the moles.");
                    System.out.print("x coordinate of the mole: ");
                    int userGuessY = userInput.nextInt();
                    System.out.println("y coordinate of the mole: ");
                    int userGuessX = userInput.nextInt();
                    //System.out.println("");

                    whackAMoleEasy.place(userGuessX, userGuessY);
                    System.out.println(whackAMoleEasy);
                    System.out.println("   0 1 2 3 4");
                    WhackAMole whackAMoleMedium2 = (new WhackAMole(10, 5));
                }
                break;

            case 2:
                System.out.println("   0 1 2 3 4 5 6 7");
                WhackAMole whackAMoleMedium = (new WhackAMole(10, 8));

                while (whackAMoleMedium.attemptsLeft > 0) {
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Enter the x and y coordinates of where you would like to take a whack."
                            + "\n" +
                            "You have a maximum of 10 attempts to get all the moles.");
                    System.out.print("x coordinate of the mole: ");
                    int userGuessY = userInput.nextInt();
                    System.out.println("y coordinate of the mole: ");
                    int userGuessX = userInput.nextInt();
                    //System.out.println("");

                    whackAMoleMedium.place(userGuessX, userGuessY);
                    System.out.println(whackAMoleMedium);
                    System.out.println("   0 1 2 3 4 5 6 7");
                    WhackAMole whackAMoleMedium2 = (new WhackAMole(10, 8));

                }
                break;

            case 3:
                System.out.println("   0 1 2 3 4 5 6 7 8 9");
                WhackAMole whackAMoleHard = (new WhackAMole(10, 10));

                while (whackAMoleHard.attemptsLeft > 0) {
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Enter the x and y coordinates of where you would like to take a whack."
                            + "\n" +
                            "You have a maximum of 10 attempts to get all the moles.");
                    System.out.print("x coordinate of the mole: ");
                    int userGuessY = userInput.nextInt();
                    System.out.println("y coordinate of the mole: ");
                    int userGuessX = userInput.nextInt();
                    //System.out.println("");

                    whackAMoleHard.place(userGuessX, userGuessY);
                    System.out.println(whackAMoleHard);
                    System.out.println("   0 1 2 3 4 5 6 7 8 9");
                    WhackAMole whackAMoleHard2 = (new WhackAMole(10, 10));

                }
                break;

            default:
                System.out.println("Really ? Please retry and be focus");
        }
        return input.nextInt();
    }



}
