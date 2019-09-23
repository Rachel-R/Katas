package com.rroIKS;

public class Main {
    public static void main (String[] args){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,true,false,true,false},
                {false,false,false,true,false},
                {false,true,false,true,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        displayGameBoard(gameOfLife.getGameBoard());
        System.out.println("\n");
        gameOfLife.calculateNextGeneration();
        displayGameBoard(gameOfLife.getGameBoard());
    }

    private static void displayGameBoard(boolean[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(boolToInt(gameBoard[i][j]) + "    ");
            }
        }
    }

    private static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }
}
