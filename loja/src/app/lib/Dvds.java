package app.lib;

public class Dvds extends Produtos{
    Dvd[] lista;

    public Dvds(int capacidadeLoja){
        super();
        lista = new Dvd[capacidadeLoja];
    }
    public void addDvd(Dvd dvd) {
        lista[this.quantidadeItens] = dvd;
        this.raiseQuantidadeItens();
    }
    public void addDvds(Dvds arrayDvds){
        for(int i = 0;i < arrayDvds.quantidadeItens ;i++){
            addDvd(arrayDvds.lista[i]);            
        }
    }

    public void searchNome(String nome) {
        int i;
        for(i = 0 ; i < this.quantidadeItens;i++){
            if(nome.equals(lista[i].getNome()))break;
        }   
        // return -1;
        lista[i].dvdInfo();
    }
    
    public void searchCodigoDeBarra(String codigoDeBarra) {
        int i;
        for(i =0;i < this.quantidadeItens;i++){
            if(codigoDeBarra.equals(lista[i].getCodigoDeBarras()))break;
        }
        lista[i].dvdInfo();
    }

    public void printEstoque(){
        for (int i = 0; i < this.quantidadeItens;i++) {
            if(lista[i].getPreco() != -1){
                lista[i].dvdInfo();
            }
        }
    }
}