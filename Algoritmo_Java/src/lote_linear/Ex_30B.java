package lote_linear;
public class Ex_30B {
	public static void main(String[] args) { //ENTRADA DEVE SER EM FORMATO ANO MES DIA
		java.util.Scanner s = new java.util.Scanner(System.in);
		int nasc[] = { s.nextInt(), s.nextInt(), s.nextInt() }, atual[] = { s.nextInt(), s.nextInt(), s.nextInt() }, dNasc[]= {nasc[0], nasc[1], nasc[2]}, anos = 0, meses = 0, dias = 0;
		for(s.close();nasc[0]<=atual[0];nasc[0]++) { //ANO NASC::ATUAL@@@@@@@@@@@@@@
			int messes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			if(nasc[0]%4==0) messes[2]=29;		
			for(;(nasc[0]<atual[0]&&nasc[1]%13!=0)||(nasc[1]<=atual[1]);nasc[1]++) { //MES NASC::ATUAL@@@@@@@@@@@@@@
				for(;((nasc[0]<atual[0]||nasc[1]<atual[1])&&nasc[2]<=messes[nasc[1]])||(nasc[2]<=atual[2]);nasc[2]++) { //DIA NASC::ATUAL@@@@@@@@@@@@@@
					if(nasc[0]>dNasc[0]&&(nasc[1]==dNasc[1]&&dNasc[2]==nasc[2])) anos++;
					if(nasc[2]==messes[nasc[1]]) meses++; 			//CONTA MES
					dias++; 										//CONTA DIAS
				}
				nasc[2]=1;
			}
			nasc[1]=1;
		}		
		System.out.println(String.format("Anos: %d \nMeses: %d \nDias: %d", anos, meses, dias-1)); //correção -1 para os iniciadores
	}
}