
public class Aufgabe1a {

	public static void main(String[] args) {

		StdOut.println("Geben Sie die Maximalpunktzahl ein: ");
		double maxP = StdIn.readDouble();
		
		StdOut.println("Geben Sie die erreichte Punktzahl ein: ");
		double p = StdIn.readDouble();			
		
		while(maxP<p || p<0){
			StdOut.println("Fehler! Erreichte Punkte kleiner als 0 oder grosser als die Maximalpunktzahl!");
			StdOut.println("Geben Sie die Maximalpunktzahl ein: ");
			maxP = StdIn.readDouble();
			
			StdOut.println("Geben Sie die erreichte Punktzahl ein: ");
			p = StdIn.readDouble();
		}
		
		double n = (p-50)/50;
		n = n*3;
		n = 4-n;		
		
		if(n>4){
			StdOut.println("Durchgefallen!");
		}
		else{
			StdOut.println("Note: " + n);
		}
	}
}