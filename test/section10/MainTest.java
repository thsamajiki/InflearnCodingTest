package section10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Main.m = 20;
        Main.n = 5;
        Main.dy = new int[Main.m + 1];

        assertEquals(41, main.solution(new int[] { 10, 25, 15, 6, 7 }, new int[] { 5, 12, 8, 3, 4 }));
    }
}