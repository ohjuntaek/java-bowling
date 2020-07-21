package bowling.domain;

public class Gamer {

    private final String name;
    private Game playingGame;

    public Gamer(String name) {
        this.name = name;
    }

    public void startGame() {
        playingGame = Game.gameStart();
    }

    public void play() {
        int point = swing();
        playingGame.record(point);
    }

    public void printPoint(int round) {
        playingGame.printPointOfFrame(round);
    }

    private int swing() {
        return 5;
    }
}
