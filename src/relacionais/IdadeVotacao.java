package relacionais;

import java.util.Scanner;

public class IdadeVotacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento com Quatro digitos");

		int anoDeNascimento = sc.nextInt();
		System.out.println("Digite o ano em que estamos com Quatro digitos");
		int anoAtual = sc.nextInt();
		int anos = anoAtual - anoDeNascimento;

		if (anos < 18) {
			System.out.println("Você tem " + anos + " Anos portanto não pode votar essa ano");
		} else if (anos >= 112) {
			System.out.println("Como você consegiu viver tanto tempo você está com " + anos
					+ " Anos se tiver forças pra sir de casa pode votar");
		} else {
			System.out.println("Você tem " + anos + " Anos portanto deve votar esse ano");
		}
	}
}
