import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int total = 0;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		total = numero1 + numero2;
		
		System.out.print("Total da soma: " + total);
		

	}

}
