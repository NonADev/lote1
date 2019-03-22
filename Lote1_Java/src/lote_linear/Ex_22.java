package lote_linear;

import java.util.Scanner;

public class Ex_22 {
	public static void main(String[] args) {
		int a[] = new int[2];
		Scanner s = new Scanner(System.in);
		a[0]=s.nextInt();
		a[1]=s.nextInt();
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
