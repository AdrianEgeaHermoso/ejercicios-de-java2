public class Pez extends AnimalDeAcuario{

    private String raza;

    public Pez(String nombre, String color, String raza) {
        super(nombre, color);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Soy " + this.getNombre() + ", de color " + this.getColor() + ", un pez " + raza ;
    }

    
    AnimalDeAcuario seApareaCon(AnimalDeAcuario a ){

        String nuevoNombre = (this.getNombre() + a.getNombre());
        this.setNombre("");
        a.setNombre("");
        return new AnimalDeAcuario(nuevoNombre);
        
    }


}
