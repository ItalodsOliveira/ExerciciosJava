package relacionais;

import java.util.Scanner;

public class MaiorQueDez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um Numero para dizermos se é maior ou menor que Dez");
		int dez = 10;

		int valor = sc.nextInt();

		if (valor < dez) {
			System.out.println("O valor é menor que: " + dez);
		} else if (valor == dez) {
			System.out.println("O valor é: " + dez);
		} else {
			System.out.println("O Valor é maior que " + dez);
		}
	}
}
