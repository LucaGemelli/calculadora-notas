package br.com.pucrs.calculadoranotas.exception;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ExceptionDetails {

    private int status;
    private String time;
    private List<String> errors;
}
