package section10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        int n = 7;
        Main.dy = new int[n + 2];
        assertEquals(34, main.solution(7));
    }
}