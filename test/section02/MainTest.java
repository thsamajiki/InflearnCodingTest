package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(Arrays.asList(7, 9, 6, 12)), main.solution(6, new int[] { 7, 3, 9, 5, 6, 12 }));
    }

    @Test
    void main() {
    }
}