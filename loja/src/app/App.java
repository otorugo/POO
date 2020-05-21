package app;
import app.lib.*;

public class App{
    public static void main(String[] args) {

        Cd cd = new Cd("nome", "codigoDeBarra",123,123,1,12,"Victor Hugo");
        // cd.cdInfo();

        // Livro livro  = new Livro("nome","codigoDeBarras",123,123,123,"Victor Hugo", 123);
        // livro.livroInfo();

        // Dvd dvd = new Dvd("nome", "codigoDeBarras", 123, 123, 123,"Victor",1080);
        // dvd.dvdInfo();


        Loja loja = new Loja();
        loja.cds.addCd(cd);
        cd.cdInfo();
        cd.venderProduto();
        cd.cdInfo();
        // System.out.println(loja.getQuantidadeTotal());


    }
}