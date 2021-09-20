public class QuantityMeasurement {

        public boolean convertFeetInch(double feet, int inch) throws QuantityException {
            double feetCoversion = feet * 12;
            if(feetCoversion == inch)
                return true;
            else
                throw new QuantityException(QuantityException.ExceptionType.ENTERED_VALUES_NOT_EQUAL,"please enter values that should be matched");
        }
}
