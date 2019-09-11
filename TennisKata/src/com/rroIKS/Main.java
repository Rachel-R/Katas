package com.rroIKS;

public class Main {
    public static void main(String[] args) {
        // Interface?
        TennisGame tg = new TennisGame();
        tg.wonPoint("player1");
        System.out.println(tg.getPlayer1().getPlayerName()+ " vs "+tg.getPlayer2().getPlayerName());
        tg.getPlayer1().setPlayerName("Abbott");
        tg.getPlayer2().setPlayerName("Costello");
        System.out.println(tg.getPlayer1().getPlayerName()+ " vs "+tg.getPlayer2().getPlayerName());
        System.out.println(tg.getScore());
    }
}
