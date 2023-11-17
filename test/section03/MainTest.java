package section03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(8, main.solution(14, 2, new int[] { 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 }));
    }
}