package app.lib;


/**
 * Retangulo
 */

public class Retangulo implements Poligono {
    private double ladoA;
    private double ladoB;
    private String cor;
    private String filled;

    /**
     * Construtor da Classe Retangulo
     * @param ladoA
     * @param ladoB
     * @param filled
     * @param cor
     */
    public Retangulo(double ladoA, double ladoB,String filled,String cor){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.filled = filled;    
        this.cor = cor;
    }

    @Override
    public double area(){
        return (this.ladoA * this.ladoB);
    }

    @Override
    public double perimetro(){
        return (this.ladoA*2 + this.ladoB*2);
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

    public void print(Retangulo r){
        System.out.println(r.cor);
    }
}

