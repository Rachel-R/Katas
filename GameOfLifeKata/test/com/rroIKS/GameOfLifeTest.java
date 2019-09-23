package com.rroIKS;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test
    public void checkFail(){
       // fail();
    }

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
    public void checkRule2DeathByIsolationZeroNeighbors() {
        boolean[][] board = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, true, false, false},
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
    public void checkRule2DeathByIsolationOneNeighbor(){
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
    public void checkRule1Birth(){
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
    public void checkRule3DeathByOvercrowdingFourNeighbors(){
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
    public void checkRule3DeathByOvercrowdingFiveNeighbors(){
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
    public void checkRule4SurvivalTwoNeighbors(){
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
    public void checkRule4SurvivalThreeNeighbors(){
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
    public void checkCalculateNextGeneration(){
        boolean[][] board = new boolean[][]{
                {false,false,true,false,false},
                {false,true,false,true,false},
                {true,false,false,true,false},
                {false,true,false,false,false},
                {false,false,true,false,false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        gameOfLife.calculateNextGeneration();
        boolean[][] expected = new boolean[][]{
                {false,false,true,false,false},
                {false,true,false,true,false},
                {true,true,false,false,false},
                {false,true,true,false,false},
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
