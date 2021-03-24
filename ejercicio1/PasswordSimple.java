package ejercicio1;

import java.util.regex.Pattern;

public class PasswordSimple extends Password {
    public PasswordSimple() {
        super();
        pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{4,10}$");
        // no se requieren letras mayusculas, y se requieren menor cantidad de caracteres
    }
}
