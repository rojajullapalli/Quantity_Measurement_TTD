import java.util.Objects;

public class FirstLength {

    private final Unit unit;
    private final double value;

    enum Unit {FEET, INCH, YARD};

    public FirstLength(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstLength that = (FirstLength) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }

}
