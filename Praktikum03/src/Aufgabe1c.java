
public class Aufgabe1c {

	public static void main(String[] args) {

		StdOut.println("Geben Sie die Maximalpunktzahl ein: ");
		double maxP = StdIn.readDouble();
		
		StdOut.println("Geben Sie die erreichte Punktzahl ein: ");
		double p = StdIn.readDouble();
		
		if(maxP<p || p<0){			
			while(maxP<p || p<0){
				StdOut.println("Fehler! Erreichte Punkte kleiner als 0 oder grosser als die Maximalpunktzahl!");
				
				StdOut.println("Geben Sie die erreichte Punktzahl neu ein: ");
				p = StdIn.readDouble();
			}
		}
		else{
			
			while(true){

				double n = (p-50)/50;
				n = n*3;
				n = 4-n;
				
				
				n+=0.5;
				int intn = (int)n;
				
				
				String nString = null;
					switch(intn){
					
					case 1: nString = "Sehr gut!";
							break;
							
					case 2: nString = "Gut!";
							break;
					
					case 3: nString = "Befriedigend!";
							break;
					
					case 4: nString = "Ausreichend!";
							break;
					
					case 5: nString = "Mangelhaft!";
							break;
					
					case 6: nString = "Ungenugend!";
							break;						
					}
				StdOut.println("Note: " + nString); 	
			}
		}				
	}
}