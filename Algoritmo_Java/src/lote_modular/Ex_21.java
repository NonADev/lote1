package lote_linear;

import java.util.Scanner;

public class Ex_21 {
	private static double n[] = new double[4];
	public static void leitura(){
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			n[i] = s.nextDouble();
		}
	}
	public static void main(String[] args) {
		leitura();
		double m = 0;
		for (double k : n) {
			m += k;
		}
		m /= 4;
		if (m >= 6)
			System.out.println("APROVADO");
		else if (m >= 3)
			System.out.println("EXAME");
		else
			System.out.println("RETIDO");
	}
}
