package automarken;

public class Main {
	public static void main(String[] args) {
		Marke vw = new Marke("VW", 12);
		Marke toyota = new Marke("Toyota", 14);		
		Marke bmw = new Marke("BMW", 10); 
		
		tochterMarke audi = new tochterMarke("Audi", 8);
		tochterMarke bentley = new tochterMarke("Bentley", 4);
		tochterMarke lexus = new tochterMarke("Lexus", 4);
		tochterMarke seat = new tochterMarke("Seat", 4);
		tochterMarke daihatsu = new tochterMarke("Daihatsu", 4);
		tochterMarke mercedes = new tochterMarke("Mercedes",9);
		
		toyota.add(lexus);
		toyota.add(daihatsu);
		bmw.add(new MarkenVeredler("//M",8));
		mercedes.add(new MarkenVeredler("AMG",9));
		seat.add(new MarkenVeredler("Cupra",6));
		vw.add(audi);
		vw.add(mercedes);
		vw.add(seat);
		vw.add(bentley);
		
		vw.print("");
		toyota.print("");
		bmw.print("");
	}
}
