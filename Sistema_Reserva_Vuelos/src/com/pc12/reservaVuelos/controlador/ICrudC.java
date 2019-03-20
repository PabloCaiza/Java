package com.pc12.reservaVuelos.controlador;

import java.util.List;

/**
 * Clase para definir los metodos CRUD utilizando collections
 * 
 * @author Administrador
 *
 */
public interface ICrudC {

	public String guardar(Object registro)throws Exception;

	public String modificar(Object registro)throws Exception;

	public String eliminar(Object registro)throws Exception;

	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos
	 */
	public List<?> consultarTodos() throws Exception;

}
