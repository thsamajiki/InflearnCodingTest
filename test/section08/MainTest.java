package section08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(10, main.DFS(5, 3));
        assertEquals(818809200, main.DFS(33, 19));
    }
}