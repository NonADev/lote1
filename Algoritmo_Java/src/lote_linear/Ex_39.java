package lote_linear;

public class Ex_39 {
	public static void main(String[] args) {
		int casa = 1;
		long qdte = 0;
		int conter = 1;
		while (conter <= 64) {
			System.out.print(casa + " " + Math.pow(2, qdte) +"\n");
			casa++;
			qdte++;
			conter++;
		}
	}
}
