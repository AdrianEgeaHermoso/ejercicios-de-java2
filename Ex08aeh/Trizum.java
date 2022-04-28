

public class Trizum {

    private String numero;
    private double saldo = 0;
    private double precio;
    private String concepto;
    private String nombre;

    public Trizum(String numero) {
        this.numero = numero;
    }


    public Trizum(String nombre, double precio, String concepto) {
        this.nombre = nombre;
        this.precio = precio;
        this.concepto = concepto;
        
    }



    public void envia(Trizum eva,double precio, String concepto) {
        System.out.println(nombre + " " + precio + " " + concepto);
      }

    
    @Override
    public String toString() {
        return "Trizum con telefono " + numero + "\n" + "ENVIADOS:" + "\nRECIBIDOS:";
       
    }

    


}
