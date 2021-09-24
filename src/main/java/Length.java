public class Length {
    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Double unitConversion(double value, Unit temperature) {
        return Unit.celTofah(value, temperature);
    }

    public boolean compare(Length l2) {
        return Unit.compare(this.value, this.unit, l2.value, l2.unit);
    }

    public double add(Length l2) {
        return Unit.add(this.value, this.unit, l2.value, l2.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
