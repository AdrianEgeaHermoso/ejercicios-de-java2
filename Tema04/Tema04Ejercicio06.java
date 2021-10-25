/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio06 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para calcular el tiempo que tardará un objeto en caer desde una altura determinada: ");   
    System.out.print("Por favor, introduzca la altura en metros: ");
    
    double altura = Double.parseDouble(System.console().readLine());
    if (altura <= 0){
      System.out.println("Datos introducidos incorrectos");
    }else{
    double gravedad = 9.81;
    double tiempo = Math.sqrt(2*altura/gravedad);

    System.out.printf("El objeto que dejemos caer, tardará %.2f segundos", tiempo);
    }

  }
}
