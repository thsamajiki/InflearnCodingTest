package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(7, main.solution(8, 3));
        assertEquals(20, main.solution(20, 3));
        assertEquals(91, main.solution(100, 3));
        assertEquals(494, main.solution(500, 8));
        assertEquals(212, main.solution(700, 9));
        assertEquals(329, main.solution(1000, 9));
    }

    @Test
    void main() {

    }
}