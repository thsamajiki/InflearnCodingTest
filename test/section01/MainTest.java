package section01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(new ArrayList<>(List.of("doog", "emiT", "giB")), main.solution(3, new String[] { "good", "Time", "Big" }));
    }

    @Test
    void main() {
    }
}