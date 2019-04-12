package lote_modular;

import java.util.Scanner;

public class Ex_23 {
	private static String apresentacao = "";
	public static void print(){
		System.out.println(apresentacao);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d[] = new double[4];
		for (int i = 0; i < 4; i++) {
			d[i] = s.nextDouble();
		}

		// reagente
		if (d[3] < d[0]) {
			apresentacao += d[3] + " ";
			apresentacao += d[0] + " ";
			apresentacao += d[1] + " ";
			apresentacao += d[2] + " ";
		} else if (d[3] < d[1]) {
			apresentacao += d[0] + " ";
			apresentacao += d[3] + " ";
			apresentacao += d[1] + " ";
			apresentacao += d[2] + " ";
		} else if (d[3] < d[2]) {
			apresentacao += d[0] + " ";
			apresentacao += d[1] + " ";
			apresentacao += d[3] + " ";
			apresentacao += d[2] + " ";
		} else {
			apresentacao += d[0] + " ";
			apresentacao += d[1] + " ";
			apresentacao += d[2] + " ";
			apresentacao += d[3] + " ";
		}

		// presentation
		print();
	}
}
