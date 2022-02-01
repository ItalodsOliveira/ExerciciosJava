package exercicio;
import java.util.Scanner;

public class NotasAluno {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Primeiro digite a sua primeira nota");
		int nota1 = sc.nextInt();
		System.out.println("Agora digite sua Segunda nota");
		int nota2 = sc.nextInt();
		System.out.println("Por fim digite sua terceira nota");
		int nota3 = sc.nextInt();
		
		float notaf = (float) ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.println("Sua nota final é: "+notaf);
		
	}
}
