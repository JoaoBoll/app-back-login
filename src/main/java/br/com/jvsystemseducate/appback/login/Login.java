package br.com.jvsystemseducate.appback.login;

import br.com.jvsystemseducate.appback.Utils.UtilString.UtilString;
import br.com.jvsystemseducate.appback.Utils.Validacoes.Validation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Login {

    @GetMapping("/login")
    public ResponseEntity<String> get(@RequestParam(value = "email", required = false) String email,
                                      @RequestParam(value = "senha", required = false) String senha) throws Exception {

        Validation validacoes = new Validation();

        if (!UtilString.validString(email)) {
            validacoes.addError("email", "E-mail não pode estar nulo");
        }

        if (!UtilString.validString(senha)) {
            validacoes.addError("senha", "Senha não pode estar nula");
        }

        validacoes.hasErrors();



        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @GetMapping("/logout")
    public ResponseEntity<String> teste() {
        return new ResponseEntity<>("deslogado", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register() {
        return new ResponseEntity<>("Registrado", HttpStatus.OK);
    }

}
