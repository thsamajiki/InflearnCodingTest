package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("EFLM", main.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }

    @Test
    void main() {
    }
}