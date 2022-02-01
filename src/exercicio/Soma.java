package exercicio;
import java.util.Scanner;
public class Soma {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o primeiro numero para que possamos fazer a soma");
		
		int numero1 = sc.nextInt();
		System.out.print("Agora digite o segundo numero");
		int numero2 = sc.nextInt();
		int total = numero1+numero2;
		
		System.out.println("O valor total da some é:"+ total);
	}
}
