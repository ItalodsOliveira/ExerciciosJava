package relacionais;

import java.util.Scanner;

public class ImcMasculinoFeminino {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Informe seu nome");
		String nome = sc.nextLine();
		System.out.println("Agora digite sua Altura");
		double altura = sc.nextDouble();
		System.out.println("Por fim digite seu Sexo considerendo M para Masculino e F para Feminino");
		String sexo = sc.nextLine();
		
		if(sexo .equals("m")){
			double imc = (double) ((72.7 * altura) - 58);
			System.out.println("Olá "+nome +" Seu peso ideal é "+imc);
		}else if(sexo .equals("f")) {
			double imc = (double) ((62.1 * altura) - 44.7);
			System.out.println("Olá "+nome +" Seu peso ideal é "+imc);
		}
		
	}
}
