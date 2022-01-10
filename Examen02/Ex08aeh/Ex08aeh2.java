/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh2 {
  public static void main(String[] args) {
    
    //int[] n = new int[20];
    //int i;
    
    //for (i = 0; i < 20; i++) {
      //n[i] = (int)(Math.random() * 101);
    //}
    
    //System.out.println(n[i]);
    
    int[] numero = new int[20];
    
    for (int i = 0; i < numero.length; i++) {
      numero[i] = ((int)(Math.random ()* 999)+1);
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.print( numero[i] + " ");
    }
    
    String respuesta;
    System.out.println("");
    System.out.println("\n¿Qué filtro quieres aplicar? ");
    
    System.out.println("1. Pares");
    System.out.println("2. Primos");
    System.out.println("3. Capicúas");
    System.out.print("Elige una opción:");
    respuesta = System.console().readLine();
    System.out.println(" ");
    
    
    if (respuesta.equals("1")) {
      
      for (int i = 0; i < numero.length; i++) {
        if (numero[i] % 2 == 0) {
          System.out.print( numero[i] + " ");
        }
      }
      
  }
    
    
    if (respuesta.equals("2")) {
      
      for (int i = 0; i < numero.length; i++) {
        if ((numero[i] % numero[i]) == 0) {
          System.out.print( numero[i] + " ");
        }
      }
    }
    
    
    if (respuesta.equals("3")) {
      
      
    }
    
      
      
      
    
    
  }
}
