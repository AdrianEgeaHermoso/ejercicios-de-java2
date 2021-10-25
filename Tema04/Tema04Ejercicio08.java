/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio08 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que calcula la media de tres notas y te lo notifique con insuficiente, suficiente, bien, notable o sobresaliente: ");   
    System.out.print("Por favor, introduzca la primera nota: ");
    
    double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la segunda nota: ");
    
    double segundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la tercera nota: ");
    
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    double notaMedia = (primeraNota + segundaNota + terceraNota) / 3;
    
    if (notaMedia < 5){
      System.out.print("Su nota media es insuficiente");
    }else if ((notaMedia >= 5) && (notaMedia < 6)){
      System.out.print("Su nota media es suficiente");
    }else if ((notaMedia >= 6) && (notaMedia < 7)){
      System.out.print("Su nota media es bien");
    }else if ((notaMedia >= 7) && (notaMedia < 9)){
      System.out.print("Su nota media es notable");
    }else if ((notaMedia >= 9) && (notaMedia <= 10)){
      System.out.print("Su nota media es sobresaliente");
    }else{
      System.out.print("Datos introducidos incorrectos");// por si alguien introduce números disparatados
    }

  }
}
