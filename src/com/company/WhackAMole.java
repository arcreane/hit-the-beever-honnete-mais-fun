package com.company;

import java.util.Scanner;

public class WhackAMole {

        int score;
        int molesLeft;
        int attemptsLeft;
        char[][] moleGrid;

        public WhackAMole(int numAttempts, int gridDimension) {
            attemptsLeft = numAttempts;
            moleGrid = new char[gridDimension][gridDimension];
            //construct empty grid
            for(int i = 0; i < gridDimension; i++)
            {
                for(int j = 0; j < gridDimension; j++)
                {
                    moleGrid[i][j] = '□';
                }

            }

        }

        boolean place(int x, int y) {
            if(moleGrid[x][y] == '*')
            {
                moleGrid[x][y] = 'M';
                molesLeft++;
                return true;
            }
            else{
                return false;
            }
        }


        void whack(int x, int y) {
            if(x == -1 && y == -1)
            {
                attemptsLeft = 0;
                printGrid();

            }
            else if(moleGrid[x][y] == 'M')
            {
                moleGrid[x][y] = 'W';
                score++;
                attemptsLeft--;
                molesLeft--;
                printGridToUser();
            }
            else
            {
                attemptsLeft--;
                printGridToUser();
            }
        }

        void printGridToUser() {
            for(int i = 0; i < moleGrid.length; i++)
            {
                for(int j = 0; j < moleGrid.length; j++)
                {
                    if(moleGrid[i][j] == 'W')
                    {
                        System.out.print("W" +" ");
                    }
                    else
                    {
                        System.out.print("*" + " ");
                    }
                }
                System.out.print("\n");
            }
        }

        boolean printGrid() {
            for(int i = 0; i < moleGrid.length; i++)
            {
                for(int j = 0; j < moleGrid.length; j++)
                {
                    System.out.print(moleGrid[i][j] + " ");
                }
                System.out.println("");
            }

            return false;
        }

        public String toString(){
            String status = "";
            status += "Score: " + score;
            status += "\n";
            status += "Moles Left: " + molesLeft;
            status += "\n";
            status += "Attempts Left:" + attemptsLeft;
            return status;
        }



        public static void main(String[] args) {

            WhackAMole game = new WhackAMole(50, 10);
            //randomly place ten moles
            int placedMoles = 0;
            while(placedMoles < 10)
            {
                int randomGuessX = (int)(Math.random()*10);
                int randomGuessY = (int)(Math.random()*10);
                if(game.place(randomGuessX, randomGuessY) == true)
                {
                    placedMoles++;
                }
            }

            while(game.attemptsLeft > 0 && game.molesLeft > 0)
            {
                Scanner userInput = new Scanner(System.in);
                System.out.println("Enter the x and y coordinates of where you would like to take a whack."
                        +"\n"+
                        "You have a maximum of 50 attempts to get all the moles.");
                System.out.print("x coordinate of the mole: ");
                int userGuessX = userInput.nextInt();
                System.out.println("");
                System.out.print("y coordinate of the mole: ");
                int userGuessY = userInput.nextInt();
                game.whack(userGuessX,userGuessY);
            }

        }
    }

