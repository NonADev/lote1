package lote_linear;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d[] = new double[4];
		for (int i = 0; i < 4; i++) {
			d[i] = s.nextDouble();
		}

		// reagente
		String apresentacao = "";
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
		System.out.println(apresentacao);
	}
}
