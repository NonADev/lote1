package lote_linear;

import java.util.Scanner;

public class Ex_18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();
		if (a > b)
			a = a - b;
		else
			a = b - a;
		System.out.print(a);
	}
}
