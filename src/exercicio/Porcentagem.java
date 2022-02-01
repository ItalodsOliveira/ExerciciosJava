package exercicio;
import java.util.Scanner;

public class Porcentagem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeio digite o numero total de eleitores");
		int eleitores = sc.nextInt();
		System.out.println("Agora digite a quantidade de votos brancos");
		int brancos = sc.nextInt();
		System.out.println("Agora digite a quantidade de votos nulos");
		int nulos = sc.nextInt();
		double porcentagemb = (double) (brancos*100)/eleitores;
		double porcentagemn = (double) (nulos*100)/eleitores;
		double validos = (double) eleitores-brancos-nulos;
		double porcentagemv = (double) (validos*100)/eleitores;
		
		System.out.println("A porcentagem de eleitores em branco é: "+ porcentagemb+"%  "+" A porcentagem de eleitores nulos é:"+ porcentagemn+"% "+
		" A porcentagem de eleitores validos é: "+ porcentagemv+"%");
	}
}
