package doWhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, r;
		String resposta;
		String RESP = "sim";
		do {
			System.out.println("Digite um valor");
			x = sc.nextInt();
			r = x*3;
			System.out.println(r);
			System.out.println("deseja continuar?");
			resposta = sc.next();
		} while (resposta.equals(RESP));

	}

}
