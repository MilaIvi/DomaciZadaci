
package AutobusVezba;

public class Autobus {
	
private String naziv;
private int cenaKarte;
private Vozac voz;
private Putnik put;
public Autobus(String naziv, int cenaKarte, Vozac voz, Putnik put) {
	this.naziv = naziv;
	this.cenaKarte = cenaKarte;
	this.voz = voz;
	this.put = put;
}
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public int getCnKarte() {
	return cenaKarte;
}
public void setcenaKarte(int cenaKarte) {
	this.cenaKarte = cenaKarte;
}
public Vozac getVoz() {
	return voz;
}
public void setVoz(Vozac voz) {
	this.voz = voz;
}
public Putnik getPut() {
	return put;
}
public void setPut(Putnik put) {
	this.put = put;
}
public String toString() {
	
	return "\nAutobus: " + naziv +"\n" + voz + "Cena karte: " + cenaKarte + "din." + "\n" + put;

}

}
