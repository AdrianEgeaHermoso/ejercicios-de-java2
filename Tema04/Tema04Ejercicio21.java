/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio21 {
  public static void main(String[] args) {  
     
    System.out.println("Programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. ");   
    System.out.print("Por favor, introduzca la primera nota: ");
    
    double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la segunda nota: ");
    
    double segundaNota = Double.parseDouble(System.console().readLine());
    
    double notaMedia = (primeraNota + segundaNota) / 2;
    
    if ((notaMedia >= 5) && (notaMedia <= 10)) {
      System.out.print("Has aprobado, tu nota media es un: " + notaMedia);
    }
    
    if ((notaMedia < 5) && (notaMedia >= 0)){
      System.out.print("¿ Cuál ha sido el resultado de la recuperación (apto/ no apto)?");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")){
        System.out.print("Tu nota es un 5");
      }else{
        System.out.print("Tu nota es un " + notaMedia);
        }
    }
    
  }
}
