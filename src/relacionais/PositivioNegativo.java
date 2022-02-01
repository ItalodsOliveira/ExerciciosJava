package relacionais;

import java.util.Scanner;

public class PositivioNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero intiro para dizermos se é positivo ou negativo");
		int zero = 0;
		int numero = sc.nextInt();
		if (numero < zero) {
			System.out.println("O numero " + numero + " é Negativo");
		} else if (numero == zero) {
			System.out.println("O numero " + zero + " tambem é Positivo");
		} else {
			System.out.println("O numnero " + numero + " é Positivo");
		}
	}
}
