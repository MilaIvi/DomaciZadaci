package AutobusVezba;

public class MainMain {

	public static void main(String[] args) {
		Vozac v1 = new Vozac("Dragan","Tintor", "Sofer");
		System.out.println(v1);
        Putnik p1 = new Putnik("Sukrija","Rahmanjinova", 2300);
        System.out.println(p1);
        Autobus a1 = new Autobus ("Fudeks", 500, v1, p1);
        System.out.println(a1);
        
	}
​
}	

