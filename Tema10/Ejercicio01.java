import java.util.ArrayList;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Ejercicio01 {
  public static void main(String[] args) {
        
  
    ArrayList<String> companeros = new ArrayList<>();

    companeros.add("Joseph");
    companeros.add("Natalia");
    companeros.add("Cueto");
    companeros.add("Fran");
    companeros.add("Antunez");
    companeros.add("Morales");
    System.out.println(companeros);
    
    for (String companero : companeros) {
      System.out.println("Sr. o Sra. " + companero);
      
    }
    
  }
}
