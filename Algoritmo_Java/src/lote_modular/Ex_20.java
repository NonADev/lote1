package lote_linear;

import java.util.Scanner;

public class Ex_20 {
	private static int d;
	public static void calc_d(){
		d=(b*b)-(4*a*c);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		calc_d();
		double x1, x2;
		if(d<0) {
			System.out.println("Delta: "+d);
		}
		else {
			x1=-b+Math.sqrt(d);
			x1/=2*a;
			x2=-b-Math.sqrt(d);
			x2/=2*a;
			System.out.println(x1);
			System.out.println(x2);
		}
	}
}
