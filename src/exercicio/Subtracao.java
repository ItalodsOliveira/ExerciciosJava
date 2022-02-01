package exercicio;
import java.util.Scanner;

public class Subtracao {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero para que possamos fazer a Subtração");
		int numero1 = sc.nextInt();
		System.out.println("Agora digite o segundo Numero");
		int numero2 = sc.nextInt();
		
		int total = numero1-numero2;
		
		System.out.println("O valo total da subtração é: " + total);
	}
}
