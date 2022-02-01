package relacionais;
import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digitr o valor de sua Primeira nota");
		float notaum = sc.nextFloat();
		System.out.println("Agora digite sua Segunda nota");
		float notadois = sc.nextFloat();
		
		float notafinal = (notaum+notadois)/2;
		if(notafinal>=6) {
			System.out.println("Parabés sua nota final é: "+notafinal+" Você foi aprovado");
		}else {
			System.out.println("Seja lá o que você tenha feito esse ano estudar é que não foi sua nota final é: "+notafinal+" Você foi reprovado");
		}
	}
}
