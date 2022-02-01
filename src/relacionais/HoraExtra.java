package relacionais;

import java.util.Scanner;

public class HoraExtra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantas horas você trabalhou esse mês");
		int horasMes = sc.nextInt();
		System.out.println("Agora digite o valor recebido por hora");
		double salarioHora = sc.nextDouble();
		int padrao = 160;
		int horaextra = horasMes - padrao;
		double salario = 160 * salarioHora;
		if (horaextra <= 0) {
			System.out.println("Seu Salario final é: R$" + salario);
		} else {
			double salarioBonus = (horaextra * salarioHora) + (salarioHora * 100 / 5) + salario;
			System.out.println("Seu Salario final é: R$" + salarioBonus);
		}
	}
}
