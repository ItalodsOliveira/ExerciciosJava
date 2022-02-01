package relacionais;

import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora do começo do Jogo desconsiderando os minutos");

		int comeco = sc.nextInt();
		System.out.println("Agora digite a hora do final do jogo ");
		int final1 = sc.nextInt();
		int total = final1 - comeco;
		if (total <= 0) {
			int total1 = total + 24;
			System.out.println("o jogo durou " + total1 + " horas");
		} else {
			System.out.println("o jogo durou " + total + " horas");
		}
	}
}
