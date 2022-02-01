package exercicio;
import java.util.Scanner;

public class ComissaoCarro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro informe seu salario fixo");
		double salario = sc.nextDouble();
		System.out.println("Agora informe valor fixo de comissão por carro vendido");
		double comissao = sc.nextDouble();
		System.out.println("Agora informe quantos carros você vendeu");
		int carros = sc.nextInt();
		System.out.println("Qual o valor total dos carros vendidos");
		double valorcarro = sc.nextDouble();
		double comissaofixa = comissao*carros;
		double porcentagemvenda = valorcarro*5/100;
		double total = salario+comissaofixa+porcentagemvenda;
		
		System.out.println("Seu salario final é: R$"+total);
	}
}
