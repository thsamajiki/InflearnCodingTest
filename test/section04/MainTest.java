package section04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(List.of(3, 4, 4, 3)), main.solution(7, 4, new int[] { 20, 12, 20, 10, 23, 17, 10 }));
    }
}