package zooloskiVrt;
public class Zivotinje {
	
private String naziv;	
private String hrana;
private String vrsta;

public String getVrsta() {
	return vrsta;
}


public void setVrsta(String vrsta) {
	this.vrsta = vrsta;
}


public String getNaziv() {
	return naziv;
}


public void setNaziv(String naziv) {
	this.naziv = naziv;
}


public String getHrana() {
	return hrana;
}


public void setHrana(String hrana) {
	this.hrana = hrana;
}




public Zivotinje(String naziv,String hrana, String vrsta ) {
this.naziv=naziv;
this.hrana=hrana;
this.vrsta=vrsta;

	
}



}
