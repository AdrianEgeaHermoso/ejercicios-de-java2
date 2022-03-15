

public class Alumno implements Comparable<Alumno> {

    private String apellidos;
    private String nombre;
    


    public Alumno(String apellidos, String nombre) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        
    }


    public String getNombre() {
        return nombre;
    }



    public String getApellidos() {
        return apellidos;
    }


    @Override
    public String toString() {
        return "Apellidos: " + apellidos + " Nombre: " + nombre;
    }

    public int compareTo(Alumno alumno) {
        if(this.apellidos.equals(alumno.getApellidos())){
            return this.nombre.compareTo(alumno.getNombre());
        }else{
            return (this.apellidos).compareTo(alumno.getApellidos());
        
        }

    }
    
}
