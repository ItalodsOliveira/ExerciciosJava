package exercicio;
import java.util.Scanner;

public class Carros {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeio informe o valor de fabrica do carro");
		double valorf= sc.nextDouble();
		
		double distribuidor =  valorf*28/100;
		double inposto =  valorf*45/100;
		
		double total = valorf+distribuidor+inposto;
		
		System.out.println("O valor total do Carro é: R$"+total);
	}
}
