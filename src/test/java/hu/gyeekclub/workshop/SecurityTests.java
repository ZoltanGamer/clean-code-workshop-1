package hu.gyeekclub.workshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

// these tests test for code security: how much code allows itself to be misused
// As a wise man once said: thou shalt make thine code resilient to tardiness!
public class SecurityTests {

    @Test
    public void nullConstructorTest() {
        assertThrows(
            IllegalArgumentException.class,
            () -> {
                new Customer(null);
                new ChildrenMovie(null);
                new Rental(null, 0);
            },
            "Do not allow null parameters to stay unpunished."
        );
    }

    @Test
    public void nullParameterTest() {
        assertThrows(
            IllegalArgumentException.class,
            () -> {
                new Customer("Test").addRental(null);
            },
            "No not allow null parameters to stay unpunished."
        );
    }
}
