package section04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals('C', main.solution(15, "BACBACCACCBDEDE"));
    }

    @Test
    void main() {
    }
}