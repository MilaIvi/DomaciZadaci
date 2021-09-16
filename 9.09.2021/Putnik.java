package AutobusVezba;

public class Putnik extends Covek {
	
	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime,prezime);
		this.novac=novac;
		
	}

	
	
	public boolean dodavanjeNovca(int novac) {
	
	this.novac=this.novac+novac;	
	
	return true;
	
}
	
   public boolean oduzimanjeNovca(int novac) {	
	
   if(this.novac>=novac) {
	   
   
   this.novac=this.novac-novac;
   return true;
   
   }
   else return false;
   }
   
   public int getNovac() {
		return novac;
	}
  
@Override

public String toString() {
	
	return "Putnik: " + super.getIme() +""+super.getPrezime()+ ", ima sumu od: " + novac + "din.";

}

}



   