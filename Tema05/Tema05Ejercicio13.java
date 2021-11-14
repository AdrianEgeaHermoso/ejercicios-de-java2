/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio13 {
  public static void main(String[] args) {
    System.out.println(" Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.: ");
    
    int n = 0;
    int positivos = 0;
    int negativos = 0;
    
    System.out.println("Introduce 10 numeros para saber si son positivos o negativos");
    
    for (int i = 0; i < 10; i++) {
      n = Integer.parseInt(System.console().readLine());
      if (n >= 0){positivos ++;
      }else{negativos ++;};
        }
    
    System.out.println("Ha introducido " + positivos + " numeros positivos y " + negativos + " negativos");
    
    //do{
      //System.out.println("Introduzca números para saber si es positivo o negativo: ");
      //n = Integer.parseInt(System.console().readLine());
      //if (n>= 0){
        //System.out.println("Es positivo");
      //}else{System.out.println("Es negativo");}
      //numeros ++;
    //}while(numeros <= 10);
  
  }
}
