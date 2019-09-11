package com.rroIKS;

class Player {

    private String playerName;
    private int score = 0;

    Player(String s) {
        playerName = s;
    }

    String getPlayerName() {
        return playerName;
    }

    void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    int getPlayerScore() {
        return score;
    }

    void addPointToScore() {
        score += 1;
    }
}
