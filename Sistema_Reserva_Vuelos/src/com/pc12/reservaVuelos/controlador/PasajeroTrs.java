package com.pc12.reservaVuelos.controlador;

import java.util.ArrayList;

import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.modelo.Pasajero;

public class PasajeroTrs implements ICrud {

	@Override
	public String guaradar(Object registro) {
		if (registro != null) {
			
				
					Memoria.pasajeros.add((Pasajero) registro);
					return "Usuario Correctamente guardado";
			}
	
			
		else {

			return "Debe llenar todos los datos";
		}
	}

	@Override
	public String actualizar(String id, Object registro) {
		
		return null;
	}

	@Override
	public String eliminar(String id) {
		Memoria.pasajeros.remove(consultarPorId(id));
			
		
		return "eliminado";
	}

	@Override
	public Object[] listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object consultarPorId(String id) {
		int cont=0;
		for (int i = 0; i < Memoria.pasajeros.size(); i++) {
			if(Memoria.pasajeros.get(i).equals(id)) {
				i=cont;
			}
		}
		
		return Memoria.pasajeros.get(cont);
	}

	public Pasajero validarPasajero(String email, String clave) {
		Pasajero aux = null;
		for (Pasajero pasajero : Memoria.pasajeros) {
			if (pasajero.getEmail().equals(email) && pasajero.getClave().equals(clave)) {
				aux = pasajero;
				break;
			}

		}

		return aux;

	}
	
	public boolean disponibilidad(String cedula,String email) {
		boolean bandera=true;
		for (Pasajero pas : Memoria.pasajeros) {
			
			if(pas.getCedula().equals(cedula)||pas.getEmail().equals(email)) {
				 bandera=false;
				 break;
			}
			
		}
		
		return bandera;
	}
	
	

}
