package rutas;
import java.util.Scanner;
public class Ciudades {
	int cantciudad = 0;
	int km = 0;

	public Ciudades() {
		// TODO Auto-generated constructor stub
		 Scanner ingreso = new Scanner(System.in);
			System.out.println("Ingrese cantidad de ciudades:");
			cantciudad = ingreso.nextInt();
			System.out.println("Ingrese km de ciudad:");
			km = ingreso.nextInt();
		
			ingreso.close();
		   
	}

	public int getCantciudad() {
		return cantciudad;
	}

	public void setCantciudad(int cantciudad) {
		this.cantciudad = cantciudad;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

}
