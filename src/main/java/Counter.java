public class Counter {
    private int x = 0;
    private int step;

    public Counter(int s) {
        step = s;
    }

    public void inc() {
        x += step;
    }

    public void dec() {
        x -= step;
    }

    public int read() {
        return x;
    }
}
