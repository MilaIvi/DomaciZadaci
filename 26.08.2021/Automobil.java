package Projekat4;

public class Automobil {
	
	public String marka;
    public String model;
    public int brojVrata;
    public int godiste;
    public String pogon;
    private int predjeniKm;

    public Automobil(String marka, String model, int brojVrata, int godiste, String pogon) {
        this.brojVrata = brojVrata;
        this.marka = marka;
        this.model = model;
        this.pogon = pogon;
        this.godiste = godiste;
    }

    public Automobil() {

    }

    public void stampanje(){
        System.out.println("Auto " + marka + " " + model + " je " + godiste +
                " ima " + brojVrata + " vrata i ide na " + pogon + ", a presao je "
        + getPredjeniKm() + " kilometara.");
    }

    public void setPredjeniKm(int km){
        this.predjeniKm = km;
    }

    public int getPredjeniKm(){
        return this.predjeniKm;
    }

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


