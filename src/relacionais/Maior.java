package relacionais;
import java.util.Scanner;

public class Maior {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Primeio digite um Numero para dizermos se ele é maior ou menor ");
		int numero1 = sc.nextInt();
		System.out.println("Agora digite o segundo numero");
		int numero2 = sc.nextInt();
		if(numero1>numero2) {
			System.out.println("O numero "+numero1+" é o maior");
		}else {
			System.out.println("O numero "+numero2+" é o maior");
		}
	}
}
