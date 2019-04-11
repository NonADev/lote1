package lote_modular;

import java.util.Scanner;

public class Ex_18 {
	static 	int a, b;
	public static void calc() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();
		if (a > b)
			a = a - b;
		else
			a = b - a;		
	}
	public static void main(String[] args) {
		calc();
		System.out.print(a);
	}
}
