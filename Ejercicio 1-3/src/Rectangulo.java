import java.util.Scanner;

public class Rectangulo implements calculosFormas{

    //Atributos
    double lado1;
    double lado2;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodos
    @Override
    public void calcularArea() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Figura: RECTANGULO");
        System.out.println("Ingrese el valor del lado 1: ");
        lado1 = sc.nextDouble();

        System.out.println("Ingrese el valor del lado 2: ");
        lado2 = sc.nextDouble();

        double area = lado1 * lado2;
        System.out.println("El area del rectángulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2*(lado1 + lado2);
        System.out.println("El perimetro del rectángulo es: " + perimetro);

    }
}
