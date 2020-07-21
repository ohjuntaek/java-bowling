package bowling.domain;

import static bowling.domain.HALF.FIRST_HALF;
import static bowling.domain.HALF.SECOND_HALF;

public class Frame {

    private int[] points;
    private HALF half;

    public static Frame startFrame() {
        return new Frame(new int[]{0, 0}, FIRST_HALF);
    }

    public Frame(int[] points, HALF half) {
        this.points = points;
        this.half = half;
    }

    public void record(int point) {
        points[half.ordinal()] = point;
    }

    public void nextHalf() {
        half = SECOND_HALF;
    }

    public HALF getCurrentHalf() {
        return half;
    }

    public String getResult() {
//        checkFirstHalf();

        return String.format("%s | %s", points[0], points[1]);
    }

    private void checkFirstHalf() {
        if (half != FIRST_HALF) throw new IllegalArgumentException("no");
    }
}
