

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */


public class PruebaVacio {
  public static void main(String[] args) {

    saluda();
    saluda();
    saluda(7);
    
  }

  // Funciones ///////////////

  public static void saluda(){
      System.out.println("hola");


  }

  public static void saluda(String nombre){
    System.out.println("hola" + nombre);
}


public static void saluda(int veces){
    for (int i = 0; i < veces; i++) {
        System.out.print("hola ");
    }


}


  




}
