package com.rroIKS;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test
    public void checkBoardExistence(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        boolean[][] expected = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkDeathByIsolationZeroNeighbors() {
        boolean[][] board = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, true,  false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkDeathByIsolationOneNeighbor(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,true,true,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkBirth(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,true,true,false,false},
                {false,true,false,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,false,false,false},
                {false,true,true,false,false},
                {false,true,true,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkDeathByOvercrowdingFourNeighbors(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,true,true,true,false},
                {false,true,true,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean [][] expected = new boolean[][]{
                {false,false,true,false,false},
                {false,true,false,true,false},
                {false,true,false,true,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkDeathByOvercrowdingFiveNeighbors(){
      boolean[][] board = new boolean[][]{
              {false,false,false,false,false},
              {false,true,true,true,false},
              {false,true,true,true,false},
              {false,false,false,false,false},
              {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,true,false,false},
                {false,true,false,true,false},
                {false,true,false,true,false},
                {false,false,true,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkSurvivalTwoNeighbors(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,true,false},
                {false,false,true,false,false},
                {false,true,false,false,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,false,false},
                {false,false,true,false,false},
                {false,false,false,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkSurvivalThreeNeighbors(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,true,false},
                {false,false,true,true,false},
                {false,true,false,false,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,false,false,false},
                {false,false,true,true,false},
                {false,false,true,true,false},
                {false,false,true,false,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }

    @Test
    public void checkRulesPredictSixthGeneration(){
        boolean[][] board = new boolean[][]{
                {false,false,false,false,false},
                {false,true,false,true,false},
                {false,false,false,true,false},
                {false,true,false,true,false},
                {false,false,false,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        gameOfLife.calculateNextGeneration();
        gameOfLife.calculateNextGeneration();
        gameOfLife.calculateNextGeneration();
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,false,false,false},
                {false,false,false,true,false},
                {false,true,true,false,true},
                {false,false,false,true,false},
                {false,false,false,false,false}};
        assertArrayEquals(expected, gameOfLife.getGameBoard());
    }
}
