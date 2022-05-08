import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
class StopwatchTest {


    @Nested
    class EdgeCoverage {

        Stopwatch mainObj;

        @BeforeEach
        public void setup() {
            mainObj = new Stopwatch();
        }

        @Test
        public void Stopwatch1() {
            String[] res = mainObj.input('a');
            assertEquals("Normal", res[0]);
            assertEquals("Date", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Stopwatch2() {
            mainObj.input('a');
            String[] res = mainObj.input('a');
            assertEquals("Normal", res[0]);
            assertEquals("Time", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Stopwatch3() {
            mainObj.input('a');
            mainObj.input('a');
            String[] res = mainObj.input('c');
            assertEquals("Update", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }


    }
}