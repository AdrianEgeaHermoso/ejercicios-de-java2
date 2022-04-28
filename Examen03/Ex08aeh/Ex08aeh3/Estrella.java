public class Estrella extends AnimalDeAcuario{

    private int numeroDeBrazos;

    public Estrella(String nombre, String color, int numeroDeBrazos) {
        super(nombre, color);
        this.numeroDeBrazos = numeroDeBrazos;
    }

    public int getNumeroDeBrazos() {
        return numeroDeBrazos;
    }

    public void setNumeroDeBrazos(int numeroDeBrazos) {
        this.numeroDeBrazos = numeroDeBrazos;
    }

    @Override
    public String toString() {
        return "Soy " + this.getNombre() + ", de color " + this.getColor() + ", una estrella con " +  numeroDeBrazos + " brazos";
    }

    
    
}
