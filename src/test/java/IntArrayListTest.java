import arraylist.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntArrayListTest {

    private IntArrayList testee;

    @BeforeEach
    void setUp() {
        testee = new IntArrayList();
    }

    @Test
    void when_5_add_then_no_exception_occurs() {
        testee.add(5);
    }

    // Test will fail, because the array is 10 chars long and we add 11 chars
    @Test
    void when_11_numbers_added_then_no_exception_occurs() {
        for (int i = 1; i <= 11; i++) {
            testee.add(i);
        }
    }

    @Test
    void size_when_11_numbers_added_then_size_is_11() {
        setupWithDefaultTestData();
        int actual = testee.size();
        assertEquals(11, actual);
    }

    @Test
    void contains_when_numbers_is_in_list_then_return_true() {
        setupWithDefaultTestData();
        assertTrue( testee.contains(5));
    }

    @Test
    void contains_when_numbers_is_not_in_list_then_return_false() {
        setupWithDefaultTestData();
        assertFalse( testee.contains(12));
    }

    private void setupWithDefaultTestData(){
        for (int i = 0; i < 11; i++) {
            testee.add(i);
        }
    }

}
