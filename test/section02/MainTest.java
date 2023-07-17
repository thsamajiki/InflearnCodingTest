package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(Arrays.asList(23, 2, 73, 2, 3)), main.solution(9, new int[] { 32, 55, 62, 20, 250, 370, 200, 30, 100 }));
    }

    @Test
    void main() {
    }
}