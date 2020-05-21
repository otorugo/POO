package app;
import app.lib.*;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda a = new Agenda();

        Fisica f2 = new Fisica(2153, "Teste", "00/01/0000","teste@gmail.com", "solteiro");
        Fisica f3 = new Fisica(2113, "Teste", "00/01/0000","teste@gmail.com", "solteiro");
        Fisica f = new Fisica(213, "Teste", "00/01/0000","teste@gmail.com", "solteiro");
        




        Juridica j = new Juridica(40028922, "Teste", "Rua : Teste","teste@gmail.com","Bom dia & CIA","blablabla");
        a.novoCPF(f2);
        a.novoCPF(f3);
        a.novoCPF(f);
        
        
        a.novoCNPJ(j);
        a.printAgenda();
    }
}