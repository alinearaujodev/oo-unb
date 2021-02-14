import java.util.Scanner; // BIBLIOTECA

public class inmte {
	
	// funcoes
	static void menu() {
		// FUNCAO DO MENU
		System.out.print("--- MENU ---\n");
		System.out.print("1 - Entrada das temperaturas\n");
		System.out.print("2 - C�lculo da temperatura m�dia\n");
		System.out.print("3 - C�lculo da temperatura m�nima\n");
		System.out.print("4 - C�lculo da temperatura m�xima\n");
		System.out.print("5 - Relat�rio meteorol�gico\n");
		System.out.print("6 - Sair do sistema\n");
	}
	
	static void saberDados(int x, int y, double z[]) {
		// FUNCAO PARA SABER AS TEMPERATURAS DO MES
		int c;
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		System.out.print("-------------------------\n");
		// M�S COM 31 DIAS
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			System.out.print("Dados do M�s: " + x + "\n");
			for (c = 0; c <=30; c++) {
				System.out.print("Temperatura �C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
			
		} // MES COM 30 DIAS
		  else if (x == 4 || x == 6 || x == 9 || x == 11) {
			System.out.print("Dados do M�s: " + x + "\n");
			for (c = 0; c <=29; c++) {
				System.out.print("Temperatura �C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
			
		} // Mes de fevereiro com 29 dias 
		  else if (x == 2 && (y == 2012 || y == 2016 || y == 2020)){
			System.out.print("Dados do M�s: " + x + "\n");
			for (c = 0; c <=28; c++) {
				System.out.print("Temperatura �C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
		} // mes de fevereiro com 28 dias
		  else if (x == 2 && (y != 2012 || y != 2016 || y != 2020)){
			System.out.print("Dados do M�s: " + x + "\n");
			for (c = 0; c <=27; c++) {
				System.out.print("Temperatura �C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
		}
		
	}
	
	static void calcularMedia (int x, int y, double z[]) {
		// FUNCAO PARA CALCULAR A MEDIA
		int c;
		double media=0;
		
		System.out.print("-------------------------\n");
		for (c=0; c< z.length; c++) {
			media += z[c];
		}
		
		System.out.print("M�dia de " + x + " / " + y + " = " + (media/z.length) + "\n");
	}
	

	public static void main(String[] args) {
		int opcao, mes = 1, ano = 2020, copMes = mes, copAno = ano, escolheMes, escolheAno;
		
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		
		// Ano de 2011
		//double[] jan11 = new double[30], fev11 = new double[28], mar11 = new double[31], abr11 = new double[30], mai11 = new double[31], jun11 = new double[30], jul11 = new double[31], ago11 = new double[31], set11 = new double[30], out11 = new double[31], nov11 = new double[30], dez11 = new double[31];         
	// Ano de 2012
		//double[] jan12 = new double[30], fev12 = new double[29], mar12 = new double[31], abr12 = new double[30], mai12 = new double[31], jun12 = new double[30], jul12 = new double[31], ago12 = new double[31], set12 = new double[30], out12 = new double[31], nov12 = new double[30], dez12 = new double[31];         
	// Ano de 2013
		//double[] jan13 = new double[30], fev13 = new double[28], mar13 = new double[31], abr13 = new double[30], mai13 = new double[31], jun13 = new double[30], jul13 = new double[31], ago13 = new double[31], set13 = new double[30], out13 = new double[31], nov13 = new double[30], dez13 = new double[31];         
	// Ano de 2014
		//double[] jan14 = new double[30], fev14 = new double[28], mar14 = new double[31], abr14 = new double[30], mai14 = new double[31], jun14 = new double[30], jul14 = new double[31], ago14 = new double[31], set14 = new double[30], out14 = new double[31], nov14 = new double[30], dez14 = new double[31];         
	// Ano de 2015
		//double[] jan15 = new double[30], fev15 = new double[28], mar15 = new double[31], abr15 = new double[30], mai15 = new double[31], jun15 = new double[30], jul15 = new double[31], ago15 = new double[31], set15 = new double[30], out15 = new double[31], nov15 = new double[30], dez15 = new double[31];         
	// Ano de 2016
		//double[] jan16 = new double[30], fev16 = new double[29], mar16 = new double[31], abr16 = new double[30], mai16 = new double[31], jun16 = new double[30], jul16 = new double[31], ago16 = new double[31], set16 = new double[30], out16 = new double[31], nov16 = new double[30], dez16 = new double[31];         
	// Ano de 2017
		//double[] jan17 = new double[30], fev17 = new double[28], mar17 = new double[31], abr17 = new double[30], mai17 = new double[31], jun17 = new double[30], jul17 = new double[31], ago17 = new double[31], set17 = new double[30], out17 = new double[31], nov17 = new double[30], dez17 = new double[31];         
	// Ano de 2018
		//double[] jan18 = new double[30], fev18 = new double[28], mar18 = new double[31], abr18 = new double[30], mai18 = new double[31], jun18 = new double[30], jul18 = new double[31], ago18 = new double[31], set18 = new double[30], out18 = new double[31], nov18 = new double[30], dez18 = new double[31];         
	// Ano de 2019
		//double[] jan19 = new double[30], fev19 = new double[28], mar19 = new double[31], abr19 = new double[30], mai19 = new double[31], jun19 = new double[30], jul19 = new double[31], ago19 = new double[31], set19 = new double[30], out19 = new double[31], nov19 = new double[30], dez19 = new double[31];         
	// Ano de 2020
		double[] jan20 = new double[31], fev20 = new double[31];//, mar20 = new double[31], abr20 = new double[30], mai20 = new double[31], jun20 = new double[30], jul20 = new double[31], ago20 = new double[31], set20 = new double[30], out20 = new double[31], nov20 = new double[30], dez20 = new double[31];         
	
		
		// Dados janeiro 2020
		jan20 [0] = 32.5;
		jan20 [1] = 30.2;
		jan20 [2] = 32.7;
		jan20 [3] = 32;
		jan20 [4] = 23;
		jan20 [5] = 26.5;
		jan20 [6] = 21;
		jan20 [7] = 20.5;
		jan20 [8] = 20;
		jan20 [9] = 19;
		jan20 [10] = 25;
		jan20 [11] = 22.5;
		jan20 [12] = 24;
		jan20 [13] = 32;
		jan20 [14] = 25.8;
		jan20 [15] = 22.3;
		jan20 [16] = 21;
		jan20 [17] = 27;
		jan20 [18] = 28.5;
		jan20 [19] = 21;
		jan20 [20] = 22.5;
		jan20 [21] = 23.7;
		jan20 [22] = 30;
		jan20 [23] = 31.5;
		jan20 [24] = 31;
		jan20 [25] = 27.5;
		jan20 [26] = 25;
		jan20 [27] = 32.5;
		jan20 [28] = 32.5;
		jan20 [29] = 32.5;	
		
		do {
			menu();
			opcao = ler.nextInt();
			switch(opcao) {
				case 1:
					System.out.print("-------------------------\n");
					System.out.print("Entrada das temperaturas\n");
					do {
						// saber e validar m�s
						System.out.print("M�s: ");
						mes = ler.nextInt();
						
					} while (mes <= 0 || mes >= 13);
					do {
						// saber e validar ano
						System.out.print("Ano: ");
						ano = ler.nextInt();	
					} while (ano <=2010 || ano >= 2021);
					saberDados(mes, ano, jan20);
					break;	
				case 2:
					System.out.print("-------------------------\n");
					System.out.print("C�lculo da temperatura m�dia\n");
					do {
						// escolher mes cadastrado
						System.out.print("M�s: ");
						escolheMes = ler.nextInt();
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado m�s " + escolheMes + " no nosso banco de dados. Tente Novamente.\n");
						}
						
					} while (escolheMes != copMes);
					do {
						// escolher ano cadastrado
						System.out.print("Ano: ");
						escolheAno = ler.nextInt();	
						if (escolheAno != copAno) {
							System.out.print("Erro! N�o foi cadastrado ano " + escolheAno + " no nosso banco de dados. Tente Novamente.\n");
						}
					} while (escolheAno != copAno);
					calcularMedia(copMes, copAno, fev20);
					break;
					
				case 3:
					System.out.print("-------------------------\n");
					System.out.print("C�lculo da temperatura m�nima\n");
					do {
						// escolher mes cadastrado
						System.out.print("M�s: ");
						escolheMes = ler.nextInt();
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado m�s " + escolheMes + "no nosso banco de dados. Tente Novamente.\n");
						}
						
					} while (escolheMes != copMes);
					do {
						// escolher ano cadastrado
						System.out.print("Ano: ");
						escolheAno = ler.nextInt();	
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado ano " + escolheAno + "no nosso banco de dados. Tente Novamente.\n");
						}
					} while (escolheAno != copAno);
					break;
					
				case 4:
					System.out.print("-------------------------\n");
					System.out.print("C�lculo da temperatura m�xima\n");
					do {
						// escolher mes cadastrado
						System.out.print("M�s: ");
						escolheMes = ler.nextInt();
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado m�s " + escolheMes + "no nosso banco de dados. Tente Novamente.\n");
						}
						
					} while (escolheMes != copMes);
					do {
						// escolher ano cadastrado
						System.out.print("Ano: ");
						escolheAno = ler.nextInt();	
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado ano " + escolheAno + "no nosso banco de dados. Tente Novamente.\n");
						}
					} while (escolheAno != copAno);
					break;
					
				case 5:
					System.out.print("-------------------------\n");
					System.out.print("Relat�rio meteorol�gico\n");
					do {
						// escolher mes cadastrado
						System.out.print("M�s: ");
						escolheMes = ler.nextInt();
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado m�s " + escolheMes + "no nosso banco de dados. Tente Novamente.\n");
						}
						
					} while (escolheMes != copMes);
					do {
						// escolher ano cadastrado
						System.out.print("Ano: ");
						escolheAno = ler.nextInt();	
						if (escolheMes != copMes) {
							System.out.print("Erro! N�o foi cadastrado ano " + escolheAno + "no nosso banco de dados. Tente Novamente.\n");
						}
					} while (escolheAno != copAno);
					break;
					
				case 6:
					System.out.print("-------------------------\n");
					System.out.print("Sa�ndo do Sistema... Obrigado!\n");
					break;
					
				default:
					System.out.print("-------------------------\n");
					System.out.print("Comando Inv�lido, Tente novamente\n");
			}
			// Fazer variavel de escopo global
			copMes = mes;
			copAno = ano;
			for (int i=0; i < jan20.length; i++) {
				fev20[i]=jan20[i]; 
			}
		} while (opcao != 6);

	}
}
