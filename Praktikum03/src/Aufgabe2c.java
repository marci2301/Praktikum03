
public class Aufgabe2c {

	public static void main(String[] args) {
		
		//Deklaration und Initialisierung der Variablen
		int unterzucker = 0;
		int uberzucker = 0;
		int normal = 0;

		//Eingabe
		StdOut.println("Geben Sie die Anzahl der Personen ein: ");
		int p = StdIn.readInt();
		
		//Deklaration und Initialisierung des Arrays
		int[] a = new int[p];
		
		//for-schleife mit der länge der angegeben personen, eingabe des blutzuckerwertes für jede person, übergabe ins array
		for(int i=0; i<a.length; i++){
			StdOut.println("Geben Sie den " + (i+1) + ". Blutzuckerwert ein.");
			int b = StdIn.readInt();
			a[i]=b;
		}
		
		//for-schleife um jeden wert aus dem array auszulesen und Einordnung in die Gruppen
		for(int i=0; i<a.length; i++){
			
			if(a[i]<80){
				unterzucker++;
				StdOut.println("Person " + (i+1) + " ist unzerzuckert.");
			}
			else if(a[i]>120){
				uberzucker++;
				StdOut.println("Person " + (i+1) + " ist uberzuckert.");
			}
			else{
				normal++;
			}
		}
		
		//Ausgabe der Counter
		StdOut.println("");
		StdOut.println("Anzahl Unterzuckert: " + unterzucker);
		StdOut.println("Anzahl Uberzuckert: " + uberzucker);
		StdOut.println("Anzahl Normal: " + normal);
		StdOut.println("");
		
		//Berchnung der Anteile
		double anteil = (100*(unterzucker+uberzucker)/p);
		
		StdOut.println("Prozentanteil: " + anteil + "%");
	}
}