package app;
import app.lib.*;

public class App {
    public static void main(String[] args) throws Exception {

        double ladoA = 4;
        double ladoB = 5;
        double raio = 3;

        //Circulo
        Circulo circulo = new Circulo(raio, "nao","azul");
        circulo.showInfos();

        //Quadrado
        Quadrado quadrado = new Quadrado(ladoA,"sim","amarelo");
        quadrado.showInfos();

        //Retangulo
        Retangulo retangulo = new Retangulo(ladoA, ladoB, "nao","verde");
        retangulo.showInfos();

    }
}