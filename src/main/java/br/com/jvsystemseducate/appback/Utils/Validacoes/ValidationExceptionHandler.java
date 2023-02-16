package br.com.jvsystemseducate.appback.Utils.Validacoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<Validation.Mesage> handleValidationException(ValidationException ex) {
        return new ResponseEntity<>(ex.getMesage(), HttpStatus.BAD_REQUEST);
    }
}