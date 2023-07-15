package section01;

import org.junit.jupiter.api.Test;
import section01.Main;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertArrayEquals(new int[] { 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0 }, main.solution("teachermode", 'e'));
    }

    @Test
    void main() {
    }
}