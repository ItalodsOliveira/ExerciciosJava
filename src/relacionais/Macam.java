package relacionais;
import java.util.Scanner;

public class Macam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas maçãs você deseja comprar?");
		int macam = sc.nextInt();
		double preco1 = (double) 1.30;
		if(macam<12) {
			double total1 = macam*preco1;
			System.out.println("O preço final é: R$"+total1);
		}else {
			System.out.println("O preço final é: R$"+macam);
		}
	}
}
