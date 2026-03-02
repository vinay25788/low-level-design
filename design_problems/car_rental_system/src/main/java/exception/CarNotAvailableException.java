package exception;

public class CarNotAvailableException extends RuntimeException{

    public CarNotAvailableException(String msg)
    {
        super(msg);
    }
}
