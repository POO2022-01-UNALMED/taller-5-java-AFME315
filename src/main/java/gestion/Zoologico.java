package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre,String ubicacion, ArrayList<Zona> zona) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas=zona;
	}
	
	public Zoologico() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return this.zonas;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas=zonas;
	}
	
	public void agregarZonas(Zona zonas) {
		this.zonas.add(zonas);
		
	}
	 public int cantidadTotalAnimales(){
		    int x = 0;
		    
		    for(Zona e:zonas){
		      x += e.cantidadAnimales();
		    }
		    return x;
	 }
}
