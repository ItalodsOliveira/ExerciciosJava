package exercicio;
import java.util.Scanner;

public class AjusteSalarial {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Primeiro digite seu Salario Mensal");
		double salario = sc.nextDouble();
		System.out.println("Agora informe o reajuste anual");
		double reajuste = sc.nextDouble();
		double ajuste = (double) salario*reajuste/100;
		double total = salario+ajuste;
		
		System.out.println("Seu salario reajustado é: R$"+total);
	}
}
