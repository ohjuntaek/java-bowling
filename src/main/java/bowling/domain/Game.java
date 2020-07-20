package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Point> points;

    public static Game gameStart() {
        return new Game(new ArrayList<>());
    }

    private Game(List<Point> points) {
        this.points = points;
    }

    public void record(int point) {
        points.add(new Point(point));
    }
}
