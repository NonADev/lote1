package lote_linear;

public class Ex_5 {
	public static void main(String args[]) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		double a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		double d = b*b-(4*a*c);
		double x1, x2;
		x1 = -b;
		x1 += Math.sqrt(d);
		x1 /= a*2;
		x2 = -b;
		x2 -= Math.sqrt(d);
		x2 /= a*2;
		System.out.print(x1+"\n"+x2);
	}
}
