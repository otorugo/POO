package app.lib;

public class Cds extends Produtos {
    Cd[] lista;

    public Cds(int capacidadeLoja){
        super();
        lista = new Cd[capacidadeLoja];
    }
    public void addCd(Cd cd) {
        lista[this.quantidadeItens] = cd;
        this.raiseQuantidadeItens();
    }
    public void addCds(Cds arrayCds){
        for(int i = 0;i < arrayCds.quantidadeItens ;i++){
            addCd(arrayCds.lista[i]);            
        }
    }

    public void searchNome(String nome) {
        int i;
        for(i = 0 ; i < this.quantidadeItens;i++){
            if(nome.equals(lista[i].getNome()))break;
        }   
        // return -1;
        lista[i].cdInfo();
    }
    
    public void searchCodigoDeBarra(String codigoDeBarra) {
        int i;
        for(i =0;i < this.quantidadeItens;i++){
            if(codigoDeBarra.equals(lista[i].getCodigoDeBarras()))break;
        }
        lista[i].cdInfo();
    }

    public void printEstoque(){
        for (int i = 0; i < this.quantidadeItens;i++) {
            if(lista[i].getQuantidadeProduto() != 0){
                lista[i].cdInfo();
            }
        }
    }

}