package section01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertArrayEquals(new int[] { 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0 }, main.solution("teachermode", 'e'));
    }
}