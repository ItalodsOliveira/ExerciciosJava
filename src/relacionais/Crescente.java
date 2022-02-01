package relacionais;
import java.util.Scanner;
public class Crescente {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite dois numeros para colocarmos em forma Crescente"
				+ " comece pelo primeiro");
		int numero1 = sc.nextInt();
		System.out.println("Agora digite o Segundo");
		int numero2 = sc.nextInt();
		
		if (numero1>numero2) {
			System.out.println("A forme Crescente é:" +numero2+ " Seguido por "+numero1);
		}else {
			System.out.println("A forme Crescente é:" +numero1+ " Seguido por "+numero2);
		}
		
	}
}
