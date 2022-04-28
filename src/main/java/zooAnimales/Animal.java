package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad,String habitad, String genero) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.habitad=habitad;
		this.genero=genero;
		totalAnimales++;
	}
	
	public Animal() {
		totalAnimales++;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitad() {
		return habitad;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setHabitad(String habitad) {
		this.habitad=habitad;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public static void setTotalAnimales(int a) {
		totalAnimales=a;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos" + Mamifero.cantidadMamiferos() +
				"\nAves: "+ Ave.cantidadAves() +
				"\nReptiles: "+ Reptil.cantidadReptiles() +
				"\nPeces: "+ Pez.cantidadPeces() +
				"\nAnfibios: "+ Anfibio.cantidadAnfibios();
				
				
	}
	public String toSting() {
		if (zona == null) {
			return "Mi nombre es " + nombre  + ", tengo una edad de " + edad  + ", habito en " + habitad + " y mi genero es " +genero;
		}
		else{
		      return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitad + " y mi genero es " + genero + ", la zona donde me ubico es " + zona + ", en el zoo " + zona.getZoo() ;
		    }
	}
}
