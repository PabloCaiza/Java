package com.pc12.reservaVuelos.modelo;

public class Pasajero {

	private String nombre;
	
	private String cedula;
	private String email;
	private String clave;
	
	
	public Pasajero() {
		
	}


	/**
	 * @param nombre
	 * @param asiento
	 * @param cedula
	 * @param email
	 * @param clave
	 */
	public Pasajero(String nombre, String cedula, String email, String clave) {
		super();
		this.nombre = nombre;
	
		this.cedula = cedula;
		this.email = email;
		this.clave = clave;
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
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}


	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", cedula=" + cedula + ", email=" + email + ", clave=" + clave + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
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
		Pasajero other = (Pasajero) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}
	
	
	
	

}
