package app.lib;

public class Loja {
    public Livros livros = new Livros(100);
    public Cds cds = new Cds(100);
    public Dvds dvds = new Dvds(100);

    public Loja(){
        
    }


    public int getQuantidadeTotal(){
        int res = this.livros.quantidadeItens + this.cds.quantidadeItens + this.dvds.quantidadeItens;
        return res;
    }

}