package app.lib;
import java.util.Random;



public class Dado {

    String lado[][] = new String[5][7];
    private int numero = 0;

    public Dado(int numero){

        this.numero = numero;

        if(this.numero == 1){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = " ";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = " ";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = "*";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = " ";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = " ";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 2){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = " ";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = " ";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = " ";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 3){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = " ";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = "*";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = " ";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 4){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = "*";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = " ";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = "*";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 5){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = "*";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = "*";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = "*";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 6){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = "*";lado[1][4] = " ";lado[1][5] = "*";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = " ";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = "*";lado[3][2] = " ";lado[3][3] = "*";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }

    }
    public void getLado(){
        for(int i = 0; i < 5;i++){
            for(int j =0; j < 7;j++){
                System.out.printf("%s",this.lado[i][j]);
            }
        }
    }





    public void rolar(){

        Random gerador = new Random();
        this.numero = gerador.nextInt(6) + 1;
        if(this.numero == 1){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = " ";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = " ";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = "*";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = " ";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = " ";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 2){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = " ";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = " ";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = " ";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 3){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = " ";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = "*";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = " ";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 4){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = "*";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = " ";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = "*";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 5){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = " ";lado[1][4] = " ";lado[1][5] = "*";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = "*";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = "*";lado[3][2] = " ";lado[3][3] = " ";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
        if(this.numero == 6){
            lado[0][0] = "+";lado[0][1] = "-";lado[0][2] = "-";lado[0][3] = "-";lado[0][4] = "-";lado[0][5] = "-";lado[0][6] = "+   ";
            lado[1][0] = "|";lado[1][1] = "*";lado[1][2] = " ";lado[1][3] = "*";lado[1][4] = " ";lado[1][5] = "*";lado[1][6] = "|   ";
            lado[2][0] = "|";lado[2][1] = " ";lado[2][2] = " ";lado[2][3] = " ";lado[2][4] = " ";lado[2][5] = " ";lado[2][6] = "|   ";
            lado[3][0] = "|";lado[3][1] = "*";lado[3][2] = " ";lado[3][3] = "*";lado[3][4] = " ";lado[3][5] = "*";lado[3][6] = "|   ";
            lado[4][0] = "+";lado[4][1] = "-";lado[4][2] = "-";lado[4][3] = "-";lado[4][4] = "-";lado[4][5] = "-";lado[4][6] = "+   ";
        }
    }
    
    public String toString() {
        return "getLado() retorna o lado do dado" + "rolar() rola o dado";
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }


}