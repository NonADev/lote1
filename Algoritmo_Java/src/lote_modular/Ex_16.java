package lote_modular;

import java.util.Scanner;

public class Ex_16 {
	private static Double horas, valor, perc, desc, sal;
	public static void calc_sal() {
		sal = ((horas * valor) - desc + desc * 100);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		horas = s.nextDouble();
		valor = s.nextDouble();
		perc = s.nextDouble();
		desc = s.nextDouble();
		calc_sal();
		System.out.print(sal);
	}
}
