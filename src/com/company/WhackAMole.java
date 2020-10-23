package com.company;

public class WhackAMole {

    int score;
    int attemptsLeft;
    String[][] moleGrid;
    int gridLevel = Grid.level;
    public int moleX;
    public int moleY;

    public WhackAMole(int numAttempts, int gridLevel) {
        attemptsLeft = numAttempts;
        if (moleGrid == null) {
            moleGrid = new String[gridLevel][gridLevel];
            initGrid(moleGrid);
        }


            int i;
            int j;

            moleX = (int) (Math.random() * gridLevel-1 );
            moleY = (int) (Math.random() * gridLevel -1 );
            moleGrid[moleX][moleY] = "🐸 ";

            for (i = 0; i < gridLevel; i += 1) {
                System.out.print(i + "  ");

                for (j = 0; j < gridLevel; j += 1) {

                    System.out.print(moleGrid[i][j]);
                }
                System.out.println();
            }
            moleGrid[moleX][moleY] = "- ";

        }



    private void initGrid(String[][] moleGrid) {
        for (int i = 0; i < moleGrid.length; i++) {
            for (int j = 0; j < moleGrid[i].length; j++) {
                moleGrid[i][j] = "- ";
            }
        }
    }

    boolean place(int x , int y) {
        if (x == moleX && y == moleY) {
            System.out.println("Correct answer");
            score++;
            attemptsLeft--;
            return true;
        } else {
            System.out.println("Nope, try  again");
            attemptsLeft--;
            return false;
        }
    }



    public String toString() {
        String status = "";
        status += "Score: " + score;
        status += "\n";
        status += "Attempts Left:" + attemptsLeft;
        status += "\n";
        return status;
    }





}


