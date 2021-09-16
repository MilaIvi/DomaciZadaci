package zooloskiVrt;

import java.util.ArrayList;

public class Ribe extends Zivotinje {
	
private int brojPeraja;
private String vrstaPeraja;

public int getBrojPeraja() {
	return brojPeraja;
}

public void setBrojPeraja(int brojPeraja) {
	this.brojPeraja = brojPeraja;
}

public String getVrstaPeraja() {
	return vrstaPeraja;
}

public void setVrstaPeraja(String vrstaPeraja) {
	this.vrstaPeraja = vrstaPeraja;
}

public ArrayList<String> getMestoObitavanja() {
	return mestoObitavanja;
}

public void setMestoObitavanja(ArrayList<String> mestoObitavanja) {
	this.mestoObitavanja = mestoObitavanja;
}

ArrayList<String>mestoObitavanja= new ArrayList<String>(); 

public Ribe(String naziv,String hrana, String vrsta,int brojPeraja, String vrstaPeraja) {
super( naziv, hrana,  vrsta);	
	
mestoObitavanja.add("Slatka voda");	
mestoObitavanja.add("Slana voda");	
	
}

}
