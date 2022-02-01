package exercicio;
import java.util.Scanner;
 
public class Trapezio {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Primeiro informe a base do Trapezio");
		int base = sc.nextInt();
		System.out.println("Agora informe o Topo");
		int topo =sc.nextInt();
		System.out.println("Por fim informe a Altura");
		int altura = sc.nextInt();
		int area= ((base*altura)+(topo*altura))/2;
		System.out.println("A area do trapezio é: "+ area);
	}
}