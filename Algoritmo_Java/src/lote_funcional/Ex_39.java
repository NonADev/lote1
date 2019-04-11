package lote_funcional;

public class Ex_39 {
	public static void main(String[] args) {
		int casa = 1;
		long qdte = 0;
		int conter = 1;
		while (conter <= 64) {
			System.out.print(casa + " " + Math.pow(2, qdte) +"\n");
			casa=add(casa);
			qdte=add(qdte);
			conter=add(conter);
		}
	}
	public static int add(int a) {
		return a+1;
	}
	public static long add(long a) {
		return a+1;
	}
}
