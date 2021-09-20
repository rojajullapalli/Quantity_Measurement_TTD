public class QuantityException extends Exception{
    enum ExceptionType{
        FEET_TO_INCH,
        FEET_TO_YARD;
    }
    ExceptionType type;
    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
