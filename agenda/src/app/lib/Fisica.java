package app.lib;



public class Fisica extends Contato{
    int CPF;
    public String estadoCivil = "";
    public String dataNascimento = "";
    public Fisica(int CPF, String nome, String dataNascimento, String email,String estadoCivil) {
        super(nome,email); 
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

}