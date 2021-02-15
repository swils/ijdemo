import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter c = new Counter(1);

    @org.junit.jupiter.api.Test
    void counterDefaultsToZero() {
        assertEquals(c.read(), 0);
    }

    @org.junit.jupiter.api.Test
    void inc() {
        c.inc();
        assertEquals(c.read(), 1);
    }

    @org.junit.jupiter.api.Test
    void dec() {
        c.dec();
        assertEquals(c.read(), -1);
    }

    @org.junit.jupiter.api.Test
    void differentStepSize() {
        c = new Counter(2);
        c.inc();
        assertEquals(c.read(), 2);
    }
}