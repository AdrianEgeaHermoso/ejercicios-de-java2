/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio23 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que calcule el precio final de un producto dando por teclado la base imponible, el tipo de iva y un código promocional");   
    System.out.print("Por favor, introduzca la base imponible: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el tipo de iva (general, reducido, superreducido): ");
    String tipoIva = System.console().readLine().toLowerCase();
    
    System.out.print("Por favor, introduzca el código promocional (nopro, mitad, meno5, 5porc): ");
    String codPromocion = System.console().readLine().toLowerCase();
    
    
    switch (codPromocion) {
      case "nopro":
        System.out.println("Base Imponible " + base);
        
        break;
      case "mitad":
        if (tipoIva.equals("general")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base / 0.21);
          System.out.println("Iva (21%) " + precioIva);
          System.out.println("Precio con Iva " + (base + precioIva));
          double descuento = ((base + precioIva) / 0.50);
          System.out.println("Cod Promo (mitad) " + (base + precioIva) - descuento);
          double resultado = 
          System.out.println("Total " + resultado + "euros");
        }
        
        break;
      case "meno5":
        
        break;
      case "5porc":
        
        break;
      default:
        System.out.print("datos introducidos incorrectos, introduzca correctamente los datos que se solicitan");
    }

  }
}
