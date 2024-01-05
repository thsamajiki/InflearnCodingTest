package section01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("YES", main.solution("found7, time: study; Yduts; emit, 7Dnuof"));
    }

    @Test
    void main() {
    }
}