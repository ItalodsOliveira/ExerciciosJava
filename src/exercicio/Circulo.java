package exercicio;
import java.util.Scanner;

public class Circulo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro digite o Diametro do Circulo para calcularmos a Area");
		
		int diametro = sc.nextInt();
		float raio = diametro/2;
		float raioquadrado = raio*raio;
		float pi= (float)3.14;
		float area = raioquadrado*pi;
		System.out.println("A Area do circulo é: "+area);
		
	}
}
