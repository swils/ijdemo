import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter c = new Counter(1);

    @Test
    void counterDefaultsToZero() {
        assertEquals(c.read(), 0);
    }

    @Test
    void inc() {
        c.inc();
        assertEquals(c.read(), 1);
    }

    @Test
    void dec() {
        c.dec();
        assertEquals(c.read(), -1);
    }

    @Test
    void differentStepSize() {
        c = new Counter(2);
        c.inc();
        assertEquals(c.read(), 2);
    }
}