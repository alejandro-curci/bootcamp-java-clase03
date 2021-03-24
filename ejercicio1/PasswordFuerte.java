package ejercicio1;

import java.util.regex.Pattern;

public class PasswordFuerte extends Password {
    public PasswordFuerte() {
        super();
        pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
    }
}
