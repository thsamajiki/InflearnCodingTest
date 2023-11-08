package section03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(List.of(1, 2, 3, 3, 5, 6, 7, 9)), main.solution(3, 5, new int[] { 1, 3, 5 }, new int[] { 2, 3, 6, 7, 9 }));
    }
}