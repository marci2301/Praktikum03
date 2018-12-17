
public class Aufgabe2b {

	public static void main(String[] args) {
		
		int unterzucker = 0;
		int uberzucker = 0;
		int normal = 0;

		StdOut.println("Geben Sie die Anzahl der Personen ein: ");
		int p = StdIn.readInt();
		
		int[] a = new int[p];
		
		for(int i=0; i<a.length; i++){
			StdOut.println("Geben Sie den " + (i+1) + ". Blutzuckerwert ein.");
			int b = StdIn.readInt();
			a[i]=b;
		}
		
		for(int i=0; i<a.length; i++){
			
			if(a[i]<80){
				unterzucker++;
			}
			else if(a[i]>120){
				uberzucker++;
			}
			else{
				normal++;
			}
		}
		
		StdOut.println("Anzahl Unterzuckert: " + unterzucker);
		StdOut.println("Anzahl Uberzuckert: " + uberzucker);
		StdOut.println("Anzahl Normal: " + normal);
		
		double anteil = (100*(unterzucker+uberzucker)/p);
		
		StdOut.println("Prozentanteil: " + anteil + "%");
	}
}