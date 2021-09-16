package myGlumcipackage;

import java.util.*;


public class Glumci {

public String ime;
public String prezime;
public int godinaRodjenja;
public String pol;


private boolean bracnoStanje;
private double prosecnaZaradaPoFilmu;
private int brojSnimljenihFilmova;
	



ArrayList al=new ArrayList();


public void unesiPetFilmovaIOcena() {
	
	
Scanner sc= new Scanner(System.in);

for(int i=0;i<5;i++) 
{	
	System.out.println("Unesite ime filma i ocenu:");
	
	String imeFilma=sc.next();
	
	int ocenaFilma=sc.nextInt();
	
	Film film= new Film(imeFilma,ocenaFilma);
	
	al.add(film);
	
	
}

}


  public void setBracnoStanje(boolean bracnoStanje) {
	  
	this.bracnoStanje=bracnoStanje; 
	  
  }
  
  

  public boolean getBracnoStanje() {

  return this.bracnoStanje;

  }


  public void setprosecnaZaradaPoFilmu (double prosecnaZaradaPoFilmu) {

  this.prosecnaZaradaPoFilmu=prosecnaZaradaPoFilmu;

  }
  
  public double getprosecnaZaradaPoFilmu() {
  
  return this.prosecnaZaradaPoFilmu;
  
  
}

  
  public void setBrojSnimljenihFilmova (int brojSnimlenihFilmova) {
  
  this.brojSnimljenihFilmova=brojSnimlenihFilmova;
  
  } 
  
  public int getBrojSnimljenihFilmova() {
  
  return this.brojSnimljenihFilmova;
  

}

 
  
  public double ukupnaZaradaUSvimFilmovima() {
  
  return brojSnimljenihFilmova*prosecnaZaradaPoFilmu;
  
  
  } 
  
  public int kolikoGodinaPune() {
  
  return 2021-godinaRodjenja;
	  
  }
  
 public String MrMrs() {
  
  if(pol== "muski") {
  
  return "Mr";
 
 } 
 
  else if (pol=="zenski") {
  
  return "Mrs";
  
 }
 
  else {
 
  return "";
  
 } 
 
 }
 
}




