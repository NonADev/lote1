package lote_linear;

public class Ex_43 {
	public static void main(String[] args) {
		double ana=1.1, maria=1.5;
		int anos=0;
		for(;ana<=maria;anos++){
			ana+=0.03;
			maria+=0.02;
		}
		System.out.println(anos);
	}
}
