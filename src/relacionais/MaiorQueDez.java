package relacionais;

import java.util.Scanner;

public class MaiorQueDez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um Numero para dizermos se � maior ou menor que Dez");
		int dez = 10;

		int valor = sc.nextInt();

		if (valor < dez) {
			System.out.println("O valor � menor que: " + dez);
		} else if (valor == dez) {
			System.out.println("O valor �: " + dez);
		} else {
			System.out.println("O Valor � maior que " + dez);
		}
	}
}
