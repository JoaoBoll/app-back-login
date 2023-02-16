package br.com.jvsystemseducate.appback.Utils.UtilString;

import org.springframework.util.StringUtils;

public class UtilString {

    public static Boolean validString(String string) {
        if (!StringUtils.hasText(string)) {
            return false;
        }
        return true;
    }

}
