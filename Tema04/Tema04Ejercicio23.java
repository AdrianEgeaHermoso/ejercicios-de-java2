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
        if (tipoIva.equals("general")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.21);
          System.out.println("Iva (21%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          System.out.println("Cod Promo (nopro) " + "Sin descuento");
          System.out.println("Total " + (base + precioIva) + " euros");
        }
        if (tipoIva.equals("reducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.10);
          System.out.println("Iva (10%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          System.out.println("Cod Promo (nopro) " + "Sin descuento");
          System.out.println("Total " + (base + precioIva) + " euros");
        }
        if (tipoIva.equals("superreducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.04);
          System.out.println("Iva (4%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          System.out.println("Cod Promo (nopro) " + "Sin descuento");
          System.out.println("Total " + (base + precioIva) + " euros");
        }
        
        break;
      case "mitad":
        if (tipoIva.equals("general")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.21);
          System.out.println("Iva (21%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = (precioConIva * 0.50);
          System.out.println("Cod Promo (mitad) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        if (tipoIva.equals("reducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.10);
          System.out.println("Iva (10%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = (precioConIva * 0.50);
          System.out.println("Cod Promo (mitad) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        if (tipoIva.equals("superreducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.04);
          System.out.println("Iva (4%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = (precioConIva * 0.50);
          System.out.println("Cod Promo (mitad) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        break;
      case "meno5":
        if (tipoIva.equals("general")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.21);
          System.out.println("Iva (21%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = 5;
          System.out.println("Cod Promo (meno5) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        if (tipoIva.equals("reducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.10);
          System.out.println("Iva (10%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = 5;
          System.out.println("Cod Promo (meno5) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        if (tipoIva.equals("superreducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.04);
          System.out.println("Iva (4%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = 5;
          System.out.println("Cod Promo (meno5) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        break;
      case "5porc":
        if (tipoIva.equals("general")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.21);
          System.out.println("Iva (21%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = (precioConIva * 0.05);
          System.out.println("Cod Promo (5porc) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        if (tipoIva.equals("reducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.10);
          System.out.println("Iva (10%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = (precioConIva * 0.05);
          System.out.println("Cod Promo (5porc) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        if (tipoIva.equals("superreducido")) {
          System.out.println("Base Imponible " + base);
          double precioIva = (base * 0.04);
          System.out.println("Iva (4%) " + precioIva);
          double precioConIva = base + precioIva;
          System.out.println("Precio con Iva " + precioConIva);
          double descuento = (precioConIva * 0.05);
          System.out.println("Cod Promo (5porc) " + descuento);
          double resultado = precioConIva - descuento;
          System.out.println("Total " + resultado + " euros");
        }
        break;
      default:
        System.out.print("datos introducidos incorrectos, introduzca correctamente los datos que se solicitan");
    }

  }
}
