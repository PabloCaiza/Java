package com.pc12.reservaVuelos.modelo;

import java.util.List;

public class Aerolinea {
	private String nombre;
	private String idAerolinea;
	private List<Avion> aviones;
	

	public Aerolinea() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	/**
	 * @param nombre
	 * @param idAerolinea
	 * @param aviones
	 */
	public Aerolinea(String nombre, String idAerolinea, List<Avion> aviones) {
		super();
		this.nombre = nombre;
		this.idAerolinea = idAerolinea;
		this.aviones = aviones;
	}

	
	

	/**
	 * @param nombre
	 * @param idAerolinea
	 */
	public Aerolinea(String nombre, String idAerolinea) {
		super();
		this.nombre = nombre;
		this.idAerolinea = idAerolinea;
	}




	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the idAerolinea
	 */
	public String getIdAerolinea() {
		return idAerolinea;
	}


	/**
	 * @param idAerolinea the idAerolinea to set
	 */
	public void setIdAerolinea(String idAerolinea) {
		this.idAerolinea = idAerolinea;
	}


	/**
	 * @return the aviones
	 */
	public List<Avion> getAviones() {
		return aviones;
	}


	/**
	 * @param aviones the aviones to set
	 */
	public void setAviones(List<Avion> aviones) {
		this.aviones = aviones;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + ", idAerolinea=" + idAerolinea + ", aviones=" + aviones + "]";
	}
	
	
	
}
