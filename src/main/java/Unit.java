public enum Unit {
    FEET(1.0),
    FEET_TO_INCH(12.0), INCH(1.0),
    YARD_TO_INCH(36.0),
    CENTIMETER_TO_INCH(0.3937007874015748),
    LITRE(1.0),
    GALLON_TO_LITRE(3.78),
    MILLILITER_TO_LITRE(0.001),
    KILOGRAM(1.0),
    GRAMS_TO_KILOGRAM(1.0 / 1000),
    TONNE_TO_KILOGRAM(1000),
    CELSIUS(1.8),
    FAHRENHEIT(1.8);
    private static final int TEMPERATURE_CONSTANT = 32;
    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(double value, Unit unit, double value1, Unit unit1) {
        return Double.compare(value * unit.baseUnitConversion, value1 * unit1.baseUnitConversion) == 0;
    }

    public static double add(double value, Unit unit, double value1, Unit unit1) {
        return value * unit.baseUnitConversion + value1 * unit1.baseUnitConversion;
    }

    public static Double celTofah(double value, Unit temperature) {
        if (temperature == Unit.FAHRENHEIT)
            return (value - TEMPERATURE_CONSTANT) / Unit.CELSIUS.baseUnitConversion;
        return (value * Unit.FAHRENHEIT.baseUnitConversion) + TEMPERATURE_CONSTANT;
    }

}
