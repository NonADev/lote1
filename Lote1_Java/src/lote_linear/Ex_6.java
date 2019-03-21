package lote_linear;

public class Ex_6 {
	public static void main(String args[]) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		double x = s.nextDouble(), y = s.nextDouble();
		y=x-y;
		x=x-y;
		y=x+y;
		
		System.out.print(x+"\n"+y);
	}
}
