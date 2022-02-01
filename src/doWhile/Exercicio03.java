package doWhile;

public class Exercicio03 {

	public static void main(String[] args) {
		int x=0;
		int acumulo=0;
		
		while (x<=500) {
			if(x%2==0) {
				acumulo = acumulo+x;
			}
			x++;
		}
		System.out.println(acumulo);
	}

}
