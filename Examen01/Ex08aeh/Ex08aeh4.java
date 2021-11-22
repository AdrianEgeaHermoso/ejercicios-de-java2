/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh4 {
  public static void main(String[] args) {
    
    System.out.println("Realiza un programa que calcule y muestre por pantalla el número de vueltas que da el planeta Tierra en 400 años en los dos siguientes supuestos:");
    
    System.out.println("a) Sin tener en cuenta los años bisiestos.");
    System.out.println("b) Desde el año 1601 al 2000, ambos incluidos.");
    
    System.out.println("Apartado a:");
    int vueltasSinBisiestos = ((400 - 97) * 365);
    System.out.println("Sin tener en cuenta los años bisiestos, en 400 años, La Tierra da " + vueltasSinBisiestos + " vueltas");
    System.out.println("Apartado b:");
    int vueltasConBisiestos = ((400 * 365) + 97);
    System.out.println("Desde el año 1601 al 2000, La Tierra dió " + vueltasConBisiestos + " vueltas");
  }
}
