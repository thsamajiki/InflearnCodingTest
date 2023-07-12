import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(2, main.solution("Computercooler", 'c'));
    }

    @Test
    void main() {
    }
}