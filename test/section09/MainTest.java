package section09;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(2, main.solution(new ArrayList<>(List.of(
                new Time(14, 's'), new Time(18, 'e'),
                new Time(12, 's'), new Time(15, 'e'),
                new Time(15, 's'), new Time(20, 'e'),
                new Time(20, 's'), new Time(30, 'e'),
                new Time(5, 's'), new Time(14, 'e')))));
    }
}