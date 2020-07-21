package bowling;

import bowling.domain.Gamer;

public class App {
    public static void main(String[] args) {
        Gamer gamer = new Gamer("hi");
        gamer.startGame();
        for (int i = 1; i <= 20; i++) {
            gamer.play();
            if (i % 2 == 0) gamer.printPoint(i/2);
        }

    }
}
