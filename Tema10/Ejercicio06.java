import java.util.HashMap;

public class Ejercicio06 {

    public static void main(String[] args) {

        HashMap<String, String> p = new HashMap<String, String>();

        String user;
        String password;
        int attempts = 3;
        int access = 0;

        p.put("Adrian", "1234");
        p.put("Fran", "1313");
        p.put("Luis", "4321");
        p.put("Alvaro", "4789");
        p.put("Joseph", "3636");

        System.out.println("Introduzca nombre de usuario y contraseña: ");

        do {
            System.out.println("Usuario: ");
            user = System.console().readLine();
            System.out.println("Contraseña: ");
            password = System.console().readLine();

            attempts--;

            if (p.get(user).equals(password)) {
                System.out.println("Ha accedido al área restringida");
                access ++;
            } else {
                System.out.println("Lo siento, no tiene acceso al área restringida");
                System.out.println("Le quedan " + attempts + " intentos");
            }



        } while ((attempts != 0) && (access != 1));

    }
}