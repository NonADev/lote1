package lote_funcional;

public class Ex_36 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		double n = s.nextDouble();
		// teste fatorial
		double soma = 0;
		for (int i = 1; i <= n; i++) {
			double fatorial = 1;
			for (double conterFatorial = i; conterFatorial >= 2; conterFatorial--) {
				fatorial *= a(conterFatorial);
			}
			soma+=1/fatorial;
			//System.out.println(fatorial); testar fatoriais #saida
		}
		System.out.println(soma);
	}
	public static double a(double i) {
		return i;
	}
}
