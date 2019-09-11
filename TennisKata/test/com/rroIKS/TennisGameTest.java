package com.rroIKS;
import org.junit.Test;
import static org.junit.Assert.*;

public class TennisGameTest {

    @Test
    public void checkGameCreationDefaultConstructor(){
        TennisGame tg = new TennisGame();
        assertEquals("Player 1", tg.getPlayer1().getPlayerName());
        assertEquals("Player 2", tg.getPlayer2().getPlayerName());
    }

    @Test
    public void checkGameCreationNameStringsConstructor(){
        TennisGame tg = new TennisGame("Andre", "Steffi");
        assertEquals("Andre", tg.getPlayer1().getPlayerName());
        assertEquals("Steffi", tg.getPlayer2().getPlayerName());
    }

    @Test
    public void checkSetNames(){
        TennisGame tg = new TennisGame();
        tg.getPlayer1().setPlayerName("Serena");
        tg.getPlayer2().setPlayerName("Anna");
        tg.getPlayer2().addPointToScore();
        assertEquals("Serena", tg.getPlayer1().getPlayerName());
        assertEquals("Anna", tg.getPlayer2().getPlayerName());
    }

    @Test
    public void checkWonPointCalculatingCorrectly(){
        TennisGame tg = new TennisGame();
        tg.wonPoint("player1");
        assertEquals(1, tg.getPlayer1().getPlayerScore());
        tg.wonPoint("player2");
        assertEquals(1, tg.getPlayer2().getPlayerScore());
    }

    @Test
    public void checkGetGameScoreReturnNotNull(){
        TennisGame tg = new TennisGame();
        String result = tg.getScore();
        assertNotNull(result);
    }

    @Test
    public void checkGetGameScoreScoreDescriptions(){
        TennisGame tg = new TennisGame();
        String result = tg.getScore();
        assertEquals("Love - Love",result);
    }

    @Test
    public void checkGetGameScoreTwoToOne(){
        TennisGame tg = new TennisGame();
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player2");
        assertEquals("Thirty - Fifteen",tg.getScore());
    }

    @Test
    public void checkGetGameScoreThreeToZero(){
        TennisGame tg = new TennisGame();
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        assertEquals("Forty - Love",tg.getScore());
    }

    @Test
    public void checkGetGameScoreZeroToOne(){
        TennisGame tg = new TennisGame();
        tg.wonPoint("player2");
        assertEquals("Love - Fifteen",tg.getScore());
    }

    @Test
    public void checkGetGameScoreFourToThree(){
        TennisGame tg = new TennisGame("Sid","Nancy");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        assertEquals("Advantage Nancy",tg.getScore());
    }

    @Test
    public void checkGetGameScoreFourToFour(){
        TennisGame tg = new TennisGame("Sid","Nancy");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player1");
        tg.wonPoint("player2");
        assertEquals("Deuce",tg.getScore());
    }


    @Test
    public void checkGetGameScoreThreeToFive(){
        TennisGame tg = new TennisGame("Sid","Nancy");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        assertEquals("Nancy won",tg.getScore());
    }

    @Test (expected = IllegalStateException.class)
    public void checkGetGameScoreFiveToThree(){
        TennisGame tg = new TennisGame("Sid","Nancy");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player1");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
        tg.wonPoint("player2");
    }
}