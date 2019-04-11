package lote_funcional;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();
		ArrayList<Integer> lista = new ArrayList<>();
		for(int i=a+1;i<b-1;i++){
			int conter = 0;
			for(int ii=i;ii>=1;ii--){
				if(i%ii==0) conter=Ex_39.add(conter);
			}
			//System.out.println(conter);
			if(conter==2) lista.add(i);
		}
		
		
		
		
		
		//PRESENTATION
		for(Integer aa:lista){
			System.out.println(aa);
		}
	}
}
