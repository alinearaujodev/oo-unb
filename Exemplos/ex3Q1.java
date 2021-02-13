import java.util.Scanner; // BIBLIOTECA

public class ex3Q1 {

	public static void main(String[] args) {
		char operacao;
		int num1, num2;
		int resultado;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a operação a ser realizada (+, - ou *): \n");
		operacao = ler.next().charAt(0);
		System.out.print("Entre com o primeiro número: \n");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo número: \n");
		num2 = ler.nextInt();
		
		switch (operacao) {
			case '+':
				System.out.println("O resultado da operação é: " + (num1 + num2));
				break;
			case '-':
				System.out.println("O resultado da operação é: " + (num1 - num2));
				break;
			case '*':
				System.out.println("O resultado da operação é: " + (num1 * num2));
				break;
			default:
				System.out.println("Operação inválida");
		}
	}

}
