import java.util.Scanner; // BIBLIOTECA

public class ex4Q1 {

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero positivo para ser somado ou negativo para sair: \n");
			num = ler.nextInt();
			
			if (num > 0) {
				soma += num;
			}
			
		} while (num > 0);
		
		System.out.println("A soma é: " + soma);
	}

}
