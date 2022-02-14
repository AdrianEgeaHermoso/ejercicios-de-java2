

public abstract class Mamifero extends Animal{

    private int mesesGestacion;

   

    public Mamifero(String nombre, String color, int mesesGestacion) {
        super(nombre, color);
        this.mesesGestacion = mesesGestacion;
    }



    public int getMesesGestacion() {
        return mesesGestacion;
    }



    public void setMesesGestacion(int mesesGestacion) {
        this.mesesGestacion = mesesGestacion;
    }
    
    
}
