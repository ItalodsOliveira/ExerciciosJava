package exercicio;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Primeiro informe a base do Triangulo para clacularmos a area");
		int base = sc.nextInt();
		System.out.println("Agora informe a altura");
		int altura = sc.nextInt();
		
		int area= (base*altura)/2;
		
		System.out.println("A area do triangulo é: "+ area);
	}
}
