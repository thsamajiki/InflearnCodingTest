package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertArrayEquals(new int[] { 4, 3, 2, 1, 5 }, main.solution(5, new int[] { 87, 89, 92, 100, 76 }));
    }

    @Test
    void main() {
    }
}