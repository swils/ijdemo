public class Counter {
    public int x = 0;
    public int step;

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
