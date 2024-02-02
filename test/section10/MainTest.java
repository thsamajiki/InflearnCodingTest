package section10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();

        assertEquals(4, main.solution(new int[] { 5, 3, 7, 8, 6, 2, 9, 4 }));
    }
}