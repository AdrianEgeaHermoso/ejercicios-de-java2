/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Prueba {
  public static void main(String[] args) {

    int opcion = 0;
    int kms;


    Bicicleta bici1 = new Bicicleta(10);
    Coche coche1 = new Coche(18);
    Coche coche2 = new Coche(11);


    while (opcion != 8) {
    System.out.println("VEHICULOS");
    System.out.println("============");

    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicileta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    System.out.println("Elige una opción (1 - 8):");

    opcion = Integer.parseInt(System.console().readLine());

    

    switch (opcion) {
      case 1:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        kms = Integer.parseInt(System.console().readLine());
        bici1.distanciaRecorrida(kms);
        break;
      case 2:
        bici1.hazCaballito();
        break;
      case 3:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        kms = Integer.parseInt(System.console().readLine());
        coche1.distanciaRecorrida(kms);
        break;
      case 4:
        coche1.quemaRueda();
        break;
      case 5:
        System.out.println("La bicicleta lleva recorridos ");
        System.out.println(bici1.getkilometrosRecorridos() + " Kms");
        break;
      case 6:
        System.out.println("El coche lleva recorridos ");
        System.out.println(coche1.getkilometrosRecorridos() + " Kms");
        break;
      case 7:
        System.out.println("Los vehículos llevan recorridos ");
        System.out.println(Vehiculo.getKilometrosTotales() + " Kms");
      default:

    }

  }


    bici1.hazCaballito();
    coche1.quemaRueda();
   
    System.out.println("Recorre la bicicleta " + bici1.getkilometrosRecorridos() + " kms" );
    System.out.println("Recorre la bicicleta " + coche1.getkilometrosRecorridos() + " kms" );
    
    
    
    
    
    
    
    
  }
}
