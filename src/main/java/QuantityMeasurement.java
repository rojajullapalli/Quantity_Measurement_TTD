public class QuantityMeasurement {

    public boolean convertFeetToInch(double feet, int inch) {
        double feetConversion = feet * 12;
        if (feetConversion == inch)
            return true;
        return false;
    }

    public boolean convertFeetToyard(double feet, int yard) {
        double feetCoversion = yard * 3;
        if (feetCoversion == feet)
            return true;
        return false;
    }

}
