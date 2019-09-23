package com.rroIKS;

public class GameOfLife {

    private boolean[][] calculationMatrix;

    GameOfLife(boolean[][] inputGameBoard) {
        this.calculationMatrix = new boolean[inputGameBoard.length + 2][inputGameBoard[0].length + 2];
        for (int i = 0; i < inputGameBoard.length; i++) {
            for (int j = 0; j < inputGameBoard[i].length; j++) {
                calculationMatrix[i + 1][j + 1] = inputGameBoard[i][j];
            }
        }
    }

    public void calculateNextGeneration() {
        boolean[][] tempForNextGeneration = new boolean[calculationMatrix.length][calculationMatrix[0].length];
        for (int i = 1; i < calculationMatrix.length - 1; i++) {
            for (int j = 1; j < calculationMatrix[i].length - 1; j++) {
                tempForNextGeneration[i][j] = isThisCellAliveNextGeneration(i, j);
            }
        }
        calculationMatrix = tempForNextGeneration;
    }

    private boolean isThisCellAliveNextGeneration(int i, int j) {
        int numberOfNeighbors = calculateNumberOfNeighbors(i, j);
        if (calculationMatrix[i][j]) {
            if (numberOfNeighbors <= 1) {
                return false;
            } else {
                return numberOfNeighbors < 4;
            }
        } else {
            return numberOfNeighbors == 3;
        }
    }

    private int calculateNumberOfNeighbors(int x, int y) {
        int neighbors = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (calculationMatrix[i][j]) {
                    neighbors += 1;
                }
            }
        }
        //Loop includes original cell and counts it as a neighbor if it is (true)
        if (calculationMatrix[x][y]) {
            neighbors -= 1;
        }
        return neighbors;
    }


    public boolean[][] getGameBoard() {
        boolean[][] gameBoard = new boolean[calculationMatrix.length - 2][calculationMatrix[0].length - 2];
        for (int i = 1; i < calculationMatrix.length - 1; i++) {
            for (int j = 1; j < calculationMatrix[i].length - 1; j++) {
                gameBoard[i - 1][j - 1] = calculationMatrix[i][j];
            }
        }
        return gameBoard;
    }
}
