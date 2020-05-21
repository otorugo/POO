package app.lib;

public class Livro extends Produto {
    private int edicao;
    private int paginas;

    /**
     * 
     * @param nome
     * @param codigoDeBarras
     * @param preco
     * @param volume
     * @param edicao, edicao existente do livro
     * @param artista
     * @param paginas, numero de paginas
     */
    public Livro(String nome, String codigoDeBarras,double preco, int volume,int copias, int edicao,String artista,int paginas){
        super(nome,codigoDeBarras,preco,volume,artista,copias);
        this.edicao = edicao;
        this.paginas = paginas;
    }

    /**
     * @return the edicao
     */
    public int getEdicao() {
        return this.edicao;
    }
    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    /**
     * @return the paginas
     */
    public int getPaginas() {
        return paginas;
    }
    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void livroInfo(){
        printInfo();
        System.out.printf("Edição: %d°\n",this.edicao);
        System.out.printf("Paginas: %d pg.\n",this.paginas);

    }


}