import java.util.Scanner;

public class Circulo implements calculosFormas {

    //Atributos
    double pi = 3.14159265359;
    double radio;

    //Constructores
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metodos
    @Override
    public void calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Figura: CIRCULO");
        System.out.println("Ingrese el valor del radio: ");
        radio = sc.nextDouble();

        double area = pi * radio*radio;
        System.out.println("El area del círculo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * pi * radio;
        System.out.println("El area del círculo es: " + perimetro);
    }
}
