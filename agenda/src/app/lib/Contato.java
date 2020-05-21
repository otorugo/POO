package app.lib;

public abstract class Contato {
    public String nome = "";
    public String email = "";

    public Contato(String nome,String email) {
        this.nome = nome;
        this.email = email;
    }
    public void getNome(){
        System.out.println(this.nome);
    }

}