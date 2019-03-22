package lote_linear;

import java.util.Scanner;

public class Ex_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double litros, tempo = s.nextDouble(), velocidade = s.nextDouble();
		litros = (velocidade * tempo) / 12;
		System.out.print(litros);
	}
}
