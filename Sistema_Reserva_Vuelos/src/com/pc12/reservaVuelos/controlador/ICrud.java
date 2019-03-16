package com.pc12.reservaVuelos.controlador;

public interface ICrud {

	public String guaradar(Object registro);
	public String actualizar(String id,Object registro);
	public String eliminar(String id);
	public Object[] listar();
	public Object consultarPorId(String id);
	
}
