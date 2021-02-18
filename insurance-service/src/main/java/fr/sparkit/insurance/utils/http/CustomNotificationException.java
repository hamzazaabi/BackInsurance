package fr.sparkit.insurance.utils.http;

import fr.sparkit.insurance.utils.errors.ErrorsResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomNotificationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private int errorCode;
    private ErrorsResponse errorsResponse;

    public CustomNotificationException(int errorCode) {
        super();
        this.errorCode = errorCode;
        this.errorsResponse = new ErrorsResponse();
    }

    public CustomNotificationException(int errorCode, ErrorsResponse errorsResponse) {
        super();
        this.errorCode = errorCode;
        this.errorsResponse = errorsResponse;
    }


}