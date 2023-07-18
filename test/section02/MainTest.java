package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(10, main.solution(5, new int[][] { { 5, 3, 7, 2, 3 },
                                                                        { 3, 7, 1, 6, 1 },
                                                                        { 7, 2, 5, 3, 4 },
                                                                        { 4, 3, 6, 4, 1 },
                                                                        { 8, 7, 3, 5, 2 }
                                                                })
        );
    }

    @Test
    void main() {
    }
}