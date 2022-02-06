

public class Alumno {
    int numeroExpediente;
    String nombre;
    String apellidos;
    String telefono;
    String estudiosPrevios = "Bachillerato";
    int anoNacimiento;
    boolean esRepetidor;

    public Alumno() {
      
    }

    public Alumno(int numeroExpediente, String nombre, String apellidos) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
            int anoNacimiento, boolean esRepetidor) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.estudiosPrevios = estudiosPrevios;
        this.anoNacimiento = anoNacimiento;
        this.esRepetidor = esRepetidor;
    }

    public void saluda(){
        System.out.println("Hola soy " + this.nombre);

    }


    public void saluda(String intensidad){

        String cadena = "Hola soy " + this.nombre;

        switch(intensidad){
            case "fuerte":
                cadena = cadena.toUpperCase();
                break;
            case "debil":
                cadena = cadena.toLowerCase();
                break;
            default:
        }
        System.out.println(cadena);

    }
    
    public void repetidor(){

        if (this.esRepetidor == true){
            System.out.println(this.nombre + " Venga otro añito mas");
        }else{
            System.out.println(this.nombre + " Tira palante y no mires atras");
        }

    }

    public void salidaDelCentro(){
        if (anoNacimiento < 2003){
            System.out.println(this.nombre + " No puede salir del centro");
        }else{
            System.out.println(this.nombre + " Puedes salir del centro");
        }
    }

    public int dameEdad(){
        return 2022 - this.anoNacimiento;
    }


    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstudiosPrevios() {
        return estudiosPrevios;
    }

    public void setEstudiosPrevios(String estudiosPrevios) {
        this.estudiosPrevios = estudiosPrevios;
    }


    
    
}
