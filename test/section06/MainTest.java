package section06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("D", main.solution(8, new int[] { 20, 25, 52, 30, 39, 33, 43, 33 }));
    }
}