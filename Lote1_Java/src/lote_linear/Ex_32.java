package lote_linear;

public class Ex_32 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		double r=1;
		for(int i=s.nextInt();i>=1;i--) {
			r*=i;
		}
		System.out.println(r);
	}
}
