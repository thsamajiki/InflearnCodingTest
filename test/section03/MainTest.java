package section03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(List.of(2, 3, 5)), main.solution(5, 5, new int[] { 1, 3, 9, 5, 2 }, new int[] { 3, 2, 5, 7, 8 }));
    }
}