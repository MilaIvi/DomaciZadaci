package Projekat4;

public class Auto {

	public String ime;
	
	private int predjeniKm;
	
	
	
	public Auto() {
		
	}
	
	public void stampanje() { System.out.println("Auto"+ime+ "je presao" + getPredjeniKm() +"kilometara");}
	
	public void setPredjeniKm(int km) {this.PredjeniKm=km;}

	public void getPredjeniKm() {return this.predjeniKm;}

}

