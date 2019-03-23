package lote_linear;

import java.util.Scanner;

public class Ex_27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double voltas=s.nextDouble(), 
				metros=s.nextDouble(), 
				tempo=s.nextDouble();
		
		System.out.println((voltas*metros*tempo)/1000);
	}
}
