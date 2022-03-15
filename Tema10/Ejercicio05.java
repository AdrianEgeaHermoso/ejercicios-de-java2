import java.util.ArrayList;

public class Ejercicio05 {
    public static void main(String[] args) {

        ArrayList<Disco> discos = new ArrayList<Disco>();

        discos.add(new Disco("5", "Luis", "The Wall", "Rock", 100));
        discos.add(new Disco("7", "Alberto", "Acordes", "Pop", 90));
        discos.add(new Disco("4", "Adrian", "No me pises", "Heavy", 80));
        discos.add(new Disco("16", "Justiniano", "Traviata", "Clasica", 120));
        discos.add(new Disco("11", "Pink", "Aguita Amarilla", "Heavy Metal", 77));

        System.out.println(discos);


        int opcion;
        String codigoNuevo;
        String autorNuevo;
        String tituloNuevo;
        String generoNuevo;
        int duracionNuevo;

        do {
            System.out.println("===================");
            System.out.println("DISCOS GONG");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {

                case 1:
                    System.out.println("===================");
                    System.out.println("LISTADO");
                    System.out.println("===================");

                    for (Disco d : discos) {
                        System.out.println(d);
                    }

                    break;

                case 2:
                    System.out.println("===================");
                    System.out.println("NUEVO DISCO");
                    System.out.println("===================");

                    System.out.println("Por favor, introduzca los datos del disco nuevo");
                    System.out.print("Código: ");
                    codigoNuevo = System.console().readLine();
                    System.out.print("Autor: ");
                    autorNuevo = System.console().readLine();
                    System.out.print("Título: ");
                    tituloNuevo = System.console().readLine();
                    System.out.print("Género: ");
                    generoNuevo = System.console().readLine();
                    System.out.print("Duración: ");
                    duracionNuevo = Integer.parseInt(System.console().readLine());

                    discos.add(new Disco(codigoNuevo, autorNuevo, tituloNuevo, generoNuevo, duracionNuevo));

                    break;

                case 3:
                    System.out.println("===================");
                    System.out.println("MODIFICAR");
                    System.out.println("===================");

                    break;

                case 4:
                    System.out.println("===================");
                    System.out.println("BORRAR");
                    System.out.println("===================");


                    System.out.println("Introduzca el código del disco que desea borrar: ");
                    codigoNuevo = System.console().readLine();

                    discos.remove(discos.indexOf(new Disco(codigoNuevo, "", "", "", 0)));
                    System.out.println("Disco borrado");

                    break;

            }
        } while (opcion != 5);
    }
}
