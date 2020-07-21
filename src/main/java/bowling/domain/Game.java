package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Frame> frames;
    private int currentRound;

    public static Game gameStart() {
        ArrayList<Frame> frames = new ArrayList<>();
        frames.add(Frame.startFrame());
        return new Game(frames);
    }

    public Game(List<Frame> frames) {
        this.frames = frames;
    }

    public void record(int point) {
        Frame currentFrame = frames.get(currentRound);

        currentFrame.record(point);
        next();
    }

    public void next() {
        Frame currentFrame = frames.get(currentRound);

        if (currentFrame.getCurrentHalf() == HALF.SECOND_HALF) {
            nextRound();
            return;
        }
        currentFrame.nextHalf();
    }

    private void nextRound() {
        currentRound++;
        frames.add(Frame.startFrame());
    }

    public void printPointOfFrame(int round) {
        System.out.println(frames.get(round - 1).getResult());
    }
}
