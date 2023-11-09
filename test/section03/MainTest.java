package section03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(56, main.solution(10, 3, new int[] { 12, 15, 11, 20, 25, 10, 20, 19, 13, 15 }));
    }
}