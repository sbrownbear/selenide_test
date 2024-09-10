package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {

    @Test
    void SuccessfulTest() {
        Assertions.assertTrue(3>2);
    }
}
