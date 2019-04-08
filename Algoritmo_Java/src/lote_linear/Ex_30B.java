package lote_linear;

import java.util.Scanner;

public class Ex_30B {

	public static void main(String[] args) {
		int messes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner s = new Scanner(System.in);
		int nasc[] = { s.nextInt(), s.nextInt(), s.nextInt() }, atual[] = { s.nextInt(), s.nextInt(), s.nextInt() };
		int anos = 0, meses = 0, dias = 0;
		for(;nasc[0]<=atual[0];nasc[0]++) {
			System.out.println("A: "+nasc[0]);
			for(;(nasc[0]<atual[0]&&nasc[1]%13!=0);nasc[1]++) {
				System.out.println("M: "+nasc[1]);
			}
			nasc[1]=1;
		}

		System.out.println(String.format("Anos: %d \nMeses: %d \nDias: %d", anos, meses, dias));
	}

}
