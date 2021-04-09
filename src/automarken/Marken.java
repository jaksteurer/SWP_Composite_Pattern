package automarken;

import java.util.ArrayList;
import java.util.List;

//Component
abstract class Marken {
	public abstract int getAnzahlMarken();
	public abstract void print(String abstand);

	String name;
	int anzModelle;
	//Konstruktor
	public Marken(String name, int anzModelle) {
		this.name = name;
		this.anzModelle = anzModelle;
	}
	//Getter und Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnzModelle() {
		return anzModelle;
	}
	public void setAnzModelle(int anzModelle) {
		this.anzModelle = anzModelle;
	}
}
//Composite-1
class Marke extends Marken{
	public void print(String abstand) {
		System.out.println(abstand+getName()+" [Modelle: "+getAnzModelle()+"]");
		for(Marke m : marke) {
			m.print(abstand+"\t");
		}
	}
	private List<Marke> marke = new ArrayList<Marke>();

	public Marke(String name, int anzModelle) {
		super(name, anzModelle);
	}
	public int getAnzahlMarken() {
		int summe = 1;
		for(Marke m : marke) {
			summe += m.getAnzahlMarken();
		}
		return summe;
	}
	public void add(Marke m) {
		marke.add(m);
	}
	public void remove(Marke m) {
		marke.remove(m);
	}
	public Marke getMitarbeiter(int index) {
		return marke.get(index);
	}
}
//Composite-2
class tochterMarke extends Marke{
	public void print(String abstand) {
		System.out.println(abstand+"- "+getName()+" [Modelle: "+getAnzModelle()+"]");
		for(Marke m : marke) {
			m.print(abstand+"\t");
		}
	}
	private List<Marke> marke = new ArrayList<Marke>();

	public tochterMarke(String name, int anzModelle) {
		super(name, anzModelle);
	}
	public int getAnzahlMarken() {
		int summe = 1;
		for(Marke m : marke) {
			summe += m.getAnzahlMarken();
		}
		return summe;
	}
	public void add(Marke m) {
		marke.add(m);
	}
	public void remove(Marke m) {
		marke.remove(m);
	}
	public Marke getMitarbeiter(int index) {
		return marke.get(index);
	}
}
//Leaf
class MarkenVeredler extends Marke{
	@Override
	public void print(String abstand) {
		System.out.println(abstand+"- "+getName()+" [Modelle: "+getAnzModelle()+"]");
	}
	//Konstruktor
	public MarkenVeredler(String name, int anzModelle) {
		super(name, anzModelle);
	}
	public int getAnzahlMarken() {
		return 1;
	}






}



