package com.Junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static java.util.concurrent.TimeUnit.SECONDS;
class PerformanceTest {
    @Test
    @Timeout(value = 2, unit = SECONDS)
    void testLongRunningTask() throws InterruptedException {
        Thread.sleep(3000); 
    }
}
