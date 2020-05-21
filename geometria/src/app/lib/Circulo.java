package app.lib;

public class Circulo implements Poligono{
    double raio;
    final double pi = 3.141519;
    String cor;
    String filled;

    public Circulo(double raio, String filled ,String cor){
        this.raio = raio;
        this.filled = filled;
        this.cor = cor;
    }

    @Override
    public double area(){
        return (this.pi*this.raio*this.raio);
    }

    @Override
    public double perimetro(){
        return (this.pi*2*this.raio);
    }

    @Override
    public void showInfos(){
        System.out.println("------------");
        System.out.printf("Area : %.2f\n",this.area());
        System.out.printf("Perimetro : %.2f\n",this.perimetro());
        System.out.println("Cor : "+this.cor);
        System.out.println("Filled : "+this.filled);
        System.out.println("------------");
    }
}