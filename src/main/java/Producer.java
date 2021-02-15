public class Producer {
    private Counter c;

    Producer(Counter ctr) {
        c = ctr;
    }

    public void produce() {
        // One of the things it needs to do, is increment an external counter.
        c.inc();
    }
}
