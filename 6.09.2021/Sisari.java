package zooloskiVrt;

import java.util.ArrayList;

public class Sisari extends Zivotinje{
	
private String bojaDlake;

public String getBojaDlake() {
	return bojaDlake;
}

public void setBojaDlake(String bojaDlake) {
	this.bojaDlake = bojaDlake;
}

public ArrayList<String> getNacinIshrane() {
	return nacinIshrane;
}

public void setNacinIshrane(ArrayList<String> nacinIshrane) {
	this.nacinIshrane = nacinIshrane;
}

public ArrayList<String> getCovekovaPodela() {
	return covekovaPodela;
}

public void setCovekovaPodela(ArrayList<String> covekovaPodela) {
	this.covekovaPodela = covekovaPodela;
}

ArrayList<String>nacinIshrane= new ArrayList<String>(); 

ArrayList<String>covekovaPodela= new ArrayList<String>(); 

public Sisari (String naziv,String hrana,String bojaDlake) {
super(naziv,hrana,bojaDlake);
this.bojaDlake=bojaDlake;

	
	
nacinIshrane.add("Biljojedi");	
nacinIshrane.add("Mesojedi");	
nacinIshrane.add("Svastojedi");
covekovaPodela.add("Divlje");
covekovaPodela.add("Domace");

}

	

}
