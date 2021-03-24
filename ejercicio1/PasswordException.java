package ejercicio1;

public class PasswordException extends Exception {

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException() {
        super("La contraseña no cumple los requisitos");
    }
}
