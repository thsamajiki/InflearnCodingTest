package section04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(143, main.solution(new int[] { 13, 15, 34, 23, 45, 65, 33, 11, 26, 42 }, 10, 3));
    }
}