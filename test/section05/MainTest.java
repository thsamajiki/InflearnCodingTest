package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(4, main.solution(new int[][] {
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 1, 0, 3 },
                    { 0, 2, 5, 0, 1 },
                    { 4, 2, 4, 4, 2 },
                    { 3, 5, 1, 3, 1 }
                },
                    new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }
                )
            );
    }
}