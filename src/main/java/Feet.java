import java.util.Objects;

public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public double getFeetToInch(){
        double conversion = value * 12;
        return conversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

}
