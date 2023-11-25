package section07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.DFS(10));
    }

    @Test
    void main() {
    }
}