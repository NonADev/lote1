package lote_linear;

import java.util.Scanner;

public class Ex_19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextInt(), b = s.nextInt();
		if (a > b)
			a = a;
		else
			a = b;
		System.out.print(a);
	}
}
