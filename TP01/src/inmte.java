import java.util.Scanner; // BIBLIOTECA

public class inmte {
	
	// funcoes
	static void menu() {
		// FUNCAO DO MENU
		System.out.print("--- MENU ---\n");
		System.out.print("1 - Entrada das temperaturas\n");
		System.out.print("2 - Cálculo da temperatura média\n");
		System.out.print("3 - Cálculo da temperatura mínima\n");
		System.out.print("4 - Cálculo da temperatura máxima\n");
		System.out.print("5 - Relatório meteorológico\n");
		System.out.print("6 - Sair do sistema\n");
	}
	
	static void escolherMes(int y) {
		int x;
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		do {
			// escolher mes cadastrado
			System.out.print("Mês: ");
			x = ler.nextInt();
			if (x != y) {
				System.out.print("Erro! Não foi cadastrado mês " + x + " no nosso banco de dados. Tente Novamente.\n");
			}
			
		} while (x != y);
	}
	
	static void escolherAno(int y) {
		int x;
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		do {
			// escolher ano cadastrado
			System.out.print("Ano: ");
			x = ler.nextInt();	
			if (x != y) {
				System.out.print("Erro! Não foi cadastrado ano " + x + " no nosso banco de dados. Tente Novamente.\n");
			}
		} while (x != y);
		
	}
	
