package section09;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.solution(new ArrayList<>(List.of(new Time(1, 4), new Time(2, 3), new Time(3, 5), new Time(4, 6), new Time(5, 7))), 5));
        assertEquals(2, main.solution(new ArrayList<>(List.of(new Time(3, 3), new Time(1, 3), new Time(2, 3))), 3));
    }
}