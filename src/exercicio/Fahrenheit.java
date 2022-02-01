package exercicio;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro digite o valor em Fahrenheit para transformar em Celsius");
		int fahrenheit = sc.nextInt();
		int sub = 32;
		float div = (float) 1.8;
		float celsius = (fahrenheit - sub) / div;

		System.out.println("A converssão de " + fahrenheit + "°F Equivale a " + celsius + " °C");
	}
}
