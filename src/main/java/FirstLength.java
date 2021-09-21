import java.util.Objects;

public class FirstLength {

    private final Unit unit;
    private final double value;

    enum Unit {FEET, INCH, YARD};

    public FirstLength(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    
}
