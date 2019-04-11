package lote_funcional;

public class Ex_34 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);	
		double a = s.nextDouble();
		for(int i=1;i<=10;i++) {
			System.out.println(calc(i, a));
		}
	}
	public static double calc(double i, double a) {
		return i*a;
	}
}
