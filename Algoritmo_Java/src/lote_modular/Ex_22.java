package lote_modular;

import java.util.Scanner;

public class Ex_22 {
	private static int a[] = new int[2];
	public static void inP(){		
		Scanner s = new Scanner(System.in);
		a[0]=s.nextInt();
		a[1]=s.nextInt();
	}
	public static void main(String[] args) {
		inP();
		if(a[0]>a[1]) {
			System.out.println(a[0]);
			System.out.println(a[1]);
		}
		else {
			System.out.println(a[1]);
			System.out.println(a[0]);			
		}
	}
}
