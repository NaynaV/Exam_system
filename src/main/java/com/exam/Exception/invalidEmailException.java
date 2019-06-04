package com.exam.Exception;

public class invalidEmailException extends RuntimeException
{
    private String message;

    public invalidEmailException(String message)
    {
        super(message);
        this.message=message;
    }

    @Override
    public String toString() {
        return message;
    }
}
