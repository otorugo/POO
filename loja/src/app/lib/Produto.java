package app.lib;

public class Produto {
    private String nome;
    private String codigoDeBarras;
    private int volume;
    private double preco;
    private String artista;
    private int quantidadeProduto;
    /**
     * 
     * @param nome, nome do produto
     * @param codigoDeBarras, numero identificador unico do tipo do produto
     * @param preco, double com preco do produto
     * @param volume, volume da edicao do produto
     * @param artista, autor do produto
     */
    public Produto(String nome, String codigoDeBarras, double preco, int volume,String artista,int quantidadeProduto){
        this.nome =  nome;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        this.volume = volume;
        this.artista = artista;
        this.quantidadeProduto = quantidadeProduto;
    }
    /**
     * 
     * @return nome do produto
     */
    public String getNome(){
        return this.nome;
    };
    /**
     * 
     * @return Codigo de Barras
     */
    public String getCodigoDeBarras(){
        return this.codigoDeBarras;
    };
    /**
     * 
     * @return retorna Preco
     */
    public double getPreco(){
        return this.preco;
    };
        /**
     * @return the volume
     */
    public int getVolume() {
        return this.volume;
    }
    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }
    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }
    /**
     * @param codigoDeBarras the codigoDeBarras to set
     */
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }


    /**
     * @return the quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    /**
     * @param quantidadeProduto the quantidadeProduto to set
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    //String nome, String codigoDeBarras, double preco, int volume,String artista
    public void printInfo(){
        System.out.printf("Nome : %s\n",this.nome);
        System.out.printf("Codigo de Barras : %s\n",this.codigoDeBarras);
        System.out.printf("Preço : %.2f\n",this.preco);
        System.out.printf("Volume : %d\n",this.volume);
        System.out.printf("Artista : %s\n",this.artista);
        System.out.printf("Quantidade : %d\n",this.quantidadeProduto);
    }
    public void venderProduto(){
        if(this.quantidadeProduto != 0){
            this.quantidadeProduto--;
        }else{
            System.out.println("Produto Esgotou");
        }
    }
    
}