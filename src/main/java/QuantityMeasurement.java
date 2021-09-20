public class QuantityMeasurement {

    public boolean convertFeetToInch(double feet, int inch) throws QuantityException {
        double feetConversion = feet * 12;
        if (feetConversion != inch)
            throw new QuantityException(QuantityException.ExceptionType.FEET_TO_INCH, "please enter values that should be matched");
        return true;
    }

    public boolean convertFeetToyard(double feet, int yard) throws QuantityException {
        double feetCoversion = yard * 3;
        if (feetCoversion != feet)
            throw new QuantityException(QuantityException.ExceptionType.FEET_TO_YARD, "please enter values that should be matched");
        return true;
    }

}
