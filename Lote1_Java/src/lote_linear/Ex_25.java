package lote_linear;

public class Ex_25 {

	public static void main(String[] args) {
		int tInicial;
		int tFinal;
		int tPassado;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		tInicial = scanner.nextInt();
		tFinal = scanner.nextInt();

		tPassado = tFinal - tInicial;
		if(tFinal<=tInicial) tPassado = 24 + tPassado;
		
		
		System.out.println(String.format("O JOGO DUROU %d HORA(S)", tPassado));
		scanner.close();		
	}
}
