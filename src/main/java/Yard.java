public class Yard {
    private final double value;

    public Yard(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yard yard = (Yard) o;
        return Double.compare(yard.value, value) == 0;
    }

    public double getYardToFeet() {
        double conversion = value * 3;
        return conversion;
    }
}
