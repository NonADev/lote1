package lote_modular;

import java.util.Scanner;

public class Ex_27 {
	public static Scanner s;
	public static void inst(){
		s = new Scanner(System.in);
	}
	public static void main(String[] args) {	
		inst();
		double voltas=s.nextDouble(), 
				metros=s.nextDouble(), 
				tempo=s.nextDouble();
		
		System.out.println((voltas*metros*tempo)/1000);
	}
}
