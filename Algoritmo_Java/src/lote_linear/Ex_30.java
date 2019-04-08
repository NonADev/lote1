package lote_linear;

import java.util.Scanner;

public class Ex_30 {
	/*
	 * Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
	 * idade em anos, meses e dias, considerando os anos bissextos.
	 */
	private static int messes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nasc[] = { s.nextInt(), s.nextInt(), s.nextInt() }, atual[] = { s.nextInt(), s.nextInt(), s.nextInt() };
		int anos = 0, meses = 0, dias = 0;
		if (atual[1] > nasc[1] || (atual[1] == nasc[1] && atual[2] >= nasc[2])) {
			anos = atual[0] - nasc[0];
		} else {
			anos = atual[0] - nasc[0] - 1;
		}
		// Ano Done ============================================================
		if (atual[1] > nasc[1] || (atual[1] == nasc[1] && atual[2] >= nasc[2])) {
			meses = (anos * 12) + (atual[1] - nasc[1]);
		} else {
			// meses = (anos * 12) + (-1 * (atual[1] - nasc[1]));
			meses = (anos * 12);
			for (int i = atual[1] + 1; i != nasc[1]; i++) {
				if (i % 13 == 0) {
					i = 1;
				}
				meses++;
			}
			meses--;
		}
		// mes Done ============================================================
		dias += anos * 365; // soma os anos inteiros
		for (int i = nasc[0]; i <= atual[0]; i++) {
			if (i % 4 == 0) {
				//dias++;
			}
			// bixesto done
		}
		if (atual[1] > nasc[1]) {
			for (int k = nasc[1]; k < atual[1]; k++) {
				if (k % 13 == 0) {
					k = 1;
				}
				dias += messes[k];
			}
		} else if (nasc[1] > atual[1]) {
			for (int k = atual[1] + 1; k < nasc[1] - 1; k++) {
				dias += messes[k];
				System.out.println("b "+messes[k]+" c "+k);
			}
		}
		dias += atual[2] - nasc[2];
		System.out.println(String.format("Anos: %d \nMeses: %d \nDias: %d", anos, meses, dias));
	}
}
