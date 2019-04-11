package lote_funcional;

public class Ex_45 {
	public static void main(String[] args) {
		int mult = -1;
		char is = ' ';
		double soma = 0;
		for (int i = 1; i <= 15; i++) {
			soma += mult * (i / Math.pow(i, 2));
			is = isS(mult);
			System.out.print(i + " / " + Math.pow(i, 2)+" "+is+" ");
			mult*=-1;
		}
	}
	public static char isS(int mult) {
		if(mult==1) return '+';
		else return '-';
	}
}
