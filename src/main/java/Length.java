public class Length {

    private static final double FEET_TO_INCH = 12;
    private static final double FEET_TO_YARD = 3;
    private static final double INCH_TO_YARD = 36;
    private static final double INCH_TO_CENTIMETER = 2.54;
    private static final double GALLON_TO_LITRES = 3.78;
    private static final double LITRES_TO_MILLILITER = 1000;
    private static final double KILOGRAM_TO_GRAM = 1000;
    private static final double TONNE_TO_KILOGRAM = 1000;
    private final double value;
    private final Unit unit;


    enum Unit {FEET, INCH, YARD, CENTIMETER, GALLON, LITRES, MILLILITER, GRAM, TONNE, KILOGRAM};

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
        if (this.unit.equals(Unit.GALLON) && value2.unit.equals(Unit.LITRES))
            return Double.compare(this.value * GALLON_TO_LITRES, value2.value) == 0;
        if (this.unit.equals(Unit.LITRES) && value2.unit.equals(Unit.MILLILITER))
            return Double.compare(this.value * LITRES_TO_MILLILITER, value2.value) == 0;
        if (this.unit.equals(Unit.KILOGRAM) && value2.unit.equals(Unit.GRAM))
            return Double.compare(this.value * KILOGRAM_TO_GRAM, value2.value) == 0;
        if (this.unit.equals(Unit.TONNE) && value2.unit.equals(Unit.KILOGRAM))
            return Double.compare(this.value * TONNE_TO_KILOGRAM, value2.value) == 0;
        return false;
    }

    public double addLengthsToInches(Length inch){
        if(this.unit.equals(Unit.INCH) && inch.unit.equals(Unit.INCH))
            return this.value + inch.value;
        if(this.unit.equals(Unit.FEET) && inch.unit.equals(Unit.INCH))
            return (this.value * FEET_TO_INCH) + inch.value;
        if(this.unit.equals(Unit.FEET) && inch.unit.equals(Unit.FEET))
            return (this.value * FEET_TO_INCH) + (inch.value * FEET_TO_INCH);
        if(this.unit.equals(Unit.INCH) && inch.unit.equals(Unit.CENTIMETER))
            return (this.value) + (inch.value / INCH_TO_CENTIMETER);
        return 0;
    }

    public double addVolumesToLitres(Length litres) {
        if(this.unit.equals(Unit.GALLON) && litres.unit.equals(Unit.LITRES))
            return (this.value * GALLON_TO_LITRES) + litres.value;
        if(this.unit.equals(Unit.LITRES) && litres.unit.equals(Unit.MILLILITER))
            return (this.value * LITRES_TO_MILLILITER) + litres.value;
        if(this.unit.equals(Unit.TONNE) && litres.unit.equals(Unit.GRAM))
            return (this.value * TONNE_TO_KILOGRAM) + (litres.value / KILOGRAM_TO_GRAM);
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
