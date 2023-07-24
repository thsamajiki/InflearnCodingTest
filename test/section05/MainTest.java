package section05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(4, main.solution(new int[][] {
                                                                { 0, 0, 0, 0, 0 },
                                                                { 0, 0, 1, 0, 3 },
                                                                { 0, 2, 5, 0, 1 },
                                                                { 4, 2, 4, 4, 2 },
                                                                { 3, 5, 1, 3, 1 }
                                                            },
                                                    new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }
                                                )
        );

        assertEquals(12, main.solution(new int[][] {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3, 1, 0, 0, 1, 2, 0, 0, 1, 0, 3, 1, 0, 0, 1, 2 },
                { 0, 2, 5, 0, 1, 1, 7, 7, 0, 5, 0, 2, 5, 0, 1, 1, 7, 7, 0, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
        },
                new int[] { 1, 5, 3, 5, 1, 2, 1, 4, 3, 4, 7, 8, 9, 7, 8, 1, 15, 13, 5, 1, 12, 11, 14, 13, 14, 17, 18, 19, 17, 18 }));

        assertEquals(16, main.solution(new int[][] {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3, 1, 0, 0, 1, 2, 0, 0, 1, 0, 3, 1, 0, 0, 1, 2, 0, 0, 1, 0, 3, 1, 0, 0, 1, 2 },
                { 0, 2, 5, 0, 1, 1, 7, 7, 0, 5, 0, 2, 5, 0, 1, 1, 7, 7, 0, 5, 0, 2, 5, 0, 1, 1, 7, 7, 0, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 4, 2, 4, 4, 2, 3, 6, 7, 4, 7, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 4, 2, 4, 4, 2, 3, 3, 2, 1, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 },
                { 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5, 3, 5, 1, 3, 1, 3, 5, 7, 3, 5 }
        },
                new int[] { 1, 5, 3, 5, 1, 2, 1, 4, 3, 4, 7, 8, 9, 7, 8, 1, 15, 13, 5, 1, 12, 11, 14, 13, 14, 17, 18, 19, 17, 18, 25, 26, 27, 30, 29, 1, 5, 3, 5, 1, 2, 1, 4, 3, 4, 7, 8, 9, 7, 8, 1, 15, 13, 5, 1, 12, 11, 14, 13, 14, 17, 18, 19, 17, 18, 25, 26, 27, 30, 29 }));
    }

    @Test
    void main() {

    }
}