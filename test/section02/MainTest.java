package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("ABABD", main.solution(5, new int[] { 2, 3, 3, 1, 3 }, new int[] { 1, 1, 2, 2, 3 }));
    }

    @Test
    void main() {
    }
}