package section01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals("K2HS7E", main.solution("KKHSSSSSSSE"));
        assertEquals("KST3SE2KFK3DJ2G2", main.solution("KSTTTSEEKFKKKDJJGG"));
    }
}