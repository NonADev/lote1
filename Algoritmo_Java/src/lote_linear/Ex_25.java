package lote_linear;

public class Ex_25 {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int start[] = { s.nextInt(), s.nextInt() }, end[] = { s.nextInt(), s.nextInt() };
		int hours = 0, mins = 0;
		do {
			start[1]++;
			if (start[1] == 60) {
				start[1] = 0;
				start[0]++;
			}
			if (start[0] == 24)
				start[0] = 0;
			hours++;
		} while (!(start[0] == end[0] && start[1] == end[1]));
		mins = hours % 60;
		hours = hours / 60;
		System.out.println("Hours: " + hours + " Mins: " + mins);
	}
}
