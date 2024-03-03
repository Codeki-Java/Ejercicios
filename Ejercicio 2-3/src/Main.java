import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //Crear un hashmap y un objeto de la clase Scanner como variables de la clase
    private static HashMap<String, String> productos = new HashMap<String, String>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        while (true) {

            //Mostrar menu con opciones
            System.out.println("------------------------");
            System.out.println("LISTADO DE PRODUCTOS");
            System.out.println("------------------------");
            System.out.println("1 - Agregar");
            System.out.println("2 - Modificar");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Mostrar listado");
            System.out.println("X - SALIR");

            //Pedir opciones al usuario
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    agregar();
                    break;
                case "2":
                    modificar();
                    break;
                case "3":
                    eliminar();
                    break;
                case "4":
                    mostrarListado();
                    break;
                case "X":
                case "x":
                    System.out.println("¡Adiós!");
                    return; // Salir del método main() y, por lo tanto, del programa
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }

    private static void mostrarListado() {
        System.out.println("LISTADO DE PRODUCTOS:");
        for (String i : productos.keySet()) {
            System.out.println(i + " " + productos.get(i));
        }
    }

    private static void agregar() {
        //Solicitar al usuario producto y precio
        System.out.println("Ingrese el producto: ");
        String producto = sc.nextLine();

        System.out.println("Ingrese el precio: ");
        String precio = sc.nextLine();

        //Agregar el producto y precio al HashMap
        productos.put(producto, precio);
    }

    private static void modificar() {
        //Solicitar producto a modificar
        System.out.println("Escriba el producto a modificar: ");
        String aModificar = sc.nextLine();

        //Si el producto esta presente en el  hashmap, pedir nuevo precio
        if (productos.containsKey(aModificar)) {
            //pedir precio nuevo
            System.out.println("Nuevo precio: ");
            String nuevoPrecio = sc.nextLine();

            //borrar con remove(clave-valor) y agregar nuevo producto
            productos.remove(aModificar);
            productos.put(aModificar,nuevoPrecio);
            System.out.println("Producto modificado correctamente!");
        } else {
            System.out.println("Producto no encontrado!");
        }
    }

    private static void eliminar() {
        //Solicitar producto a eliminar
        System.out.println("Escriba el producto a eliminar: ");
        String aEliminar = sc.nextLine();

        //Verificar si el producto esta presente en el  hashmap
        if (productos.containsKey(aEliminar)) {
            productos.remove(aEliminar);
            System.out.println("Producto eliminado!");
        } else {
            System.out.println("Producto no entrado, vuelva a intenar!");
            mostrarMenu();
        }
    }
}
