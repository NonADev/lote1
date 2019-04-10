package lote_linear;

public class Ex_35 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt(), b=s.nextInt();
		int ma,me;
		if(a>b) {
			ma=a;
			me=b;
		}
		else {
			ma=b;
			me=a;
		}
		double cont=0;
		for(int i=me+1;i<ma;i++) {
			if(!(i%2==0)) cont+=i;
		}
		System.out.println(cont);
	}
}
