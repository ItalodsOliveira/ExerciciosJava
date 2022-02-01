package exercicio;

import java.util.Scanner;

public class Oleo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Digite a Altura da Lata");
	int altura = sc.nextInt();
	System.out.println("Digite o valor do Diametro");
	int diametro = sc.nextInt();
	float raio=diametro/2;
	float volume = (float)(3.14*(raio*raio)*altura);
	System.out.println("O Volume da lata é:"+volume);
}
}
