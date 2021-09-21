public class QuantityMeasurement {

    public double getFeetToInch(double feet){
        double conversion = feet * 12;
        return conversion;
    }

    public double feetToYard(double yard){
        double conversion = yard * 3;
        return conversion;
    }

    public double inchToYard(double inch){
        double conversion = inch * 36;
        return conversion;
    }

    public boolean compare(double value1, double value2){
        if(value1 == value2)
            return true;
        return false;
    }

}
