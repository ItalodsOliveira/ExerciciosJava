package exercicio;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um valor em Celsius para transformalo em Fahrenheit");
		int celsius = sc.nextInt();
		float fahrenheit = (9*celsius +160)/5;
		
		System.out.println(celsius+"°C Em Fahrenheit é "+fahrenheit+"°F");
		
	}
}
