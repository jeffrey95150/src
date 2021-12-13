public class Stat {
    private float sum;
    private int count;

    Stat() {
        sum = 0;
        count = 0;
    }

    void update(float note) {
        sum += note;
        count++;
    }

    float getMean() {
        return sum / count;
    }
}
