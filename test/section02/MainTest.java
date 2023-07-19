package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(4, main.solution(5, new int[][] { { 2, 3, 1, 7, 3 },
                                                                        { 4, 1, 9, 6, 8 },
                                                                        { 5, 5, 2, 4, 4 },
                                                                        { 6, 5, 2, 6, 7 },
                                                                        { 8, 4, 2, 2, 2 }
                                                                })
        );
    }

    @Test
    void main() {
    }
}