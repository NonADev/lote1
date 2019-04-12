package lote_modular;

import java.util.Scanner;

public class Ex_24 {
	public static int a;
	public static void mod2(){		
		if(a%2==0) System.out.println("%2");
	}
	public static void mod3(){		
		if(a%3==0) System.out.println("%3");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		mod2();
		mod3();
	}
}
