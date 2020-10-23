package com.company;

public class Grid {
    //Level
    static int level = 11;

    // Grid
        static int[][] position = new int[level][level];
        static boolean endGame;


        public static int[][] initialisationOfTheHardGrid() {
            int i;
            int j;
            int x;
            int y;
            for (i = 0; i < level; i = i + 1) {
                for (j = 0; j < level; j = j + 1) {
                    position[i][j] = 0;
                }
            }
            x = (int) (Math.random() * level-1);
            y = (int) (Math.random() * level-1);
            position[x][y] = 1 - position[x][y];
            endGame = false;
            return position;
        }

        // Grid based on level hard level
        public static void displayGrid(int[][] situation) {
            int i;
            int j;

            System.out.println("   0 1 2 3 4 5 6 7 8 9");
            for (i = 0; i < level; i += 1) {
                System.out.print(i + "  ");
                for (j = 1; j < 11; j += 1) {
                    if (situation[i][j] == 0) {
                        System.out.print("- ");

                    }  // import de l'image du singe si
                    if (situation[i][j] == 1) {
                        System.out.print("\uD83D\uDC35 ");
                    }
                }
                System.out.println();
            }
        }

    }

