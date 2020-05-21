package app.lib;

public class Dvd extends Cd {
    private int qualidade;
    
    public Dvd(String nome, String codigoDeBarras,double preco,int volume,int copias,int duracaoMin, String artista,int qualidade){
        super(nome, codigoDeBarras, preco,copias, volume, duracaoMin, artista);
        this.qualidade = qualidade;
    }
	/**
     * @return the qualidade
     */
    public int getQualidade() {
        return qualidade;
    }
    /**
     * @param qualidade the qualidade to set
     */
    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public void dvdInfo(){
        cdInfo();
        System.out.printf("Qualidade: %d p\n",this.qualidade);
    }


}