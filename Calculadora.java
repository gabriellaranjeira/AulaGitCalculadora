import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int total = 0;
		int operacao = 0;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Menu:\n1 - Some\n2 - Subtração");
		System.out.print("Digite a operação: ");
		operacao = entrada.nextInt();
		
		switch(operacao) {
			case 1:
				total = numero1 + numero2;
			break;
			
			case 2:
				total = numero1 - numero2;
			break;
			default:
				System.out.print("Operação invalida");
				System.exit(0);
			break;
		}
		
		
		System.out.print("Total: " + total);
		

	}

}
