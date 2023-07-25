package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("YES", main.solution("CBA", "CBDAGE"));
    }

    @Test
    void main() {

    }
}