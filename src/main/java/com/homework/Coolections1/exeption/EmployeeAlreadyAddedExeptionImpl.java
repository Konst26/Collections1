package com.homework.Coolections1.exeption;

public class EmployeeAlreadyAddedExeptionImpl extends EmployeeAlreadyAddedExeption {
    public EmployeeAlreadyAddedExeptionImpl() {
    }

    public EmployeeAlreadyAddedExeptionImpl(String message) {
        super(message);
    }

    public EmployeeAlreadyAddedExeptionImpl(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAlreadyAddedExeptionImpl(Throwable cause) {
        super(cause);
    }

    public EmployeeAlreadyAddedExeptionImpl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
