package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PasswordFuerte myPass1 = new PasswordFuerte();
        PasswordMedia myPass2 = new PasswordMedia();
        PasswordSimple myPass3 = new PasswordSimple();

        // passwords a testear
        List<String> passList = new ArrayList<>();
        passList.add("HelloWorld!%92");
        passList.add("hello29");
        passList.add("Hello9208");
        passList.add("0123949203");
        passList.add("zzzZZZZ$$$$yyyyyYYYY");

        // password fuerte
        for (String s : passList) {
            try {
                myPass1.setPassword(s);
                System.out.println("La contraseña [ " + s + " ] es fuerte");
            } catch (PasswordException e) {
                e = new PasswordException("La contraseña [ " + s + " ] NO es fuerte");
                System.out.println(e);
            }
        }
        System.out.println();

        // password media
        for (String s : passList) {
            try {
                myPass2.setPassword(s);
                System.out.println("La contraseña [ " + s + " ] es media");
            } catch (PasswordException e) {
                e = new PasswordException("La contraseña [ " + s + " ] NO es media");
                System.out.println(e);
            }
        }
        System.out.println();

        // password simple
        for (String s : passList) {
            try {
                myPass3.setPassword(s);
                System.out.println("La contraseña [ " + s + " ] es simple");
            } catch (PasswordException e) {
                e = new PasswordException("La contraseña [ " + s + " ] NO es simple");
                System.out.println(e);
            }
        }
    }
}
