package ejercicio1;
import java.util.regex.*;

/*
REGEX EXPRESIONS FOR PASSWORDS...
regex = “^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$”

where:

^ represents starting character of the string.
(?=.*[0-9]) represents a digit must occur at least once.
(?=.*[a-z]) represents a lower case alphabet must occur at least once.
(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
(?=\\S+$) white spaces don’t allowed in the entire string.
.{8,20} represents at least 8 characters and at most 20 characters.
$ represents the end of the string.
 */

public class Password {

    protected Pattern pattern;
    protected String password;

    public Password() {
        pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
        password = "";
    }

    public Password(String regex) {
        pattern = Pattern.compile(regex);
        password = "";
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        Matcher matcher = pattern.matcher(password);
        if(matcher.find()) {
            this.password = password;
        } else {
            throw new PasswordException("La contraseña no cumple los requisitos");
        }
    }
}
