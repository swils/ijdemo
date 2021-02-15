import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProducerTest {
    @Test
    void produceIncrementsCounter() {
        // Let's test that a single produce call increments the counter.
        // (E.g. under the assumption that dealing with an actual counter is very difficult in the frame,
        // or that it crosses structural boundaries.)
        Counter c = mock(Counter.class);
        Producer p = new Producer(c);
        p.produce();
        verify(c).inc();
    }
}