package section06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(17, main.solution(9, 3, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
    }
}