public class QuantityException extends Exception{
    enum ExceptionType{
        ENTERED_VALUES_NOT_EQUAL;
    }
    ExceptionType type;
    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
