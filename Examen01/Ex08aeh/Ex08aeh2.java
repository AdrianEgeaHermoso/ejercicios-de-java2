/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el ritmo cardíaco medio en pulsaciones por minuto : ");
    int pulsaciones = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el tiempo en años: ");
    int anos = Integer.parseInt(System.console().readLine());
    
    int latidosTotales = ((((365 * 24) * 60) * anos) * pulsaciones);
    
    System.out.print("En ese tiempo, su corazón habrá latido " + latidosTotales + " veces");
    
  }
}
