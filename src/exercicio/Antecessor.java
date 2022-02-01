package exercicio;
import java.util.Scanner;

public class Antecessor {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para que possamos diz o Antecessor dele");
		int numero = sc.nextInt();
		int antecessor = numero-1;
		System.out.println("O Antecessor de "+numero +" é: "+ antecessor);
	}
}
