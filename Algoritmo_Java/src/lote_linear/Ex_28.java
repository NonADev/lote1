package lote_linear;

import java.util.Scanner;

public class Ex_28 {
	public static void print(String a) {
		System.out.print(a);
	}
	public static void print(Double a) {
		System.out.print("" + a);		
	}
	public static void print(int a) {
		System.out.print("" + a);		
	}
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		double precoAtual=s.nextDouble(), mediaVenda=s.nextDouble();
		if(mediaVenda>=1000&&precoAtual>=80) print(precoAtual*0.95);
		else if((mediaVenda>=500&&mediaVenda<1000)&&(precoAtual>=30&&precoAtual<80)) print(precoAtual*1.15);
		else if(mediaVenda<500&&precoAtual<30) print(precoAtual*1.1);
	}
}
