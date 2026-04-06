public class FinJeu implements InterfaceTennis {

    public String getScore(int player1Score, int player2Score) {
        int diff = player1Score - player2Score;

        if (diff == 1) return "Advantage player1";
        if (diff == -1) return "Advantage player2";
        if (diff >= 2) return "Win for player1";
        return "Win for player2";
    }
}