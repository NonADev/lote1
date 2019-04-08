package lote_linear;
import java.util.Scanner;
public class Ex_30B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nasc[] = { s.nextInt(), s.nextInt(), s.nextInt() }, atual[] = { s.nextInt(), s.nextInt(), s.nextInt() };
		int anos = 0, meses = 0, dias = 0;
		if (atual[1] > nasc[1] || (atual[1] == nasc[1] && atual[2] >= nasc[2])) { //CONTA ANOS
			anos = atual[0] - nasc[0];
		} else {
			anos = atual[0] - nasc[0] - 1;
		}
		for(;nasc[0]<=atual[0];nasc[0]++) { //ANO NASC::ATUAL@@@@@@@@@@@@@@
			int messes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			if(nasc[0]%4==0) messes[2]=29;
			//System.out.println("A: "+nasc[0]); WORKING			
			for(;(nasc[0]<atual[0]&&nasc[1]%13!=0)||(nasc[1]<=atual[1]);nasc[1]++) { //MES NASC::ATUAL@@@@@@@@@@@@@@
				//System.out.println("M: "+nasc[1]);  WORKING
				for(;((nasc[0]<atual[0]||nasc[1]<atual[1])&&nasc[2]<=messes[nasc[1]])||(nasc[2]<=atual[2]);nasc[2]++) { //DIA NASC::ATUAL@@@@@@@@@@@@@@
					//System.out.println("D: "+nasc[2]);	 WORKING
					if(nasc[2]==messes[nasc[1]]) meses++; //CONTA MES
					dias++; //CONTA DIAS
				}
				nasc[2]=1;
			}
			nasc[1]=1;
		}		
		System.out.println(String.format("Anos: %d \nMeses: %d \nDias: %d", anos, meses-1, dias-1)); //correção -1 para os iniciadores
	}
}