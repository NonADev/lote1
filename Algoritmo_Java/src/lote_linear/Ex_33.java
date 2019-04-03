package lote_linear;

public class Ex_33 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);		
		double cont = 0;
		double n=s.nextDouble();
		for(double i=1;i<=n;i++) {
			cont=cont+(1/i);
		}
		System.out.println(cont);
	}
}
