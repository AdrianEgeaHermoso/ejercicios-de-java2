

public class Alumno extends Persona{
    private int numeroExpediente;
    private String estudiosPrevios = "Bachillerato";
    private int anoNacimiento;
    private boolean esRepetidor;

    
    public Alumno() {
    }

    public Alumno(String nombre,int anoNacimiento) {
        super(nombre);
        this.anoNacimiento = anoNacimiento;
    }

    public void repetidor(){

        if (this.esRepetidor == true){
            System.out.println(this.getNombre() + " Venga otro añito mas");
        }else{
            System.out.println(this.getNombre() + " Tira palante y no mires atras");
        }

    }

    public void salidaDelCentro(){
        if (anoNacimiento < 2003){
            System.out.println(this.getNombre() + " No puede salir del centro");
        }else{
            System.out.println(this.getNombre() + " Puedes salir del centro");
        }
    }

    public int dameEdad(){
        return 2022 - this.anoNacimiento;
    }

    @Override
    public String getNombre(){
        return this.getNombre();
    }

    public String setNombre(){
        return this.setNombre();
    }



    @Override
    public String getTelefono() {
        return this.getTelefono();
    }

    public String getEstudiosPrevios() {
        return estudiosPrevios;
    }

    public void setEstudiosPrevios(String estudiosPrevios) {
        this.estudiosPrevios = estudiosPrevios;
    }


    public void atiende(){
        System.out.println("Estoy atendiendo a clase");
    }

    
    public void ficha(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Estudios Previos: "+ this.estudiosPrevios);
    
    }
}
