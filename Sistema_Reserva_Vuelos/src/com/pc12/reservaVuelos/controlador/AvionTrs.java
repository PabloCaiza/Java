package com.pc12.reservaVuelos.controlador;

import java.util.List;

import com.pc12.reservaVuelos.modelo.Avion;
import com.pc12.reservaVuelos.modelo.Memoria;

public class AvionTrs implements ICrudC {

	@Override
	public String guardar(Object registro) {
		if(registro!=null) {
			Memoria.aviones.add((Avion) registro);
			return "Se guardo correctamente";
		}else {
			return "Llene los espacios";
		}
		
	}

	@Override
	public String modificar(Object registro) {
		if(registro!=null) {
		//obteniendo la posicion del registro
		int pos=Memoria.aviones.indexOf(registro);
		if(pos>=0) {
		Memoria.aviones.set(pos, (Avion) registro);
		return "Se modifico correctamente";
		}else
		return "no se encontro registro";
		}else {
			return "llene los espacion";
		}
	}

	@Override
	public String eliminar(String id) {
		boolean bandera=false;
		int cont =0;
		for (int i = 0; i < Memoria.aviones.size(); i++) {
			if(Memoria.aviones.get(i).getPlaca().equals(id)) {
				cont=i;
				bandera=true;
				break;
			}
		}
		if(bandera) {
			Memoria.aviones.remove(cont);
			return "eliminado correctamente";
		}else {
			return "no se encontro";
		}
		
		
	
	}

	@Override
	public List<?> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean disponibilidad(String placa) {
		boolean bandera=true;
		for (Avion avion : Memoria.aviones) {
			if(avion.getPlaca().equals(placa)) {
				bandera=false;
				break;
			}
		}
		
		return bandera;
	}

	
	
}
