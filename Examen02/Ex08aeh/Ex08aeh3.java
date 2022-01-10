/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh3 {
  public static void main(String[] args) {
    
    
    System.out.println("Indique el ancho:");
    int ancho = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique el alto:");
    int altura = Integer.parseInt(System.console().readLine());
    

    
    
    for (int p = 0; p < altura; p++) {
      
      int rows = 4;
       

        for(int j=1;j <= rows;j++){
            for(int i=1;i <= rows-j;i++){
                System.out.print("  ");
            }
            
            for(int k=1;k<=j; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
  
      
    }
    
    
    
    
  }
}
