import java.util.Scanner;

public class Cuenta {

    //Atributos
    int numeroCuenta;
    long dniCliente;
    double saldoActual;
    int interes;


    //Constructores
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //Getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }


    //Otros métodos
    //Crear cuenta
    public void crearCuenta(){
        //Pedir datos al usuario y crear objeto
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Nro. de cuenta: ");
        numeroCuenta = sc.nextInt();

        System.out.println("Ingrese su DNI: ");
        dniCliente = sc.nextLong();

        System.out.println("Cuenta creada satisfactoriamente: ");
        System.out.println("Cuenta Nro: " + numeroCuenta);
        System.out.println("DNI Cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }

    public void ingresar(){

        //Pedir monto a ingresar
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto a acreditar: ");
        double ingreso = sc.nextDouble();

        saldoActual += ingreso;
        System.out.println("El saldo es: " + saldoActual);

    }

    public void retirar(){
        //Pedir monto
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto a debitar: ");
        double debito = sc.nextDouble();

        //Validar saldo suficiente

        if(debito > saldoActual) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldoActual -= debito;
        }
        System.out.println("El saldo luego del débito es: " + saldoActual);
    }

    public void extraccionRapida(){
        //Pedir monto
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto a debitar: ");
        double debito = sc.nextDouble();

        //Calculo de monto máximo permitido (20% del saldo)
        double montoPermitido = saldoActual*0.2;

        //Validar monto no mayor al 20% del saldo
        if(debito <= montoPermitido) {
            saldoActual -= debito;
            System.out.println("El saldo luego de la extracción rápida es: " + saldoActual);
        } else {
            System.out.println("Se ha superado el monto máximo permitido");
        }
    }

    public void consultarSaldo(){
        System.out.println("El saldo actual es: " + getSaldoActual());
    }

    public void consultarDatos(){
        System.out.println("Cuenta Nro: " + numeroCuenta);
        System.out.println("DNI cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Interes: " + interes);
    }
}
