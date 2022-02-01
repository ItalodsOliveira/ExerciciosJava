package doWhile;

public class Exercicio05 {

	public static void main(String[] args) {
		int x =0;
		int quadrado = 2;
		float total = 0;
		
		while (x<64) {
		total = x*quadrado+(total*2);
		System.out.println(x+"  "+total);
		x++;
		}
	}

}
