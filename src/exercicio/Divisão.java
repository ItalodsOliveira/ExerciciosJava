package exercicio;
import java.util.Scanner;

public class Divis�o {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero para fazermos a divis�o");
		int numero1 = sc.nextInt();
		System.out.println("Agora digite o segundo numero");
		int numero2 = sc.nextInt();
		float total = numero1/numero2;
		
		System.out.println("O valor total da divis�o �: "+ total);
	}
 
}
