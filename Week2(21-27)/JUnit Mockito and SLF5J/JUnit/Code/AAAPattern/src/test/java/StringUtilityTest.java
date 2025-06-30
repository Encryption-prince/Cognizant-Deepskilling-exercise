import org.example.StringUtility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilityTest {

    private StringUtility stringUtils;

    @Before
    public void setUp() {
        stringUtils = new StringUtility();
        System.out.println("🔧 StringUtils instance created");
    }

    // Teardown
    @After
    public void tearDown() {
        stringUtils = null;
        System.out.println("🧹 StringUtils instance destroyed");
    }

    @Test
    public void testReverse() {
        // Arrange
        String input = "hello";
        String expected = "olleh";
        // Act
        String result = stringUtils.reverse(input);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testReverse_NullInput() {
        // Arrange
        String input = null;
        // Act
        String result = stringUtils.reverse(input);
        // Assert
        assertNull(result);
    }

    @Test
    public void testIsPalindrome_True() {
        // Arrange
        String input = "madam";
        // Act
        boolean result = stringUtils.isPalindrome(input);
        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPalindrome_False() {
        // Arrange
        String input = "hello";
        // Act
        boolean result = stringUtils.isPalindrome(input);
        // Assert
        assertFalse(result);
    }
}
