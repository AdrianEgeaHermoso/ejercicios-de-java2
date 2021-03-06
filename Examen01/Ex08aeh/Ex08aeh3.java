/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh3 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la cantidad de polos que desea: ");
    int cantidadPolos = Integer.parseInt(System.console().readLine());
    System.out.print("1) blanco 2) color: ");
    int color = Integer.parseInt(System.console().readLine());
    System.out.print("1) serigrafía 2) bordado: ");
    int logotipo = Integer.parseInt(System.console().readLine());

    double precioUnitario = 4.90;

    if (cantidadPolos >= 40 && cantidadPolos <= 99) {
      precioUnitario = 3.90;
    } else if (cantidadPolos >= 100) {
      precioUnitario = 3.20;
    }

    if (color == 2) {
      precioUnitario = precioUnitario * 1.20;
    }

    double totalTextil = cantidadPolos * precioUnitario;

    double precioLogotipo;

    if (logotipo == 1) {
      if (cantidadPolos < 50) {
        precioLogotipo = 2;
      } else {
        precioLogotipo = 1.50;
      }
    }else{
      if (cantidadPolos < 50) {
        precioLogotipo = 3;
      } else {
        precioLogotipo = 2.50;
      }
    }
    
    double totalLogotipo = precioLogotipo * cantidadPolos;
    double poloLogotipo = totalTextil + totalLogotipo;
    double iva = poloLogotipo * 0.21;
    double total = poloLogotipo + iva;
    
    System.out.println("\nEL POLITO BONITO - PRESUPUESTO");
    System.out.printf("\nPolo en color (unid)  %4d\n", cantidadPolos);
    System.out.printf("Precio unitario        %6.2f €\n", precioUnitario);
    System.out.printf("Total textil           %6.2f €\n", totalTextil);
    System.out.printf("Serigrafia             %6.2f €\n", precioLogotipo);
    System.out.printf("Total serigrafia:      %6.2f €\n", totalLogotipo);
    System.out.printf("Polo mas logotipo      %6.2f €\n", poloLogotipo);
    System.out.printf("IVA                    %6.2f €\n", iva);
    System.out.printf("Total                  %6.2f €\n", total);
    
    
  }
}
