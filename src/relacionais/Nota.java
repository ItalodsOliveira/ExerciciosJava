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
			System.out.println("Parab�s sua nota final �: "+notafinal+" Voc� foi aprovado");
		}else {
			System.out.println("Seja l� o que voc� tenha feito esse ano estudar � que n�o foi sua nota final �: "+notafinal+" Voc� foi reprovado");
		}
	}
}
