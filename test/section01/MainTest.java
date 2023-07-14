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
        assertEquals(208, main.solution("g0en2T0s8eSoft"));
    }

    @Test
    void main() {
    }
}