package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertArrayEquals(new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 }, main.solution(10));
    }

    @Test
    void main() {
    }
}