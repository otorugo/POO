package app.lib;

public class Livros extends Produtos {
    Livro[] lista;

    public Livros(int capacidadeLoja){
        super();
        lista = new Livro[capacidadeLoja];
    }
    public void addLivro(Livro livro) {
        lista[this.quantidadeItens] = livro;
        this.raiseQuantidadeItens();
    }
    public void addLivros(Livros arrayLivros){
        for(int i = 0;i < arrayLivros.quantidadeItens ;i++){
            addLivro(arrayLivros.lista[i]);            
        }
    }

    public void searchNome(String nome) {
        int i;
        for(i = 0 ; i < this.quantidadeItens;i++){
            if(nome.equals(lista[i].getNome()))break;
        }   
        // return -1;
        lista[i].livroInfo();
    }
    
    public void searchCodigoDeBarra(String codigoDeBarra) {
        int i;
        for(i =0;i < this.quantidadeItens;i++){
            if(codigoDeBarra.equals(lista[i].getCodigoDeBarras()))break;
        }
        lista[i].livroInfo();
    }


    public void printEstoque(){
        for (int i = 0; i < this.quantidadeItens;i++) {
            if(lista[i].getPreco() != -1){
                lista[i].livroInfo();
            }
        }
    }


}