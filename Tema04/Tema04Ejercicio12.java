/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio12 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para hacer un minicuestionario de 10 preguntas: ");   
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO (Escribe a b o c para responder cada pregunta)");
    
    System.out.println("1. Lenguaje que estamos aprendiendo en la asignatura de Programación");
    System.out.println("a) Java\nb) C\nc) Sql");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("2. ¿Como se llama la IDE que estamos usando actualmente en Programación?");
    System.out.println("a) Netbeans\nb) Geany\nc) Pseint");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("3. ¿De qué tipo suelen ser los examenes de Etorno?");
    System.out.println("a) Tipo Test\nb) Práctico\nc) Listening");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("4. ¿Cuantas horas a la semana tiene Base de Datos?");
    System.out.println("a) seis\nb) cinco\nc) siete");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("5. ¿Como puedes incrementar el valor de una variable tipo int?");
    System.out.println("a) más\nb) +\nc) ++");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("6. Etiqueta para hacer un salto de línea dentro de un parrafo en HTML");
    System.out.println("a) bn\nb) n\nc) br");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("7. ¿Como se llama el atributo único que no se puede repetir en una Base de datos?");
    System.out.println("a) clave primaria\nb) clave foranea\nc) clave irrepetible");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("8. Considerada la madre de la informática");
    System.out.println("a) Jean Jennings\nb) Ada Lovelace\nc) Grace Hopper");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("9. ¿A donde subimos las tareas de programación, y es un control de versiones?");
    System.out.println("a) A la nube\nb) GitHub\nc) Google Drive");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    System.out.println("10. Archivo que se vincula al Html para cambiar sus estilos");
    System.out.println("a) CSS\nb) JS\nc) TTF");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("correcta");
      puntos++;
    }else{System.out.println("incorrecta");}
    
    
    System.out.println("Tu puntuación ha sido de " + puntos + " puntos");

  }
}
