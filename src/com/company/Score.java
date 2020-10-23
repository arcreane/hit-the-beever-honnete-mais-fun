package com.company;

/** we have imported in the comparator's list of methods in  in order to rank players' according their scores
 * the Score class with 2 attributes and the Score object with 2 parameters
 * the function "toString()" return the arguments stored in the Score object
 * the SortByDecreasingOrder class hold a function and return the value expected into the Menu class
 * the Menu class will receive the instructions into the function Array.sort() from the SortByDecreasingOder class
 * @param int points, string name
 * @param Score a, Score b
 * */

import java.util.Comparator;

class Score {
    int points;
    String name;

    // 2 attributes of object -> store 2  values
    public Score(int points, String name) {
        this.points = points;
        this.name = name;
    }

    public String toString() {
        return this.points + " " + this.name;
    }
}

class SortByDecreasingOrder implements Comparator<Score> {

    public int compare(Score a, Score b) {
        return b.points - a.points;
    }
}
