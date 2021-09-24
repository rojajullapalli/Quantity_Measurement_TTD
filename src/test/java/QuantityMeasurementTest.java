import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0Feetand1Feet_ShouldReurnNotEqual() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length feet1 = new Length(Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    void givenNullFeet_WhenCompared_ShouldReturnFalse() {
        Length feet1 = null;
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 0.0);
        Assertions.assertSame(feet, feet);
    }

    @Test
    void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length feet1 = new Length(Unit.FEET, 0.0);
        Assertions.assertNotSame(feet, feet1);
    }

    @Test
    void givenDifferentType_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 0.0);
        FirstLength feet1 = new FirstLength(FirstLength.Unit.INCH, 0.0);
        Assertions.assertNotSame(feet.getClass(), feet1.getClass());
    }

    @Test
    void givensameType_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length feet1 = new Length(Unit.FEET, 0.0);
        Assertions.assertSame(feet.getClass(), feet1.getClass());
    }

    @Test
    void given0Feet1feetForEqualityCheck_ShouldReturnFalse() {
        Length feet = new Length(Unit.INCH, 0.0);
        Length feet1 = new Length(Unit.INCH, 0.1);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertFalse(actualValue);
    }

    @Test
    void given0Feet0feetForEqualityCheck_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length feet1 = new Length(Unit.FEET, 0.0);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertTrue(actualValue);
    }

    @Test
    void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenNullInch__WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0.0);
        Assertions.assertSame(inch, inch);
    }

    @Test
    void givenInchWithDiffrentReference_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        Assertions.assertNotSame(inch, inch1);
    }

    @Test
    void givenDifferentTypeInch_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 0.0);
        FirstLength inch1 = new FirstLength(FirstLength.Unit.INCH, 0.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givensameTypeInch_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inch1InchForValueEquality_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.1);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given0Inch0InchForValueEquality_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0FeetAnd0Inch_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length inch = new Length(Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Inch_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length inch = new Length(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET_TO_INCH, 0.0);
        Length feet2 = new Length(Unit.FEET_TO_INCH, 0.0);
        boolean compareCheck = feet1.equals(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3FeetAnd1Yard_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET_TO_INCH, 3.0);
        Length yard = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length yard = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length yard = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 36.0);
        Length yard = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD_TO_INCH, 1.0);
        Length inch = new Length(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD_TO_INCH, 1.0);
        Length feet = new Length(Unit.FEET_TO_INCH, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd5Centimeter_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length centimeter = new Length(Unit.CENTIMETER_TO_INCH, 5.08);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdd_ShouldReturnFourInches() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length inch1 = new Length(Unit.INCH, 2.0);
        double add = inch.add(inch1);
        Assertions.assertEquals(add, 4);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdd_ShouldReturnFourTeenInches() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length inch = new Length(Unit.INCH, 2.0);
        double add = feet.add(inch);
        Assertions.assertEquals(add, 14);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdd_ShouldReturnTwentyFourInches() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length feet1 = new Length(Unit.FEET_TO_INCH, 1.0);
        double add = feet.add(feet1);
        Assertions.assertEquals(add, 24);
    }

    @Test
    void given2InchAnd2AndHalfCentimeter_WhenAdd_ShouldReturn3Inches() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length centimeter = new Length(Unit.CENTIMETER_TO_INCH, 2.54);
        double add = inch.add(centimeter);
        Assertions.assertEquals(add, 3);
    }

    @Test
    void given1GallonAnd3And78Litres_ShouldReturnTrue() {
        Length gallon = new Length(Unit.GALLON_TO_LITRE, 1.0);
        Length litre = new Length(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LitreAnd3And1000Ml_ShouldReturnTrue() {
        Length litre = new Length(Unit.LITRE, 1);
        Length millilitre = new Length(Unit.MILLILITER_TO_LITRE, 1000.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2GallonAnd3And78Litres_WhenAdd_ShouldReturn7And57Litres() {
        Length gallon = new Length(Unit.GALLON_TO_LITRE, 1.0);
        Length litres = new Length(Unit.LITRE, 3.78);
        double add = gallon.add(litres);
        Assertions.assertEquals(add, 7.56);
    }

    @Test
    void given1MilliLitreAnd1Litres_WhenAdd_ShouldReturn1000Litres() {
        Length litre = new Length(Unit.LITRE, 1);
        Length millilitre = new Length(Unit.MILLILITER_TO_LITRE, 1000.0);
        double add = litre.add(millilitre);
        Assertions.assertEquals(add, 2);
    }

    @Test
    void given1KgAnd100Grams_ShouldReturnTrue() {
        Length kilogram = new Length(Unit.KILOGRAM, 1);
        Length gram = new Length(Unit.GRAMS_TO_KILOGRAM, 1000.0);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Kg_ShouldReturnTrue() {
        Length tonne = new Length(Unit.TONNE_TO_KILOGRAM, 1.0);
        Length kilogram = new Length(Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001Kg() {
        Length tonne = new Length(Unit.TONNE_TO_KILOGRAM, 1.0);
        Length gram = new Length(Unit.GRAMS_TO_KILOGRAM, 1000.0);
        double add = tonne.add(gram);
        Assertions.assertEquals(add, 1001);
    }

    @Test
    void given212FahrenheitAnd100Celsius_ShouldReturnTrue() {
        Length fah = new Length(Unit.FAHRENHEIT, 212.0);
        double compareCheck = fah.unitConversion(212.0, Unit.FAHRENHEIT);
        Assertions.assertEquals(compareCheck, 100);
    }

    @Test
    void given100CelsiusAnd212Fahrenheit_ShouldReturnTrue() {
        Length cel = new Length(Unit.CELSIUS, 100.0);
        double compareCheck = cel.unitConversion(100.0, Unit.CELSIUS);
        Assertions.assertEquals(compareCheck, 212.0);
    }

}
