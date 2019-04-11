package lote_funcional;

public class Ex_31 {
	public static void main(String[] args) {
		for (int i = 11; i < 150; i++) {
			System.out.println(i+": "+calc_quad(i));
		}
	}
	public static double calc_quad(int i) {
		return Math.pow(i, 2);
	}
}
