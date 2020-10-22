package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userChoiceMenu;
        userChoiceMenu = Menu.menu();

        Grid.position = Grid.initialisationOfTheGrid();
        Grid.displayGrid(Grid.position);


        System.out.println(Grid.position);


    }

}
