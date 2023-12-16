package section06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.solution(8, 32, new int[] { 23, 87, 65, 12, 57, 32, 99, 81 }));
    }
}