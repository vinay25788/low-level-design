package exception;

import java.time.LocalDate;

public class InvalidDateRangeException extends RuntimeException {

    public InvalidDateRangeException(LocalDate startDate, LocalDate endDate)
    {
        super("Invalid Date range "+ startDate +" -> "+ endDate);
    }
}
