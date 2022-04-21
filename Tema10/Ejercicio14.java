import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio14 {
    public static void main(String[] args) {

        HashMap<String, Double> productos = new HashMap<String, Double>();

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        String productoIntroducido = "";
        int cantidadIntroducida = 0;

        ArrayList<String> listaProductos = new ArrayList<>();
        ArrayList<Integer> listaCantidades = new ArrayList<>();

        do {
            System.out.print("Producto: ");
            productoIntroducido = System.console().readLine();

            if (!productoIntroducido.equals("fin")) {

                listaProductos.add(productoIntroducido);
                System.out.print("Cantidad: ");
                cantidadIntroducida = Integer.parseInt(System.console().readLine());
                listaCantidades.add(cantidadIntroducida);

            }

            System.out.println(listaProductos);
            System.out.println(listaCantidades);

        } while (!productoIntroducido.equals("fin"));

        double total = 0;

        for (int index = 0; index < listaProductos.size(); index++) {
            String producto = listaProductos.get(index);
            double precio = productos.get(producto);
            int cantidad = listaCantidades.get(index);
            double subtotal = precio * cantidad;
            total += subtotal;

            System.out.println(producto);
            System.out.println(precio);
            System.out.println(cantidad);
            System.out.println(subtotal);

        }

        System.out.println(total);

    }
}
