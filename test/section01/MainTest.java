package section01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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