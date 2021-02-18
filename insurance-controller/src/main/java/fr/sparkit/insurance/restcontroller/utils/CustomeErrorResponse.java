package fr.sparkit.insurance.restcontroller.utils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class CustomeErrorResponse {

    private int errorCode;
    private List<Object> errors;
    private String message;

}
