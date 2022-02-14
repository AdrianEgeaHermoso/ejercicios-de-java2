public class Pizza {

    private String sabor;
    private String tamano;
    private String estado;

    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String sabor, String tamano) {
        this.sabor = sabor;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    @Override
    public String toString() {
        return "Pizza" + sabor + tamano + estado;
    }

    public void sirve() {

        if (this.estado.equals("pedida")) {

            this.estado = "servida";

            Pizza.totalServidas++;

        } else {

            System.out.println("esa pizza ya se ha servido");

        }

    }


    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

}
