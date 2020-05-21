package app.lib;

public class Produtos {
    int quantidadeItens = 0;

    /**
     * @return the quantidadeItens
     */
    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    /**
     * @param quantidadeItens the quantidadeItens to set
     */
    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
    /**
     * aumenta a quantidadeItens de itens
     */
    void raiseQuantidadeItens(){
        this.quantidadeItens++;
    }






}