/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio25 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para la tienda online BanderaDeEspaña.es"); 
    
      
    System.out.print("Por favor, introduzca la altura de la bandera en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la anchura de la bandera en cm: ");
    double anchura = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Quiere escudo bordado? (s / n) ");
    String bordado = System.console().readLine();
    
    
    if (bordado.equals("s")){
      double tamañoBandera = altura * anchura;
      double costeBandera = (altura * anchura) * 0.01;
      System.out.println("Bandera de " + (int)tamañoBandera + " cm2: " + costeBandera + " Euros");
      double total = (costeBandera + 2.50 + 3.25);
      System.out.println("Con Escudo " + 2.50 + " Euros");
      System.out.println("Gastos de envío " + 3.25 + " Euros");
      System.out.println("Total " + total + " Euros");
      }
    if (bordado.equals("n")){
      double tamañoBandera = altura * anchura;
      double costeBandera = (altura * anchura) * 0.01;
      System.out.println("Bandera de " + (int)tamañoBandera + " cm2: " + costeBandera + " Euros");
      double total = (costeBandera + 3.25);
      System.out.println("Sin Escudo " + 0.00 + " Euros");
      System.out.println("Gastos de envío " + 3.25 + " Euros");
      System.out.println("Total " + total + " Euros");
      
      }

  }
}
