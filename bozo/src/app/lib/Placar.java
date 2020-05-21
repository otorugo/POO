package app.lib;

import java.io.IOException;

public class Placar {
	String placar[][] = { 
			{ "(", "1", ")", "	|  ", "(", "7", ")", "  |   ", "(", "4", ")", "\n" },
			{ "(", "2", ")", "	|  ", "(", "8", ")", "  |   ", "(", "5", ")", "\n" },
			{ "(", "3", ")", "	|  ", "(", "9", ")", "  |   ", "(", "6", ")", "\n" },
			{ " ", " ", " ", "	|  ", "(", "10", ")", "	|   ", " ", " ", " ", "\n" }, };

	/**
	 * @return the placar
	 */
	public String[][] getPlacar() {
		return placar;
	}

	public void printPlacar() {
		int i = 0;
		for (i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.printf("%s", placar[i][j]);
			}
			if (i < 3)
				System.out.println("------------------------");
			if (i == 3)
				System.out.println("	+-------+	  ");
		}
	}

	private void setPos(RolaDados rd,int choice){
		int count = 0;
		for(int i = 0;i< 5;i++){
            if(rd.dados[i].getNumero() == choice){
                count +=1;
            }
        }

		if(choice == 1){
			placar[0][0] =String.format(" ");
			placar[0][1] =String.format("%d",count*choice);
			placar[0][2] =String.format(" ");
		}
		if(choice == 2){
			placar[1][0] =String.format(" ");
			placar[1][1] =String.format("%d",count*choice);
			placar[1][2] =String.format(" ");
		}
		if(choice == 3){
			placar[2][0] =String.format(" ");
			placar[2][1] =String.format("%d",count*choice);
			placar[2][2] =String.format(" ");
		}
		if(choice == 4){
			placar[0][8] =String.format(" ");
			placar[0][9] =String.format("%d",count*choice);
			placar[0][10] =String.format(" ");
		}
		if(choice == 5){
			placar[1][8] =String.format(" ");
			placar[1][9] =String.format("%d",count*choice);
			placar[1][10] =String.format(" ");
		}
		if(choice == 6){
			placar[2][8] =String.format(" ");
			placar[2][9] =String.format("%d",count*choice);
			placar[2][10] =String.format(" ");
		}
	}

	private void setRepetitions(RolaDados rd, int choice){
		int count = 0;
		if(choice == 7){
			for(int i = 0;i < 5;i++){
				for(int j = i;j<5;j++){
					if(rd.dados[i].getNumero() == rd.dados[j].getNumero()){
						count++;
					}
					if(count == 3){
						placar[0][4] =String.format(" ");
						placar[0][5] =String.format("%d",15);
						placar[0][6] =String.format(" ");
						return;
					}
				}
				count = 0;
			}			
			placar[0][4] =String.format(" ");
			placar[0][5] =String.format("%d",0);
			placar[0][6] =String.format(" ");
			return;
		}
		if(choice == 8){
			count = rd.dados[0].getNumero();

			for(int j = 0;j<5;j++){
				if(rd.dados[j].getNumero() != count){
					placar[1][4] =String.format(" ");
					placar[1][5] =String.format("%d",0);
					placar[1][6] =String.format(" ");
					return;
				}
				count++;
			}
			placar[1][4] =String.format(" ");
			placar[1][5] =String.format("%d",20);
			placar[1][6] =String.format(" ");
			return;
		}

		if(choice == 9){
			for(int i = 0;i < 5;i++){
				for(int j = i;j<5;j++){
					if(rd.dados[i].getNumero() == rd.dados[j].getNumero()){
						count++;
					}
					if(count == 4){
						placar[2][4] =String.format(" ");
						placar[2][5] =String.format("%d",30);
						placar[2][6] =String.format(" ");
						return;
					}
				}
				count = 0;
			}			
			placar[2][4] =String.format(" ");
			placar[2][5] =String.format("%d",0);
			placar[2][6] =String.format(" ");
			return;
		}
		if(choice == 10){
			for(int i = 0;i < 5;i++){
				for(int j = i;j<5;j++){
					if(rd.dados[i].getNumero() == rd.dados[j].getNumero()){
						count++;
					}
					if(count == 5){
						placar[3][4] =String.format(" ");
						placar[3][5] =String.format("%d",40);
						placar[3][6] =String.format(" ");
						return;
					}
				}
				count = 0;
			}			
			placar[3][4] =String.format(" ");
			placar[3][5] =String.format("%d",0);
			placar[3][6] =String.format(" ");
			return;
		}


	}



	public void choice(RolaDados rd) throws IOException {
		int choice = EntradaTeclado.leInt();
		if(choice > 0 && choice < 7){
			setPos(rd, choice);
		}else{
			setRepetitions(rd, choice);
		}
    }


}