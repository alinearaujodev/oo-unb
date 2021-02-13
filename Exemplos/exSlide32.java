import java.util.Scanner; // BIBLIOTECA

public class exSlide32 {

	public static void main(String[] args) {
		int day, month, year;
		
		// LEITURA DOS DADOS
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o dia: \n");
		day = ler.nextInt();
		System.out.print("Digite o mes: \n");
		month = ler.nextInt();
		System.out.print("Digite o ano: \n");
		year = ler.nextInt();

		// VERIFICAÇÃO DOS DADOS
		if (month >= 1 && month <= 12) {
			// MES VALIDO 
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day >= 1 && day <= 31) {
					// DIA VALIDO
					System.out.println("Data Válida. A data digitada foi: " + day + "/" + month + "/" + year);
				} else {
					// DIA INVALIDO
					System.out.println("Data Inválida");
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if(day >= 1 && day <= 30) {
					// DIA VALIDO
					System.out.println("Data Válida. A data digitada foi: " + day + "/" + month + "/" + year);
				} else {
					// DIA INVALIDO
					System.out.println("Data Inválida");
				}
				
			} else if (month == 2) {
				if (year % 4 == 0) {
					if (day >= 1 && day <= 29) {
						// DIA VALIDO
						System.out.println("Data Válida. A data digitada foi: " + day + "/" + month + "/" + year);
					} else {
						// DIA INVALIDO
						System.out.println("Data Inválida");
					}
				} else if (day >= 1 && day <= 28) {
					// DIA VALIDO
					System.out.println("Data Válida. A data digitada foi: " + day + "/" + month + "/" + year);
					} else {
						// DIA INVALIDO
						System.out.println("Data Inválida");
					}
			}
		} else {
			// MES INVALIDO
			System.out.println("O mês é inválido!");
		}
	}

}
