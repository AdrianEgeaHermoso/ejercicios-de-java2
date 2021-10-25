/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio10 {
  public static void main(String[] args) {   
       
    System.out.println("Programa que dando el mes y el día de nacimiento nos dice nuestro signo del horoscopo: ");
    System.out.print("Por favor, introduzca el nombre del mes en minúscula: ");
    String mes = System.console().readLine();
    
    System.out.print("Por favor, introduzca el día del mes en numero entero: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    
    switch (mes) {
      case "enero":
        if(dia <= 19 && dia >= 1){System.out.print("Eres Capricornio");// me estaba dando un error por poner el = antes que el <
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Acuario");}
        break;
      case "febrero":
        if(dia <= 18 && dia >= 1){System.out.print("Eres Acuario");
          }else if (dia > 28 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Piscis");}
        break;
      case "marzo":
        if(dia <= 20 && dia >= 1){System.out.print("Eres Piscis");
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Aries");}
        break;
      case "abril":
        if(dia <= 19 && dia >= 1){System.out.print("Eres Aries");
          }else if (dia > 30 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Tauro");}
        break;
      case "mayo":
        if(dia <= 20 && dia >= 1){System.out.print("Eres Tauro");
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Geminis");}
        break;
      case "junio":
        if(dia <= 20 && dia >= 1){System.out.print("Eres Geminis");
          }else if (dia > 30 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Cancer");}
        break;
      case "julio":
        if(dia <= 22 && dia >= 1){System.out.print("Eres Cancer");
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Leo");}
        break;
      case "agosto":
        if(dia <= 22 && dia >= 1){System.out.print("Eres Leo");
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Virgo");}
        break;
      case "septiembre":
        if(dia <= 22 && dia >= 1){System.out.print("Eres Virgo");
          }else if (dia > 30 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Libra");}
        break;
      case "octubre":
        if(dia <= 23 && dia >= 1){System.out.print("Eres Libra");
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Escorpio");}
        break;
      case "noviembre":
        if(dia <= 21 && dia >= 1){System.out.print("Eres Escorpio");
          }else if (dia > 30 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Sagitario");}
        break;
      case "diciembre":
        if(dia <= 21 && dia >= 1){System.out.print("Eres Sagitario");
          }else if (dia > 31 || dia <= 0){System.out.print("Número del mes incorrecto");
            }else {System.out.print("Eres Capricornio");}
        break;
      default:
      System.out.println("Ha introducido incorrectamente el nombre del mes");
    }
  }
}
