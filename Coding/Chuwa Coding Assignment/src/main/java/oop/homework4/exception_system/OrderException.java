package oop.homework4.exception_system;

public class OrderException extends RuntimeException {
    private final IErrorCode errorCode;

    public OrderException(IErrorCode errorCode) {
        super(errorCode == null ? null : errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}


