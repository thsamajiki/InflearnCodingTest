package section10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        int n = 5;
        Main.dy = new int[n];
        assertEquals(10, main.solution(new ArrayList<>(List.of(
                new Brick(25, 3, 4),
                new Brick(4, 4, 6),
                new Brick(9, 2, 3),
                new Brick(16, 2, 5),
                new Brick(1, 5, 2)))));
    }
}