package AutobusVezba;

public class Covek {
	
	private String ime;
	private String prezime;



   public Covek(String ime, String prezime) {

   this.ime=ime;
   this.prezime=prezime;

 }



public String getIme() {
	return ime;
}


public String getPrezime() {
	return prezime;
}


@Override

public String toString() {

  return "Ime:" +ime+"Prezime:" +prezime;



}



}