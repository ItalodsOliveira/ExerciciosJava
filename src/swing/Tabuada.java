package swing;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o valor");
		int valor = sc.nextInt();
		int x=0;
		while (x<10) {
			int valor1 = valor * x+valor;
			x=x+1;
			System.out.println(x+" * "+valor+"= "+valor1);
		}
	}
}
