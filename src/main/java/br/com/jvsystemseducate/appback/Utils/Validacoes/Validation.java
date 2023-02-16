package br.com.jvsystemseducate.appback.Utils.Validacoes;

import lombok.Data;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class Validation {
    private List<Erro> errors = new ArrayList<>();

    public void addError(String camp, String message) {
        errors.add(new Erro(camp, message));
    }

    public void hasErrors() {
        if (!errors.isEmpty()) {

            Mesage mesage = new Mesage();

            mesage.setErrors(errors);

            throw new ValidationException(mesage);
        }
    }

    @Data
    public static class Mesage {

        List<Erro> errors = new ArrayList<>();

    }

    @Data
    public static class Erro {
        private String camp;
        private String message;

        public Erro(String camp, String message) {
            super();
            this.camp = camp;
            this.message = message;
        }
    }
}
