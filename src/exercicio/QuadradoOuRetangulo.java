package exercicio;

import java.util.Scanner;

public class QuadradoOuRetangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a base para calcularmos a area");
		int base = sc.nextInt();
		System.out.println("Agora informe a Altura para dizermos se � quadrado ou retengulo");
		int altura = sc.nextInt();

		int area = base * altura;

		if (base == altura) {
			System.out.println("A forma � um quadrado e sua area �: " + area);
		} else {
			System.out.println("A forma � um retangulo e sua area �: " + area);
		}

	}
}
