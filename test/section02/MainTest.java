package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(3, main.solution(4, 3, new int[][] { { 3, 4, 1, 2 },
                                                                        { 4, 3, 2, 1 },
                                                                        { 3, 1, 4, 2 }
                                                                })
        );
    }

    @Test
    void main() {
    }
}