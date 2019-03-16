package com.pc12.reservaVuelos.modelo;

import java.util.Date;

public class Vuelo {
	private double costo;
	private String partida;
	private String destino;
	private String id;
	private Date fecha;
	
	
	
public Vuelo() {
	// TODO Auto-generated constructor stub
}

	



	/**
 * @param costo
 * @param partida
 * @param destino
 * @param id
 * @param fecha
 */
public Vuelo(double costo, String partida, String destino, String id, Date fecha) {
	super();
	this.costo = costo;
	this.partida = partida;
	this.destino = destino;
	this.id = id;
	this.fecha = fecha;
}





	/**
	 * @return the costo
	 */
	public double getCosto() {
		return costo;
	}
	/**
	 * @param costo the costo to set
	 */
	public void setCosto(double costo) {
		this.costo = costo;
	}
	/**
	 * @return the partida
	 */
	public String getPartida() {
		return partida;
	}
	/**
	 * @param partida the partida to set
	 */
	public void setPartida(String partida) {
		this.partida = partida;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}





	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vuelo [costo=" + costo + ", partida=" + partida + ", destino=" + destino + ", id=" + id + ", fecha="
				+ fecha + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	

}
