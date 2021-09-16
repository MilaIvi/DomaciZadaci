package AutobusVezba;

public class Vozac extends Covek {

	 private String zvanje;

	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje="sofer";
	}

	public String getZvanje() {
		return zvanje;
	}

	
	
@Override

public String toString() {
	
return super.toString()+zvanje;	

}


}
