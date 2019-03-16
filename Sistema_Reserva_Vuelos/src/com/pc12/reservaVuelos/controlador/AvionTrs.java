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
		int pos= Memoria.aviones.indexOf(registro);
		if(pos>=0) {
			Memoria.aviones.set(pos,(Avion) registro);
			return "Se modifico correctamente";
		}else {
			return "No se ha encontrado registro";
		}
		
	}else {
		return "llene todos los datos";
	}
	}

	@Override
	public String eliminar(Object registro) {
		
		if(registro!=null) {
			int pos = Memoria.aviones.indexOf(registro);
			
			if(pos>=0) {
				Memoria.aviones.remove(pos);
				return "Se Elimino correctamente";
				
			}else {
				return "No existe registro";
			}
			
		}else {
			return "Esta vacio";
		}
	
	}

	@Override
	public List<?> consultarTodos() {
		
		return Memoria.aviones;
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

	public Object consultarTodos(String id) {
		Avion a=null;
		for (Avion avion : Memoria.aviones) {
			if(avion.getPlaca().equals(id)) {
				a=avion;
				break;
			}
		}
		
		return a;
	}

	
	
}
