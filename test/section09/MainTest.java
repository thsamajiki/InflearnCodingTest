package section09;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.solution(new ArrayList<>(List.of(new Body(172, 67), new Body(183, 65), new Body(180, 70), new Body(170, 72), new Body(181, 60))), 5));
    }
}