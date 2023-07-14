package section01;

import org.junit.jupiter.api.Test;
import section01.Main;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertLinesMatch(Arrays.asList("doog", "emiT", "giB"), main.solution(3, new String[]{ "good", "Time", "Big" }));
    }

    @Test
    void main() {
    }
}