package section02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(5, main.solution(8, new int[] { 130, 135, 148, 140, 145, 150, 150, 153 }));
    }

    @Test
    void main() {
    }
}