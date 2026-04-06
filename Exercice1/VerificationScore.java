public class VerificationScore implements InterfaceTennis {

    public String getScore(int player1Score, int player2Score) {
        switch (player1Score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            default: return "Deuce";
        }
    }
}