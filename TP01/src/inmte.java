import java.util.Scanner; // BIBLIOTECA

public class inmte {
	
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

	public static void main(String[] args) {
		int opcao;
		Scanner ler = new Scanner(System.in); //LEITURA DOS DADOS
		
		do {
			menu();
			opcao = ler.nextInt();
			switch(opcao) {
				case 1:
					System.out.print("-------------------------\n");
					System.out.print("Entrada das temperaturas\n");
					break;
				case 2:
					System.out.print("-------------------------\n");
					System.out.print("Cálculo da temperatura média\n");
					break;
				case 3:
					System.out.print("-------------------------\n");
					System.out.print("Cálculo da temperatura mínima\n");
					break;
				case 4:
					System.out.print("-------------------------\n");
					System.out.print("Cálculo da temperatura máxima\n");
					break;
				case 5:
					System.out.print("-------------------------\n");
					System.out.print("Relatório meteorológico\n");
					break;
				case 6:
					System.out.print("-------------------------\n");
					System.out.print("Saíndo do Sistema... Obrigado!\n");
					break;
				default:
					System.out.print("-------------------------\n");
					System.out.print("Comando Inválido, Tente novamente\n");
			}
			
		} while (opcao != 6);

	}

	
}
