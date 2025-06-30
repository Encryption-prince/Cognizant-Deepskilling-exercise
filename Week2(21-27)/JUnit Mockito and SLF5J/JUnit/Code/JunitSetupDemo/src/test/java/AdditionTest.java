import org.example.Addition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        Addition addition = new Addition();
        int a = 2;
        int b = 3;
        int result = addition.add(a, b);
        assertEquals(5, result);
    }
}
