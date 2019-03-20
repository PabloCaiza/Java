package com.pc12.reservaVuelos.controlador;

import java.util.ArrayList;
import java.util.List;

import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.modelo.Pasajero;

public class PasajeroTrs implements ICrudC {
	/*
	 * @Override public String guaradar(Object registro) { if (registro != null) {
	 * 
	 * Memoria.pasajeros.add((Pasajero) registro); return
	 * "Usuario Correctamente guardado"; }
	 * 
	 * else {
	 * 
	 * return "Debe llenar todos los datos"; } }
	 * 
	 * @Override public String actualizar(String id, Object registro) {
	 * 
	 * return null; }
	 * 
	 * @Override public String eliminar(String id) {
	 * Memoria.pasajeros.remove(consultarPorId(id));
	 * 
	 * return "eliminado"; }
	 * 
	 * @Override public Object[] listar() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public Object consultarPorId(String id) { int cont = 0; for (int i
	 * = 0; i < Memoria.pasajeros.size(); i++) { if
	 * (Memoria.pasajeros.get(i).equals(id)) { i = cont; } }
	 * 
	 * return Memoria.pasajeros.get(cont); }
	 * 
	 * public Pasajero validarPasajero(String email, String clave) { Pasajero aux =
	 * null; for (Pasajero pasajero : Memoria.pasajeros) { if
	 * (pasajero.getEmail().equals(email) && pasajero.getClave().equals(clave)) {
	 * aux = pasajero; break; }
	 * 
	 * }
	 * 
	 * return aux;
	 * 
	 * }
	 * 
	 * public boolean disponibilidad(String cedula, String email) { boolean bandera
	 * = true; for (Pasajero pas : Memoria.pasajeros) {
	 * 
	 * if (pas.getCedula().equals(cedula) || pas.getEmail().equals(email)) { bandera
	 * = false; break; }
	 * 
	 * }
	 * 
	 * return bandera; }
	 */
	@Override
	public String guardar(Object registro) throws Exception {
		
			
		
		if (registro != null) {
			Memoria.pasajeros.add((Pasajero) registro);
			return "Registrado Correctamente";
		} else {
			return "Llene el registro";
		}
	}

	@Override
	public String modificar(Object registro) throws Exception {
		if (registro != null) {
			int pos = Memoria.pasajeros.indexOf(registro);
			if (pos >= 0) {

				Memoria.pasajeros.set(pos, (Pasajero) registro);
				return "Se modifico correctamente";
			} else {
				return "no se encontro registro";
			}
		} else {
			return "Llene los espacios";
		}
	}

	@Override
	public String eliminar(Object registro) throws Exception {
		if (registro != null) {
			int pos = Memoria.pasajeros.indexOf(registro);
			if (pos >= 0) {
				Memoria.pasajeros.remove(pos);
				return "se elimino correctamente";
			} else {
				return "no se encontro registro";
			}
		} else {
			return "Ingrese el id";
		}
	}

	@Override
	public List<?> consultarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Object consultarPorIde(String id) throws Exception {
		Pasajero pasajero = null;
		for (Pasajero pas : Memoria.pasajeros) {
			if (pas.getCedula().equals(id)) {
				pasajero = pas;
				break;
			}
		}
		return pasajero;
	}

	public Pasajero validarPasajero(String email, String clave) throws Exception {
		Pasajero pasajero = null;
		for (Pasajero pas : Memoria.pasajeros) {
			if (pas.getEmail().equals(email) && pas.getClave().equals(clave)) {
				pasajero = pas;
				break;
			}
		}
		return pasajero;
	}

	public boolean disponibilidad(String cedula, String email)  {
		boolean bandera = true;
		for (Pasajero pas : Memoria.pasajeros) {
			if (pas.getEmail().equals(email) || pas.getCedula().equals(cedula)) {
				bandera = false;
				break;
			}

		}
		return bandera;
	}

	public boolean disponibilidad(String cedula) {
		boolean bandera = true;
		for (Pasajero pas : Memoria.pasajeros) {
			if (pas.getCedula().equals(cedula)) {
				bandera = false;
				break;
			}

		}
		return bandera;
	}
	
	
}
