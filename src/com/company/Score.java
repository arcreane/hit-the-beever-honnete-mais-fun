package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Score {

    public static void score() {


        // Creation of an array

        String[][] ranking = {
                {"Name1", "Points1"},
                {"Name2", "Points2"},
                {"Name3", "Points3"},
                {"Name4", "Points4"},
                {"Name5", "Points5"},
        };

        // Print the informations in the array
        for (String[] tab: ranking) {
            for (String x: tab) {

                System.out.print(x + " ");
            }
            System.out.println(" ");
        }

    }
}