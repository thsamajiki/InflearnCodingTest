package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.solution(5, 2, new int[] { 60, 50, 70, 80, 90 }));
        assertEquals(4, main.solution(6, 3, new int[] { 70, 60, 90, 60, 60, 60 }));
    }
}