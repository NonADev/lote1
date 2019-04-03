package lote_linear;

import java.util.Scanner;

public class Ex_16 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Double horas = s.nextDouble(), valor = s.nextDouble(), perc = s.nextDouble(), desc = s.nextDouble();
		System.out.print(((horas*valor)-desc+desc*100));
}
}
