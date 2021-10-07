/**
 * Horario de clase
 * Añadiendo colores
 * @author Adrián Egea Hermoso
 */
public class Tema01Ejercicio05 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String azul = "\033[36m";
    String morado = "\033[35m";
    String naranja = "\033[33m";
    String color = "\033[37m";
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",   "Lunes","Martes","Miercoles","Jueves","Viernes");
    System.out.println(color+"----------------------------------------------------");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",  "\033[31m PRO","\033[31mPRO","\033[32mSINF","PRO","FOL");
    System.out.println(color+"----------------------------------------------------");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",  rojo+"PRO",rojo+"PRO",verde+"SINF",rojo+"PRO",color+"FOL");
    System.out.println(color+"----------------------------------------------------");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",  azul+"LM",rojo+"PRO",verde+"SINF",rojo+"PRO",color+"FOL");
    System.out.println(color+"----------------------------------------------------");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",  morado+"ED",naranja+"BBDD",azul+"LM",naranja+"BBDD",verde+"SINF");
    System.out.println(color+"----------------------------------------------------");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",  morado+"ED",naranja+"BBDD",azul+"LM",naranja+"BBDD",verde+"SINF");
    System.out.println(color+"----------------------------------------------------");
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",  morado+"ED",naranja+"BBDD",azul+"LM",naranja+"BBDD",verde+"SINF");
    System.out.println(color+"----------------------------------------------------");
  }
}


