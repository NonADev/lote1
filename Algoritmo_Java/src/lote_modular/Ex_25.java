package lote_linear;

public class Ex_25 {
	public static int tPassado;
	public static void presen(){
		System.out.println(String.format("O JOGO DUROU %d HORA(S)", tPassado));
	}
	public static void main(String[] args) {
		int tInicial;
		int tFinal;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		tInicial = scanner.nextInt();
		tFinal = scanner.nextInt();

		tPassado = tFinal - tInicial;
		if(tFinal<=tInicial) tPassado = 24 + tPassado;
		
		presen();
		scanner.close();		
	}
}
