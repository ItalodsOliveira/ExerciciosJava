package exercicio;
import java.util.Scanner;

public class DiasDeVida {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro Diga quantos Anos, Messes e Dias você tem, começando com os anos");
		int anos = sc.nextInt();
		System.out.println("Agora Quantos messes");
		int mes = sc.nextInt();
		System.out.println("Agora para finalizar os dias");
		int dia = sc.nextInt();
		
		int dias = (anos*365)+(mes*30)+dia;
		
		System.out.println("Você está vivo a : "+dias+" dias");
		
	}
}
