import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0Feetand1Feet_ShouldReurnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void givenNullFeet_WhenCompared_ShouldReturnFalse() {
        Length feet1 = null;
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertSame(feet,feet);
    }

    @Test
    void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertNotSame(feet,feet1);
    }

    @Test
    void givenDifferentType_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        FirstLength feet1 = new FirstLength(FirstLength.Unit.INCH, 0.0);
        Assertions.assertNotSame(feet.getClass(), feet1.getClass());
    }

    @Test
    void givensameType_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertSame(feet.getClass(), feet1.getClass());
    }

    @Test
    void given0Feet1feetForEqualityCheck_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.INCH, 0.0);
        Length feet1 = new Length(Length.Unit.INCH, 0.1);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertFalse(actualValue);
    }

    @Test
    void given0Feet0feetForEqualityCheck_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertTrue(actualValue);
    }

    @Test
    void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenNullInch__WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertSame(inch,inch);
    }

    @Test
    void givenInchWithDiffrentReference_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertNotSame(inch,inch1);
    }

    @Test
    void givenDifferentTypeInch_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        FirstLength inch1 = new FirstLength(FirstLength.Unit.INCH,0.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givensameTypeInch_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inch1InchForValueEquality_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.1);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given0Inch0InchForValueEquality_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0FeetAnd0Inch_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Inch_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3FeetAnd1Yard_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd5Centimeter_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 5.08);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }
}
