package bowling.domain;

import java.util.List;

public class Gamer {

    private String name;
    private Game playingGame;

    public void startGame() {
        playingGame = Game.gameStart();
    }

    public void play() {
        int point = swing();
        playingGame.record(point);
    }

    private int swing() {
        return 5;
    }


}
