/**
 * Ejercicios Tema 02
 *
 * @author Adrián Egea Hermoso
 */
public class Tema02Ejercicio06 {
  public static void main(String[] args) {
    double precioSinIva = 100.10;
    double iva = 0.21;
    double baseImponible = precioSinIva * iva;
    double total = precioSinIva + baseImponible;
    
    System.out.println("La base imponible es: " + baseImponible + " y el total de la factura es: " + total);
  }
}
