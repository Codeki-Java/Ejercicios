import java.util.Scanner;

public class Operacion {

    //Atributos
    private double numero1;
    private double numero2;

    //Constructor vacío
    public Operacion() {
    }

    //Constructor con parámetros
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Getters y setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Métodos

    public void crearOperacion(){

        //Le pido al usuario 2 numeros y los guardo en las variables num1 y num2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        //Guardo los numeros ingresados por el usuario en los atributos
        this.setNumero1(num1);
        this.setNumero2(num2);

        System.out.println("Los numeros ingresados son: " + this.getNumero1() + " y " + this.getNumero2());

    }

    public void sumar(){
        double resultadoSuma = getNumero1() + getNumero2();
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }

    public void restar(){
        double resultadoResta = getNumero1() - getNumero2();
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }

    public void multiplicar(){
        double resultadoMultiplicacion = getNumero1() * getNumero2();
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
    }

    public void dividir(){
        if(getNumero2() != 0) {
            double resultadoDivision = getNumero1() / getNumero2();
            System.out.println("El resultado de la división es: " + resultadoDivision);
        } else {
            System.out.println("No se puede dividir por 0!");
        }

    }

}
