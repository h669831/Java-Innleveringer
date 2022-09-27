package skoleprøve;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave5 {

	public static void main (String[] args) {
		
		String radius = showInputDialog("Ønsket radius:");
		
		double radius1= Double.parseDouble(radius);
		double arealAvSirkel = Math.PI * radius1*radius1;
		
		System.out.print(arealAvSirkel);
	}
}
