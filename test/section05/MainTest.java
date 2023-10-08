package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(17, main.solution("()(((()())(())()))(())"));
        assertEquals(24, main.solution("(((()(()()))(())()))(()())"));
    }
}