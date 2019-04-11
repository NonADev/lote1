package lote_funcional;

import java.util.Random;
import java.util.Scanner;

public class Ex_38 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]= new int[100];
		int ma=-1;
		int me=-1;
		for(int i =0;i<100;i++){
			/*java.util.Random r = new Random();
			int k=r.nextInt(1000);
			while(k<1){
				k=r.nextInt(1000);
			}
			a[i]=k; //RAMDOMIZER=========*/
			a[i]=s.nextInt(); //ENTRADA LITERAL
			me=a[i];
		}
		for(int i=0;i<100;i++){
			if(ma<a[i]) ma=mm(a[i]);
			if(me>a[i]) me=mm(a[i]);
		}
		System.out.println(ma+" "+me);
	}
	public static int mm(int k) {
		return k; // :/ <- look this 
	}
}
