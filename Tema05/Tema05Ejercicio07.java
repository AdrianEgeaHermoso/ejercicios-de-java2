/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la caja fuerte.: ");
    
    int numeroIntroducido = 0;
    int numeroIntentos = 4;
    
    do{
      System.out.println("Introduzca la combinación de 4 digitos para abrir la caja fuerte, tiene " + numeroIntentos + " intentos");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeroIntentos--;
      }while((numeroIntroducido != 4444) && (numeroIntentos != 0));
    
    if (numeroIntroducido == 4444){
      System.out.println("Has acertado la combinación");
    }else{System.out.println("Has fallado los 4 intentos");
    }
  }
}
