package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("NO", main.solution("(()(()))(()"));
    }

    @Test
    void main() {
    }
}