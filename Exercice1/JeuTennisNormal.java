public class JeuTennisNormal implements InterfaceTennis {

    public String getScore(int player1Score, int player2Score) {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private String getScoreName(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "";
        }
    }
}