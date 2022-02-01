package exercicio;
import java.util.Scanner;

public class Pentagono {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Primeiro digite a alutra medida do centro até a base do pentagono");
		int altura = sc.nextInt();
		System.out.println("Agora digite o tamanho da base do pentagono");
		int base = sc.nextInt();
		
		int area = 5*((base*altura)/2);
		System.out.println("A area do trapezio é: "+ area);
	}
}
