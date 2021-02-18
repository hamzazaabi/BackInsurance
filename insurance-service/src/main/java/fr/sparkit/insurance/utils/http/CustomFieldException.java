package fr.sparkit.insurance.utils.http;

import fr.sparkit.insurance.utils.errors.ErrorsResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomFieldException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final int errorCode;
    private final ErrorsResponse errorsResponse;

    public CustomFieldException(int errorCode) {
        this.errorCode = errorCode;
        this.errorsResponse = new ErrorsResponse();

    }
}
