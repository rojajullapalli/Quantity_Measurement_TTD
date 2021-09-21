public class Length {

    private static final double FEET_TO_INCH = 12;
    private static final double FEET_TO_YARD = 3;
    private static final double INCH_TO_YARD = 36;
    private static final double INCH_TO_CENTIMETER = 2.54;
    private final double value;
    private final Unit unit;

    enum Unit {FEET, INCH, YARD, CENTIMETER};

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length value2) {
        if (this.unit.equals(Unit.FEET) && value2.unit.equals(Unit.FEET))
            return Double.compare(this.value, value2.value) == 0;
        if (this.unit.equals(Unit.FEET) && value2.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, value2.value) == 0;
        if (this.unit.equals(Unit.FEET) && value2.unit.equals(Unit.YARD))
            return Double.compare(this.value, value2.value * FEET_TO_YARD) == 0;
        if (this.unit.equals(Unit.INCH) && value2.unit.equals(Unit.YARD))
            return Double.compare(this.value, value2.value * INCH_TO_YARD) == 0;
        if (this.unit.equals(Unit.INCH) && value2.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value * INCH_TO_CENTIMETER, value2.value) == 0;
        return false;
    }

    public double addLengthsToInches(Length value){
        if(this.unit.equals(Unit.INCH) && value.unit.equals(Unit.INCH))
            return this.value + value.value;
        if(this.unit.equals(Unit.FEET) && value.unit.equals(Unit.INCH))
            return (this.value * FEET_TO_INCH) + value.value;
        if(this.unit.equals(Unit.FEET) && value.unit.equals(Unit.FEET))
            return (this.value * FEET_TO_INCH) + (value.value * FEET_TO_INCH);
        if(this.unit.equals(Unit.INCH) && value.unit.equals(Unit.CENTIMETER))
            return (this.value) + (value.value / INCH_TO_CENTIMETER);
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
