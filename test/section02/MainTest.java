package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(155, main.solution(5, new int[][] { {10, 13, 10, 12, 15 },
                                                                        {12, 39, 30, 23, 11},
                                                                        {11, 25, 50, 53, 15},
                                                                        {19, 27, 29, 37, 27},
                                                                        {19, 13, 30, 13, 19}
                                                                })
        );
    }

    @Test
    void main() {
    }
}