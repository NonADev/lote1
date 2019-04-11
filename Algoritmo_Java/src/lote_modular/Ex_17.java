package lote_modular;

import java.util.Scanner;

public class Ex_17 {
	static Double litros, tempo, velocidade;
	public static void calc() {
		Scanner s = new Scanner(System.in);
		Double litros, tempo = s.nextDouble(), velocidade = s.nextDouble();
		litros = (velocidade * tempo) / 12;
	}
	public static void main(String[] args) {
		calc();
		System.out.print(litros);
	}
}
