package app;

import java.io.IOException;

// import java.io.IOException;

import app.lib.*;

/**
 * App
 */
public class App {
    public static void main(String[] args) throws IOException {
        RolaDados r = new RolaDados();
        Placar p = new Placar();

        for(int i = 10; i >0;i--){
            System.out.println("Pressione ENTER para começar a rodada.");
            r.rolaDados();
            r.printDados();
            System.out.println("Escolha os dados a serem rolados(Separados por espaço):");
            r.parseToInt();
            r.printDados();
            System.out.println("Escolha os dados a serem rolados(Separados por espaço):");
            r.parseToInt();
            r.printDados();

            p.printPlacar();
            System.out.println("Selecione a posição que deseja ocupar :");
            p.choice(r);
            p.printPlacar();
        }


        
    }
}