

public class Perro extends Mamifero{

    private String tipoLadrido;

    public Perro( String nombre, String color, int mesesGestacion,String tipoLadrido) {
        super(nombre, color, mesesGestacion);
        this.tipoLadrido = tipoLadrido;

    }

    @Override
    public String toString() {
        return "Hola, soy " + this.getNombre() + " de color " + this.getColor() + " y ladro " + this.tipoLadrido;
    }


    
    
}
