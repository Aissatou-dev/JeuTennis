public class Main {
    public static void main(String[] args) {

        TennisPrincipal game = new TennisPrincipal();

        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player1");

        System.out.println(game.getScore());
    }
}
