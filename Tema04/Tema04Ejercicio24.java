/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio24 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que que genere la nómina (bien desglosada) de un empleado según sus condiciones"); 
    
    System.out.print("1. Programador Junior");
    System.out.print("2. Programador Senior");
    System.out.print("3. Jefe de Proyecto");
    
      
    System.out.print("Por favor, introduzca el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿ Cuantos días ha estado de viaje visitando clientes ?");
    int diasViaje = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca su estado civil (1. Soltero, 2. Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
  
    
    switch (cargo) {
      case 1:
        if (estadoCivil == 1) {
          double sueldoBase = 950;
          System.out.println("Sueldo Base " + sueldoBase);
          double dietas = (diasViaje * 30);
          System.out.println("Dietas" + (diasViaje + "viajes ") + dietas);
          double sueldoBruto = sueldoBase + dietas;
          System.out.println("Sueldo Bruto " + sueldoBruto);
          double retencion = (sueldoBruto * 0.25);
          System.out.println("Retención IRPF " + retencion);
          double sueldoNeto = (sueldoBruto - retencion);
          System.out.println("Sueldo Neto " + sueldoNeto);
        }
        if (estadoCivil == 2) {
          double sueldoBase = 950;
          
        }
        break;
      case 2:
      double sueldoBase = 1200;
        break;
      case 3:
      //double sueldoBase = 1600;
        break;
      default:
        System.out.print("datos introducidos incorrectos, introduzca correctamente los datos que se solicitan");
    }

  }
}
