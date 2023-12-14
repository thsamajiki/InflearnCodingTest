package section06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(List.of(3, 8)), main.solution(9, new int[] { 120, 125, 152, 130, 135, 135, 143, 127, 160 }));
    }
}