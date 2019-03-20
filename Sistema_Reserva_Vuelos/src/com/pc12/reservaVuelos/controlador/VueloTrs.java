package com.pc12.reservaVuelos.controlador;

import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.modelo.Vuelo;

public class VueloTrs implements ICrud {

	@Override
	public String guaradar(Object registro) {
		boolean bandera=false;
		if (registro != null) {
			for (int i = 0; i < Memoria.vuelos.length; i++) {
				if(Memoria.vuelos[i]==null) {
				Memoria.vuelos[i]=(Vuelo)registro;
				bandera=true;
				break;
				}
			}
			
			if(bandera) {
				return "Se registro correctamente";
			}else {
				return "No se registro solo se acepta 5 datos";
			}
			
			
			
		}else {
		
		return "No se Registro";
		}
	}

	@Override
	public String actualizar(String id, Object registro) {
		if(registro!=null) {
			boolean bandera=false;
			int cont=0;
			for (Vuelo vuelo: Memoria.vuelos) {
				if(vuelo!=null&&vuelo.getId().equals(id)) {
					bandera=true;
					break;
				}
				cont++;
			}
			
			if(bandera) {
				Memoria.vuelos[cont]=(Vuelo)registro;
				return "Se modifico correctamente";
			}else {
				return "No se ha encontrado";
			}
			
		}else {
			return "Llene todos los espacion";
		}
	
	}

	@Override
	public String eliminar(String id) {
	boolean bandera=false;
	int cont=0;
	for (Vuelo vuelo : Memoria.vuelos) {
		if(vuelo!=null&&vuelo.getId().equals(id)) {
			bandera=true;
			break;
		}
		cont++;
	}
	if(bandera) {
		Memoria.vuelos[cont]=null;
		return "Registro eliminado";
	}else {
		return "registro almacenado";
	}
	
		
		
		
	}

	@Override
	public Object[] listar() {
		
		return Memoria.vuelos;
	}

	@Override
	public Object consultarPorId(String id) {
		
		return null;
	}

	public boolean disponibilidad(String id) {
		boolean bandera = true;
		
		for (Vuelo vuelo : Memoria.vuelos) {
			if (vuelo!=null &&vuelo.getId().equals(id)) {
				bandera = false;
				break;
			}

		}
		
	

		return bandera;

	}

}
