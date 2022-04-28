package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	private Zoologico zoo;
	
	public Zona() {
		
	}
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	public void setNombre(String nomb) {
		nombre=nomb;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}

}
