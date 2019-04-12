package lote_modular;

import java.util.Scanner;

public class Ex_29 {
	//look this :)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte a = s.nextByte();
		double valor = s.nextDouble();
		if(a==1)Ex_28.print("Poupança: "+valor*1.03);
		else if(a==2)Ex_28.print("Renda Fixa: "+valor*1.05);
	}
}
