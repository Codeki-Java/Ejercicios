import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // crear array list
        ArrayList<String> razas = new ArrayList<>();

        // crear clase scanner para que pregunte al usuario por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese raza: ");

        String raza = "";

        while(!raza.equals("0")) {
            raza = sc.nextLine();
            System.out.println("Ingrese otra raza o 0 para salir");
            //agrego lo ingresado a la lista
            if(!raza.equals("0")) {
                razas.add(raza);
            }
        }

        //Muestro el array
        System.out.println("Listado de razas: " + razas);
        System.out.println("Adios");

        //Buscar raza ingresada
        System.out.println("Ingrese la raza a buscar: ");
        String busqueda = sc.nextLine();

        //Por cada raza de razas, si busqueda = a raza, mostrarla.

        //Declaro una variable booleana "razaEncontrada" y la inicializo en false
        boolean razaEncontrada = false;
        for(String r : razas) {
            if (busqueda.equals(r)){
                System.out.println("La raza encontrada es: " + r);
                razaEncontrada = true; // cambio la variable a true
                break; // salgo del bucle
            }
        }
        //Fuera del bucle, si razaEncontrada = false, que imprima "Raza no encontrada"
        if(!razaEncontrada){ // si no cambio la variable a true porque no encontró la raza
            System.out.println("Raza no encontrada");
        }
























    }

}
