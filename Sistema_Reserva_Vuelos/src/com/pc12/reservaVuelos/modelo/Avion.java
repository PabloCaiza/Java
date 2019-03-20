package com.pc12.reservaVuelos.modelo;

import java.util.Comparator;

/**
 * Clase que representa a un Avion de un sistema de reserva de vuelos
 * @author Administrador
 *
 */
public class Avion {
	private String compania;
	private String  tipo;
	private int capacidad;
	private String placa;
	private Aerolinea aerolinea;
	
	public Avion() {
	
	}
	/**
	 * @param compania
	 * @param tipo
	 * @param capacidad
	 */
	
	
	/**
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}
	/**
	 * @param compania
	 * @param tipo
	 * @param capacidad
	 * @param placa
	 */
	public Avion(String compania, String tipo, int capacidad, String placa) {
		super();
		this.compania = compania;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.placa = placa;
	}
	
	
	/**
	 * @param compania
	 * @param tipo
	 * @param capacidad
	 * @param placa
	 * @param aerolinea
	 */
	public Avion(String compania, String tipo, int capacidad, String placa, Aerolinea aerolinea) {
		super();
		this.compania = compania;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.placa = placa;
		this.aerolinea = aerolinea;
	}
	/**
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}


	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	/**
	 * @return the aerolinea
	 */
	public Aerolinea getAerolinea() {
		return aerolinea;
	}


	/**
	 * @param aerolinea the aerolinea to set
	 */
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Avion [compania=" + compania + ", tipo=" + tipo + ", capacidad=" + capacidad + ", placa=" + placa
				+ ", aerolinea=" + aerolinea + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	

	
	public class ordenarCapacidad implements Comparator<Avion> {

		@Override
		public int compare(Avion o1, Avion o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getCapacidad(), o2.getCapacidad());
		}
		
	}
	
	
	
	

}
