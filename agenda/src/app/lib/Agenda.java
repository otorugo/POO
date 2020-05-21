package app.lib;
// import app.lib.Fisica;


public class Agenda{
    Fisica[] contatosCPF = new Fisica[100];
    Juridica[] contatosCNPJ = new Juridica[100];
    private int quantidadeCPF = 0;
    private int quantidadeCNPJ = 0;
    private int isSorted = -1;







    public Agenda(){

    }
    /*
     * Funcao que adiciona novo contato de pessoa fisica 
     * na Agenda
     * @param c
     */
    public void novoCPF(Fisica f){
        this.contatosCPF[this.quantidadeCPF++] = f;
        this.isSorted = -1;
        return;
    }
    /*
     * Adiciona um novo CNPJ a agenda
     */
    public void novoCNPJ(Juridica j){
        this.isSorted = -1;
        this.contatosCNPJ[this.quantidadeCNPJ++] = j;
        return;
    }
    /*
     * Busca Pessoa pelo nome
     */
    public int buscaPessoa(String nome){
        int i;
        for(i = 0;i < this.quantidadeCPF;i++){
            if(nome.equals(this.contatosCPF[this.quantidadeCPF].nome)){ return i;};
        }
        return -1;
    }
    /*
     *  Busca Pessoa pelo CPF
     */
    public int buscaPessoa(int CPF){
        int i;
        for(i = 0;i < this.quantidadeCPF;i++){
            if(CPF == this.contatosCPF[i].CPF){ return i;};
        }
        return -1;
    }
    /*
     * Busca Empresa pelo nome
     */
    public int buscaEmpresa(String nomeEmpresa){
        int i;
        for(i = 0;i < this.quantidadeCNPJ;i++){
            if(nomeEmpresa.equals(this.contatosCNPJ[i].nome)){ return i;};
        }
        return -1;
    }
    /*
     * Busca Empresa pelo CNPJ
     */
    public int buscaEmpresaCNPJ(int CNPJ){
        int i;
        for(i = 0;i < this.quantidadeCNPJ;i++){
            if(CNPJ == this.contatosCNPJ[i].CNPJ)return i;
        }
        return -1;
    }
    
    /*
     * Remove pessoa pelo nome
     */
    public void removerCPF(String nome) {
        int pos = this.buscaPessoa(nome);
        if(-1 != pos){
            this.contatosCPF[pos].CPF = -1;
        }
    }
    /*
     * Remove pessoa pelo CPF
     */
    public void removerCPF(int CPF) {
        int pos = this.buscaPessoa(CPF);
        if(-1 != pos){
            this.contatosCPF[pos].CPF = -1;
        }
    }
    //Remove Empresa pelo Nome
    public void removerEmpresa(String nomeEmpresa) {
        int pos = this.buscaEmpresa(nomeEmpresa);
        if(-1 != pos){
            this.contatosCNPJ[pos].CNPJ = -1;
        }
    }
    //Remove empresa pelo  CNPJ
    public void removerEmpresaCNPJ(int CNPJ) {
        int pos = this.buscaEmpresaCNPJ(CNPJ);
        if(-1 != pos){
            this.contatosCNPJ[pos].CNPJ = -1;
        }
    }

    private void bubblesortFisica(){
        Fisica aux;
        this.isSorted = 1;
        for(int i = 0;i < this.quantidadeCPF;i++){
            for(int j = i; j < this.quantidadeCPF;j++){
                if(this.contatosCPF[i].CPF >this.contatosCPF[j].CPF){
                    aux = this.contatosCPF[i];
                    this.contatosCPF[i] = this.contatosCPF[j];
                    this.contatosCPF[j] = aux;
                }
            }
        }
        return;
    }
    private void bubblesortJuridica(){
        Juridica aux;
        
        for(int i = 0;i < this.quantidadeCNPJ;i++){
            for(int j = i; j < this.quantidadeCNPJ;j++){
                if(this.contatosCNPJ[i].CNPJ >this.contatosCNPJ[j].CNPJ){
                    aux = this.contatosCNPJ[i];
                    this.contatosCNPJ[i] = this.contatosCNPJ[j];
                    this.contatosCNPJ[j] = aux;
                }
            }
        }
        return;
    }




    //Print Contatos Pessoas
    public void printPessoa(){
        if(this.isSorted != 1) bubblesortFisica();
        this.isSorted = 1;
        for(int i = 0; i < quantidadeCPF; i++){
            if(contatosCPF[i].CPF != -1){
            System.out.println("----------------------");
            System.out.printf("-- Nome: %s --\n",contatosCPF[i].nome);
            System.out.printf("-- CPF: %d --\n",contatosCPF[i].CPF);
            System.out.printf("-- Data de Nascimento: %s --\n",contatosCPF[i].dataNascimento);
            System.out.printf("-- Email: %s --\n",contatosCPF[i].email);
            System.out.printf("-- Estado Civil: %s --\n",contatosCPF[i].estadoCivil);
            System.out.println("----------------------");
            }    
        }
    }

    //print Empresas
    public void printEmpresas(){
        if(this.isSorted != 1)bubblesortJuridica();
        this.isSorted = 1;
        for(int i = 0; i < quantidadeCNPJ; i++){
            if(contatosCNPJ[i].CNPJ != -1){
            System.out.println("----------------------");
            System.out.printf("-- Nome: %s --\n",contatosCNPJ[i].nome);
            System.out.printf("-- CNPJ: %d --\n",contatosCNPJ[i].CNPJ);
            System.out.printf("-- Endereço: %s --\n",contatosCNPJ[i].endereco);
            System.out.printf("-- Email: %s --\n",contatosCNPJ[i].email);
            System.out.printf("-- Razao Social: %s --\n",contatosCNPJ[i].razaoSocial);
            System.out.printf("-- Inscrição Estadual: %s --\n",contatosCNPJ[i].inscricaoEstadual);
            System.out.println("----------------------");
            }    
        }
    }
    public void printAgenda(){
        printPessoa();
        printEmpresas();
    }






}