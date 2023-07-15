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
        assertEquals("K2HS7E", main.solution("KKHSSSSSSSE"));
        assertEquals("KST3SE2KFK3DJ2G2", main.solution("KSTTTSEEKFKKKDJJGG"));
    }

    @Test
    void main() {
    }
}