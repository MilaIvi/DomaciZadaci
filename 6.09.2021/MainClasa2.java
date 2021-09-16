package zooloskiVrt;

public class MainClasa2 {

	public static void main(String[] args) {
		
		
		Ribe r1 = new Ribe("Pasramka","Crvici", "Slatkovodna",1, "Sarena", "Slatka voda");
		
		System.out.println("Ispisati jednu vrstu ribe:"+ r1.getNaziv());
		
		
		
		Sisari s1 = new Sisari("Medved","Kruska","Smedja");
		
		System.out.println("Ispisati jednu vrstu sisara:"+s1.getVrsta());
		
		
		
		Staniste staniste = new Staniste( "Lisopadna suma");
		
		System.out.println("Ispisati jedno staniste:"+staniste.getNazivStanista());
		
	}

}
