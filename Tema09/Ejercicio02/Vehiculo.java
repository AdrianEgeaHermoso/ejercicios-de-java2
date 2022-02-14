public abstract class Vehiculo {

    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    

    private int kilometrosRecorridos;
    


    public Vehiculo(int kilometrosRecorridos) {
        this.kilometrosRecorridos = 0;
    }
    

    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }



    public int getkilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    

    

    public void distanciaRecorrida(int kms) {
        this.kilometrosRecorridos += kms;
        Vehiculo.kilometrosTotales += kms;
      }
   
}
