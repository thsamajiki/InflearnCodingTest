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
        assertEquals("S#T!EG*b@a", "a#b!GE*T@S");
    }

    @Test
    void main() {
    }
}