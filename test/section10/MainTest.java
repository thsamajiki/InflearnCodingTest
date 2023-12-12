package section10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Main.m = 15;
        Main.n = 3;
        Main.dy = new int[Main.m + 1];
        Arrays.fill(Main.dy, Integer.MAX_VALUE);
        assertEquals(3, main.solution(new int[] { 1, 2, 5 }));
    }
}