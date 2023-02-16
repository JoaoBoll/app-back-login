package br.com.jvsystemseducate.appback.Utils.Validacoes;

import lombok.Data;

@Data
public class ValidationException extends RuntimeException {
    private Validation.Mesage mesage;

    public ValidationException(Validation.Mesage mesage) {
        this.mesage = mesage;
    }
}