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
			System.out.println("Voc� tem " + anos + " Anos portanto n�o pode votar essa ano");
		} else if (anos >= 112) {
			System.out.println("Como voc� consegiu viver tanto tempo voc� est� com " + anos
					+ " Anos se tiver for�as pra sir de casa pode votar");
		} else {
			System.out.println("Voc� tem " + anos + " Anos portanto deve votar esse ano");
		}
	}
}
