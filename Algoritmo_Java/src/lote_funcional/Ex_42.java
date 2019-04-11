package lote_funcional;
//Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/9
public class Ex_42 {
	public static void main(String[] args) {
		double soma=0;
		for(int i=1, j=1;i<=50;i=Ex_39.add(i), j+=2) {
			soma+=i/j;
			System.out.println(i+" "+j);
		}
		System.out.println(soma);
	}
}
