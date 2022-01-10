/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh4 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que genere de forma aleatoria el menú del día de un restaurante vegetariano. El menú se compone de ensalada, plato principal y postre. A continuación se muestra una tabla con todas las opciones posibles. Hay que tener en cuenta que si hay arroz al curry como plato principal, no se debe ofrecer arroz con leche como postre.");
    
    int n = 0;
    int x = 0;
    int y = 0;
    int z = 0;
    
    String principal = "";
    String ensalada = "";
    String postre = "";
    String aux = "";
    
    System.out.println("Menu del dia");
    System.out.println("------------");
    
    for (int j = 1; j <= 1; j++) {
    
      for (int i = 1; i <= 1; i++) {
        
        n = (int)(Math.random() * 3) + 1;
          
        switch(n){
          case 1:
          ensalada = "tomate y mozzarella";
          break;
          case 2:
          ensalada = "rúcula y queso de cabra";
          break;
          case 3:
          ensalada = "endivias con nueces y miel";
          default:
        }
      }
      
      
      for (int i = 1; i <= 1; i++) {
        
        x = (int)(Math.random() * 3) + 1;
          
        switch(x){
          case 1:
          principal = "arroz al curry";
          break;
          case 2:
          principal = "quinoa con verduras";
          break;
          case 3:
          principal = "espagetis al pesto";
          default:
        }
      }
      
      
      for (int i = 1; i <= 1; i++) {
        
        y = (int)(Math.random() * 3) + 1;
          
        switch(y){
          case 1:
          postre = "arroz conn leche";
          break;
          case 2:
          postre = "natillas";
          break;
          case 3:
          postre = "tarta de chocolate";
          default:
        }
      }
      
      for (int i = 1; i <= 1; i++) {
        
        z = (int)(Math.random() * 2) + 1;
          
        switch(z){
          case 1:
          aux = "tarta de chocolate";
          break;
          case 2:
          aux = "natillas";
          default:
        }
      }
      
      if(x == y){
        System.out.println(ensalada + "\n" + principal + "\n" + aux);
        }else{System.out.println(ensalada + "\n" + principal + "\n" + postre);}
    }
  }
}
