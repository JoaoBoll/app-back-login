package br.com.jvsystemseducate.appback.login;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public static String generatePassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean comparePassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }


}
