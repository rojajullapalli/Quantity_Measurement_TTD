public class Length {
    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(Length l1, Length l2) {
        return Double.compare(l1.getValue() * l1.getUnit().baseUnitConversion, l2.getValue() * l2.getUnit().baseUnitConversion) == 0;
    }

    public static double addLengthsToInches(Length l1, Length l2) {
        return l1.getValue() * l1.getUnit().baseUnitConversion + l2.getValue() * l2.getUnit().baseUnitConversion;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
