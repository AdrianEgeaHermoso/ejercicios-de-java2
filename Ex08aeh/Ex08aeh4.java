import java.util.ArrayList;
import java.util.HashMap;

public class Ex08aeh4 {
    public static void main(String[] args) {

        HashMap<Integer, Double> productos = new HashMap<Integer, Double>();

        productos.put(12, 2.21);
        productos.put(34, 2.39);
        productos.put(56, 1.59);
        productos.put(78, 3.13);
        productos.put(90, 4.50);

        int codigoIntroducido = 0;
        double dineroIntroducido = 0;

        ArrayList<Integer> listaProductos = new ArrayList<>();
        
        
            System.out.print("Introduzca el codigo del producto: ");
            codigoIntroducido = Integer.parseInt(System.console().readLine());

            if (productos.containsKey(codigoIntroducido)) {
                System.out.print("Producto seleccionado: " + codigoIntroducido + "\n");
                if (codigoIntroducido == 12) {
                    System.out.println("Bocadillo " + productos.get(codigoIntroducido) + " Euros");

                    System.out.println("Introduzca el dinero: ");
                    dineroIntroducido = Double.parseDouble(System.console().readLine());
                    if (dineroIntroducido < productos.get(codigoIntroducido)) {
                        System.out.println("lo siento esa cantidad no es suficiente");
                        System.out.println("Intentelo de nuevo");
                    }else{
                        System.out.println("Tome su producto, gracias");
                    }

                    

                    
                    
                }

                if (codigoIntroducido == 34) {
                    System.out.println("Ensalada " + productos.get(codigoIntroducido) + " Euros");

                    System.out.println("Introduzca el dinero: ");
                    dineroIntroducido = Double.parseDouble(System.console().readLine());
                    if (dineroIntroducido < productos.get(codigoIntroducido)) {
                        System.out.println("lo siento esa cantidad no es suficiente");
                        System.out.println("Intentelo de nuevo");
                    }else{
                        System.out.println("Tome su producto, gracias");
                    }


                    

                    

                    
                    
                }

                if (codigoIntroducido == 56) {
                    System.out.println("Patatas Fritas " + productos.get(codigoIntroducido) + " Euros");

                    System.out.println("Introduzca el dinero: ");
                    dineroIntroducido = Double.parseDouble(System.console().readLine());
                    if (dineroIntroducido < productos.get(codigoIntroducido)) {
                        System.out.println("lo siento esa cantidad no es suficiente");
                        System.out.println("Intentelo de nuevo");
                    }else{
                        System.out.println("Tome su producto, gracias");
                    }



                    

                    
                    
                }

                if (codigoIntroducido == 78) {
                    System.out.println("Agua " + productos.get(codigoIntroducido) + " Euros");

                    System.out.println("Introduzca el dinero: ");
                    dineroIntroducido = Double.parseDouble(System.console().readLine());
                    if (dineroIntroducido < productos.get(codigoIntroducido)) {
                        System.out.println("lo siento esa cantidad no es suficiente");
                        System.out.println("Intentelo de nuevo");
                    }else{
                        System.out.println("Tome su producto, gracias");
                    }

                    

                    
                    
                }

                if (codigoIntroducido == 90) {
                    System.out.println("Cerveza " + productos.get(codigoIntroducido) + " Euros");

                    System.out.println("Introduzca el dinero: ");
                    dineroIntroducido = Double.parseDouble(System.console().readLine());
                    if (dineroIntroducido < productos.get(codigoIntroducido)) {
                        System.out.println("lo siento esa cantidad no es suficiente");
                        System.out.println("Intentelo de nuevo");
                    }else{
                        System.out.println("Tome su producto, gracias");
                    }

                    

                    
                    
                }
               
                
                } else {
                System.out.print("El código introducido es incorrecto.");
                }




        
    }
}