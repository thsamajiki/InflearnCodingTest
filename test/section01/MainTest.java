package section01;

import org.junit.jupiter.api.Test;
import section01.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("sTUdy", main.solution("StuDY"));
    }

    @Test
    void main() {
    }
}