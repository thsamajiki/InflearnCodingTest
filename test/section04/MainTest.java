package section04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("YES", main.solution("AbaAeCe", "baeeACA"));
        assertEquals("NO", main.solution("abaCC", "Caaab"));
    }

    @Test
    void main() {
    }
}