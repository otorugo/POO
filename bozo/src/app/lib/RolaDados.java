package app.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RolaDados {

    public Dado[] dados = new Dado[5];
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public RolaDados() {
        Random gerador = new Random();
        dados[0] = new Dado(gerador.nextInt(6)+1);
        dados[1] = new Dado(gerador.nextInt(6)+1);
        dados[2] = new Dado(gerador.nextInt(6)+1);
        dados[3] = new Dado(gerador.nextInt(6)+1);
        dados[4] = new Dado(gerador.nextInt(6)+1);
        // dados[0] = new Dado(3);
        // dados[1] = new Dado(2);
        // dados[2] = new Dado(3);
        // dados[3] = new Dado(4);
        // dados[4] = new Dado(5);
    }

    public void rolaDados(){
        Random gerador = new Random();
        dados[0] = new Dado(gerador.nextInt(6)+1);
        dados[1] = new Dado(gerador.nextInt(6)+1);
        dados[2] = new Dado(gerador.nextInt(6)+1);
        dados[3] = new Dado(gerador.nextInt(6)+1);
        dados[4] = new Dado(gerador.nextInt(6)+1);
    }


    public void parseToInt()throws IOException{
        int index = 0;
        String numero = null;
        numero = read.readLine();

        for(int i =0;i < numero.length();i++){
            if(numero.charAt(i) != ' '){
              index = Integer.parseInt(String.format("%c",numero.charAt(i)));
            //   System.out.println(index);
              //rola dados selecionados
              dados[index-1].rolar();
            }
        }
    }

    public void printDados(){
        for(int i = 0;i <5;i++){
            for(int k = 0; k <5 ;k++){
                for(int j = 0; j < 7;j++){
                    System.out.printf("%s",dados[k].lado[i][j]);
                }
            }
            System.out.printf("    ");
            System.out.println("");
        }
    }



    
}