package pl.hajduk.io.exceptions.v3;

public class NoSuchEmployeeException extends RuntimeException{

    public NoSuchEmployeeException(String message)
    {
        super(message);
    }
}
