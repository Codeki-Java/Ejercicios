public class Main {
    public static void main(String[] args) {

        //Creo objeto del tipo rectangulo y calculo área y perímetro
        Rectangulo rec = new Rectangulo();
        rec.calcularArea();
        rec.calcularPerimetro();

        //Creo un objeto del tipo círculo y calculo área y perímetro
        Circulo cir = new Circulo();
        cir.calcularArea();
        cir.calcularPerimetro();
    }
}
