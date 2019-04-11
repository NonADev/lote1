package lote_modular;

import java.util.Scanner;

public class Ex_19 {
	static double a, b;
	public static void calc() {
		Scanner s = new Scanner(System.in);
		double a = s.nextInt(), b = s.nextInt();
		if (a > b)
			a = a;
		else
			a = b;		
	}
	public static void main(String[] args) {
		calc();
		System.out.print(a);
	}
}
