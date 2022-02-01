package exercicio;
import java.util.Scanner;

public class Sucessor {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para que possamos diz o Antecessor dele");
		int numero = sc.nextInt();
		int sucessor = numero+1;
		System.out.println("O Sucessor de "+numero +" é: "+ sucessor);
	}
}
