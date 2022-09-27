package skoleprøve;
import java.util.Scanner;
public class Oppgave3 {

	public static void main(String[] args) {
					
		int sum = 0;
		int antall = 0;
		int verdi = 0;
		Scanner kb = new Scanner(System.in);
		
		do {
			String tallStreng = kb.nextLine();
			verdi = Integer.parseInt(tallStreng);
			if (verdi !=0) {
				sum += verdi;
				antall++;
			}
			
			
		}while (verdi != 0);
		
		
		kb.close();
		
		System.out.println("Sum: " + sum);
		System.out.println("Antall: " + antall);
	}
	
}
