package app.lib;

public class Juridica extends Contato{

    int CNPJ;
    String endereco = "";
    String inscricaoEstadual = "";
    String razaoSocial = "";

    public Juridica(int CNPJ, String nome, String endereco,
     String email,String razaoSocial,String inscricaoEstadual) {
     
        super(nome,email); 
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.inscricaoEstadual = inscricaoEstadual;
    }
}