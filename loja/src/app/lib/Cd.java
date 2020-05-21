package app.lib;

public class Cd extends Produto {
    private int duracaoMin;
    /**
     * 
     * @param nome
     * @param codigoDeBarras
     * @param preco
     * @param volume
     * @param duracaoMin duracao do disco
     * @param artista
     */
    public Cd(String nome, String codigoDeBarras,double preco,int copias,int volume,int duracaoMin, String artista){
        super(nome,codigoDeBarras,preco,volume,artista,copias);
        this.duracaoMin = duracaoMin;
    }

    /**
     * @return the duracaoMin
     */
    public int getDuracaoMin() {
        return duracaoMin;
    }
    /**
     * @param duracaoMin the duracaoMin to set
     */
    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public void cdInfo(){
        printInfo();
        System.out.printf("Duracao : %d min\n",this.duracaoMin);
    }

}