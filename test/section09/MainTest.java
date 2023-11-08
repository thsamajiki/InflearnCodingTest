package section09;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(150, main.solution(new ArrayList<>(List.of(
                new Lecture(50, 2),
                new Lecture(20, 1),
                new Lecture(40, 2),
                new Lecture(60, 3),
                new Lecture(30, 3),
                new Lecture(30, 1)))));
    }
}