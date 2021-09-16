package myGlumcipackage;

public class OcenaFilma {

	public static void main(String[] args) {
		
		
	Glumci glumci= new Glumci();
		
	glumci.ime="Bata";
	glumci.prezime="Zivojinovic";
	glumci.godinaRodjenja=1932;
	glumci.pol="muski";
		
	glumci.setBracnoStanje(true);	
		
	glumci.setprosecnaZaradaPoFilmu(2000.50);	
	
	glumci.setBrojSnimljenihFilmova(150);
	
	
System.out.println (glumci.MrMrs()+ "\n" + "Ime:" +glumci.ime+ "\n" +"Prezime:"+glumci.prezime + "\n" + "Pol:" +glumci.pol+ "\n"+

		"Bracno stanje:" + glumci.getBracnoStanje() + "\n" + "Prosecna zarada po filmu:" + glumci.getprosecnaZaradaPoFilmu() +
	
         "\n" + "Broj snimljenih filmova:" + glumci.getBrojSnimljenihFilmova() + "\n" + "Ukupna zarada:" + glumci.ukupnaZaradaUSvimFilmovima()+"\n" +"Koliko godina pune:"+ glumci.kolikoGodinaPune());
	

	
	}

}
