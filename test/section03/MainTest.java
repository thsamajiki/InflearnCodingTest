package section03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.solution(8, 6, new int[] { 1, 2, 1, 3, 1, 1, 1, 2 }));
    }
}