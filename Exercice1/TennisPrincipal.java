public class TennisPrincipal implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    public String getScore() {
        InterfaceTennis strategy;

        if (player1Score == player2Score) {
            strategy = new VerificationScore();
        } else if (player1Score >= 4 || player2Score >= 4) {
            strategy = new FinJeu();
        } else {
            strategy = new JeuTennisNormal();
        }

        return strategy.getScore(player1Score, player2Score);
    }
}