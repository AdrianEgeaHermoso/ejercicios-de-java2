public class Caballo {

    private String nombre;
    private String raza;
    private int altura;
    private int peso;
    private int velocidad;



    public Caballo() {
    }



    public Caballo(String nombre, String raza, int altura, int peso, int velocidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }



    public String getNombre() {
        return nombre;
    }


    public String getRaza() {
        return raza;
    }



    public int getAltura() {
        return altura;
    }


    public int getPeso() {
        return peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void cabalga(){
        System.out.println("cabalga por las praderas");
    }

    public void rapidez(){
        if (this.velocidad > 50){
            System.out.println("Es un caballo muy rápido");
        }else{
            System.out.println("Es un caballo lentorro");
        }
    }

    

    

    
    
}
