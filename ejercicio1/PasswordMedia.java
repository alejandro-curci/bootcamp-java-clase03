package ejercicio1;

import java.util.regex.Pattern;

public class PasswordMedia extends Password {
    public PasswordMedia() {
        super();
        pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,12}$");
        // no se requieren caracteres especiales, y se requieren menor cantidad de caracteres
    }
}
