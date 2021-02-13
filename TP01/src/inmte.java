import java.util.Scanner; // BIBLIOTECA

public class inmte {
	
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
					System.out.print("C�lculo da temperatura m�dia\n");
					break;
				case 3:
					System.out.print("-------------------------\n");
					System.out.print("C�lculo da temperatura m�nima\n");
					break;
				case 4:
					System.out.print("-------------------------\n");
					System.out.print("C�lculo da temperatura m�xima\n");
					break;
				case 5:
					System.out.print("-------------------------\n");
					System.out.print("Relat�rio meteorol�gico\n");
					break;
				case 6:
					System.out.print("-------------------------\n");
					System.out.print("Sa�ndo do Sistema... Obrigado!\n");
					break;
				default:
					System.out.print("-------------------------\n");
					System.out.print("Comando Inv�lido, Tente novamente\n");
			}
			
		} while (opcao != 6);

	}

	
}
