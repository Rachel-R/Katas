package com.rroIKS;

class TennisGame {


    private Player player1 = new Player("Player 1");
    private Player player2 = new Player("Player 2");

    TennisGame() {
    }

    TennisGame(String name1, String name2) {
        player1.setPlayerName(name1);
        player2.setPlayerName(name2);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void wonPoint(String s) {
        if (s.equals("player1")) {
            isValidWonPoint(player1, player2);
            player1.addPointToScore();
        } else {
            isValidWonPoint(player2, player1);
            player2.addPointToScore();
        }
    }

    private void isValidWonPoint(Player scoringPlayer, Player otherPlayer) {
        if (scoringPlayer.getPlayerScore() > 3 && Math.abs((scoringPlayer.getPlayerScore() - otherPlayer.getPlayerScore())) >= 2) {
            throw new IllegalStateException("Unexpected value for Player score: " + scoringPlayer.getPlayerScore());
        }
    }

    public String getScore() {
        StringBuilder sb = new StringBuilder();

        if (player1.getPlayerScore() > 3 || player2.getPlayerScore() > 3) {
            if (Math.abs((player1.getPlayerScore() - player2.getPlayerScore())) >= 2) {
                sb.append(getCurrentLeadingPlayer().getPlayerName()).append(" won");
            } else if (player1.getPlayerScore() == player2.getPlayerScore()) {
                sb.append("Deuce");
            } else {
                sb.append("Advantage ").append(getCurrentLeadingPlayer().getPlayerName());
            }
        } else {
            sb.append(getDescriptivePlayerScore(player1)).append(" - ").append(getDescriptivePlayerScore(player2));
        }

        return sb.toString();
    }

    private Player getCurrentLeadingPlayer() {
        return (player1.getPlayerScore() > player2.getPlayerScore()) ? player1 : player2;
    }

    private String getDescriptivePlayerScore(Player player) throws IllegalStateException {
        String score;
        switch (player.getPlayerScore()) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
            default:
                throw new IllegalStateException("Unexpected value for Player score: " + player.getPlayerScore());
        }
        return score;
    }
}