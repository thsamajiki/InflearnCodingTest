package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(10, main.solution(10, new int[] { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 }));
    }

    @Test
    void main() {
    }
}