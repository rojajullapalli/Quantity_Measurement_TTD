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
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void givenNullFeet_WhenCompared_ShouldReturnFalse() {
        Feet feet1 = null;
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test
    void givenDifferentType_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        FirstFeet feet1 = new FirstFeet(0.0);
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void givensameType_WhenCompared_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assertions.assertEquals(feet, feet1);
    }

    @Test
    void given0Feet1feetForEqualityCheck_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.1);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertFalse(actualValue);
    }

    @Test
    void given0Feet0feetForEqualityCheck_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertTrue(actualValue);
    }

    @Test
    void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(1.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenNullInch__WhenCompared_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        boolean actualValue = inch == inch;
        Assertions.assertTrue(actualValue);
    }

    @Test
    void givenInchWithDiffrentReference_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        boolean actualValue = inch == inch1;
        Assertions.assertFalse(actualValue);
    }

    @Test
    void givenDifferentTypeInch_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        FirstInch inch1 = new FirstInch(0.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givensameTypeInch_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inch1InchForValueEquality_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.1);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given0Inch0InchForValueEquality_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        try {
            boolean convertValue = quantityMeasurement.convertFeetToInch(1.0, 12);
            Assertions.assertEquals(convertValue, true);
        } catch (QuantityException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        try {
            boolean convertValue = quantityMeasurement.convertFeetToyard(3.0, 1);
            Assertions.assertEquals(convertValue, true);
        } catch (QuantityException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
