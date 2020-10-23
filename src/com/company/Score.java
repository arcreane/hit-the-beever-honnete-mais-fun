package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class Score {
    int points;
    String name;


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
        return a.points - b.points;
    }
}