	static void saberDados(int x, int y, double z[]) {
		// FUNCAO PARA SABER AS TEMPERATURAS DO MES
		int c;
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		System.out.print("-------------------------\n");
		// MÊS COM 31 DIAS
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			System.out.print("Dados do Mês: " + x + "\n");
			for (c = 0; c <=30; c++) {
				System.out.print("Temperatura °C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
			
		} // MES COM 30 DIAS
		  else if (x == 4 || x == 6 || x == 9 || x == 11) {
			System.out.print("Dados do Mês: " + x + "\n");
			for (c = 0; c <=29; c++) {
				System.out.print("Temperatura °C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
			
		} // Mes de fevereiro com 29 dias 
		  else if (x == 2 && (y == 2012 || y == 2016 || y == 2020)){
			System.out.print("Dados do Mês: " + x + "\n");
			for (c = 0; c <=28; c++) {
				System.out.print("Temperatura °C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
		} // mes de fevereiro com 28 dias
		  else if (x == 2 && (y != 2012 || y != 2016 || y != 2020)){
			System.out.print("Dados do Mês: " + x + "\n");
			for (c = 0; c <=27; c++) {
				System.out.print("Temperatura °C do dia " + (c+1) + ": ");
				z[c] = ler.nextDouble();				
			}
		}
		
	}
	
	static void calcularMedia (int x, int y, double z[]) {
		// FUNCAO PARA CALCULAR A MEDIA
		int c;
		double media=0;
		
		System.out.print("-------------------------\n");
		// MÊS COM 31 DIAS
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			for (c = 0; c <=30; c++) {
				media += z[c];
			}	
			System.out.print("Média de " + x + "/" + y + " = " + (media/31) + "\n");
		} // MÊS COM 30 DIAS
		else if (x == 4 || x == 6 || x == 9 || x == 11) {
			for (c = 0; c <=29; c++) {
				media += z[c];
			}	
			System.out.print("Média de " + x + "/" + y + " = " + (media/30) + "\n");
		} // MES DE FEVEREIRO COM 29 DIAS
		else if (x == 2 && (y == 2012 || y == 2016 || y == 2020)) {
			for (c = 0; c <=28; c++) {
				media += z[c];
			}	
			System.out.print("Média de " + x + "/" + y + " = " + (media/29) + "\n");
		} // MES DE FEVEREIRO COM 28 DIAS
		else if (x == 2 && (y != 2012 || y != 2016 || y != 2020)) {
			for (c = 0; c <=27; c++) {
				media += z[c];
			}	
			System.out.print("Média de " + x + "/" + y + " = " + (media/28) + "\n");
		}

	}
	
	static void calcularMinima (int x, int y, double z[]) {
		// FUNCAO PARA CALCULAR A temperatura minima
		int c, diaMin = 1;
		double minima = 10000, min = 0;
				
		System.out.print("-------------------------\n");
		// MÊS COM 31 DIAS
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			for (c = 0; c <=30; c++) {
				if (z[c] < minima) {
					min = z[c];
					minima = min;
					diaMin = (c + 1);
				}
			}
			System.out.print("Temperatura Mínima = " + min + "\n");
			System.out.print(diaMin + "/" + x + "/" + y + "\n");
			
		} // MÊS COM 30 DIAS
		else if (x == 4 || x == 6 || x == 9 || x == 11) {
			for (c = 0; c <=29; c++) {
				if (z[c] < minima) {
					min = z[c];
					minima = min;
					diaMin = (c + 1);
				}
			}
			System.out.print("Temperatura Mínima = " + min + "\n");
			System.out.print(diaMin + "/" + x + "/" + y + "\n");
			
		} // MÊS de FEVEREIRO COM 29 DIAS
		else if (x == 2 && (y == 2012 || y == 2016 || y == 2020)) {
			for (c = 0; c <=28; c++) {
				if (z[c] < minima) {
					min = z[c];
					minima = min;
					diaMin = (c + 1);
				}
			}	
			System.out.print("Temperatura Mínima = " + min + "\n");
			System.out.print(diaMin + "/" + x + "/" + y + "\n");
			
		} // MÊS de FEVEREIRO COM 28 DIAS
		else if (x == 2 && (y != 2012 || y != 2016 || y != 2020)) {
			for (c = 0; c <=27; c++) {
				if (z[c] < minima) {
					min = z[c];
					minima = min;
					diaMin = (c +1); 
				}
			}	
			System.out.print("Temperatura Mínima = " + min + "\n");
			System.out.print(diaMin + "/" + x + "/" + y + "\n");
		} 
	}

	static void calcularMaxima(int x, int y, double z[]) {
		// FUNCAO PARA CALCULAR A temperatura maxima
		int c,  diaMax = 1;
		double maxima = 0, max = 1;
						
		System.out.print("-------------------------\n");
		// MÊS COM 31 DIAS
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			for (c = 0; c <=30; c++) {
				if (z[c] > maxima) {
					max = z[c];
					maxima = max;
					diaMax = (c + 1);
				}
			}
			System.out.print("Temperatura Maxima = " + max + "\n");
			System.out.print(diaMax + "/" + x + "/" + y + "\n");
					
		} // MÊS COM 30 DIAS
		else if (x == 4 || x == 6 || x == 9 || x == 11) {
			for (c = 0; c <=29; c++) {
				if (z[c] > maxima) {
					max = z[c];
					maxima = max;
					diaMax = (c + 1);
				}
			}
			System.out.print("Temperatura Maxima = " + max + "\n");
			System.out.print(diaMax + "/" + x + "/" + y + "\n");
					
		} // MÊS de FEVEREIRO COM 29 DIAS
		else if (x == 2 && (y == 2012 || y == 2016 || y == 2020)) {
			for (c = 0; c <=28; c++) {
				if (z[c] > maxima) {
					max = z[c];
					maxima = max;
					diaMax = (c + 1);
				}
			}	
			System.out.print("Temperatura Maxima = " + max + "\n");
			System.out.print(diaMax + "/" + x + "/" + y + "\n");
			
		} // MÊS de FEVEREIRO COM 28 DIAS
		else if (x == 2 && (y != 2012 || y != 2016 || y != 2020)) {
			for (c = 0; c <=27; c++) {
				if (z[c] > maxima) {
					max = z[c];
					maxima = max;
					diaMax = (c+1); 
				}
			}	
			System.out.print("Temperatura Maxima = " + max + "\n");
			System.out.print(diaMax + "/" + x + "/" + y + "\n");
		} 
		
	}
	
	static void printDia(int x, int y, double z[]) {
		int c;
		System.out.print("-------------------------\n");
		// MÊS COM 31 DIAS
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			for (c = 0; c <=30; c++) {
				System.out.print("Dia " + (c+1) + ": " + z[c] + "\n");
			}
		}// MÊS COM 30 DIAS
		else if (x == 4 || x == 6 || x == 9 || x == 11) {
			for (c = 0; c <=29; c++) {
				System.out.print("Dia " + (c+1) + ": " + z[c] + "\n");
			}
							
		} // MÊS de FEVEREIRO COM 29 DIAS
		else if (x == 2 && (y == 2012 || y == 2016 || y == 2020)) {
			for (c = 0; c <=28; c++) {
				System.out.print("Dia " + (c+1) + ": " + z[c] + "\n");
			}
		} // MÊS de FEVEREIRO COM 28 DIAS
		else if (x == 2 && (y != 2012 || y != 2016 || y != 2020)) {
			for (c = 0; c <=27; c++) {
				System.out.print("Dia " + (c+1) + ": " + z[c] + "\n");
			}	
		} 
	}

	public static void main(String[] args) {
		int opcao, mes = 1, ano = 2020, copMes = mes, copAno = ano;
		
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		double[] mes1 = new double[31], mes1Cop = new double[31];
	
		
		// Dados janeiro 2020
		mes1 [0] = 32.5;
		mes1 [1] = 30.2;
		mes1 [2] = 32.7;
		mes1 [3] = 32;
		mes1 [4] = 23;
		mes1 [5] = 26.5;
		mes1 [6] = 21;
		mes1 [7] = 20.5;
		mes1 [8] = 20;
		mes1 [9] = 19;
		mes1 [10] = 25;
		mes1 [11] = 22.5;
		mes1 [12] = 24;
		mes1 [13] = 32;
		mes1 [14] = 25.8;
		mes1 [15] = 22.3;
		mes1 [16] = 21;
		mes1 [17] = 27;
		mes1 [18] = 28.5;
		mes1 [19] = 21;
		mes1 [20] = 22.5;
		mes1 [21] = 23.7;
		mes1 [22] = 30;
		mes1 [23] = 31.5;
		mes1 [24] = 31;
		mes1 [25] = 27.5;
		mes1 [26] = 25;
		mes1 [27] = 32.5;
		mes1 [28] = 32.5;
		mes1 [29] = 32.5;	
		
		do {
			menu();
			opcao = ler.nextInt();
			switch(opcao) {
				case 1:
					System.out.print("-------------------------\n");
					System.out.print("Entrada das temperaturas\n");
					do {
						// saber e validar mês
						System.out.print("Mês: ");
						mes = ler.nextInt();
						
					} while (mes <= 0 || mes >= 13);
					do {
						// saber e validar ano
						System.out.print("Ano: ");
						ano = ler.nextInt();	
					} while (ano <=2010 || ano >= 2021);
					saberDados(mes, ano, mes1);
					break;	
				case 2:
					System.out.print("-------------------------\n");
					System.out.print("Cálculo da temperatura média\n");
					escolherMes(copMes);
					escolherAno(copAno);
					calcularMedia(copMes, copAno, mes1Cop);
					break;
					
				case 3:
					System.out.print("-------------------------\n");
					System.out.print("Cálculo da temperatura mínima\n");
					escolherMes(copMes);
					escolherAno(copAno);
					calcularMinima(copMes, copAno, mes1Cop);
					break;
					
				case 4:
					System.out.print("-------------------------\n");
					System.out.print("Cálculo da temperatura máxima\n");
					escolherMes(copMes);
					escolherAno(copAno);
					calcularMaxima(copMes, copAno, mes1Cop);
					break;
					
				case 5:
					System.out.print("-------------------------\n");
					System.out.print("Relatório meteorológico\n");
					escolherMes(copMes);
					escolherAno(copAno);
					printDia(copMes, copAno, mes1Cop);
					calcularMedia(copMes, copAno, mes1Cop);
					calcularMinima(copMes, copAno, mes1Cop);
					calcularMaxima(copMes, copAno, mes1Cop);
					break;			
				case 6:
					// SAIR DO PROGRAMA
					System.out.print("-------------------------\n");
					System.out.print("Saíndo do Sistema... Obrigado!\n");
					break;
					
				default:
					// CASO OPCAO SEJA INVALIDA
					System.out.print("-------------------------\n");
					System.out.print("Comando Inválido, Tente novamente\n");
			}
			// Fazer variavel de escopo global
			copMes = mes;
			copAno = ano;
			for (int i=0; i < mes1.length; i++) {
				mes1Cop[i]=mes1[i]; 
			}
		} while (opcao != 6);

	}
}
