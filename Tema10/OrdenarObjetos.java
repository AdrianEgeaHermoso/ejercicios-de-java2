import java.util.ArrayList;
import java.util.Collections;

public class OrdenarObjetos {
    public static void main(String[] args) {


        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(new Alumno("Egea", "Adrian"));
        alumnos.add(new Alumno("Alvarez", "Francisco"));
        alumnos.add(new Alumno("Bernardo", "Bueno"));
        alumnos.add(new Alumno("Perez", "Alberto"));
        alumnos.add(new Alumno("Perez", "Adrian"));


        System.out.println(alumnos);


        Collections.sort(alumnos);

        System.out.println(alumnos);
    }
}
