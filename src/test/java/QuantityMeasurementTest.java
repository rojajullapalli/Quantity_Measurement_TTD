import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0Feetand1Feet_ShouldReurnNotEqual() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(1.0);
        Assertions.assertNotEquals(feet,feet1);
    }

    @Test
    void givenNullFeet_WhenCompared_ShouldReturnFalse() {
        Feet feet1 = null;
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotEquals(feet1,feet2);
    }

}
