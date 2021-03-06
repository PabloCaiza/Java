package com.pc12.reservaVuelos.controlador;

import com.pc12.reservaVuelos.modelo.Aerolinea;
import com.pc12.reservaVuelos.modelo.Memoria;

public class AerolineaTrs implements ICrud {

	@Override
	public String guaradar(Object registro) {
		boolean bandera = false;
		if(registro!=null) {
		for (int i = 0; i < Memoria.aerolineas.length; i++) {
			if (Memoria.aerolineas[i] == null) {
				Memoria.aerolineas[i] = (Aerolinea) registro;
				bandera = true;
				break;
			}
		}
		if (bandera) {
			return "Guardado correctamente";
		} else {
			return "Solo se acepta 5 datos";
		}
		}else {
			return "LLene Todos los espacions";
		}
	}

	@Override
	public String actualizar(String id, Object registro) {
		int cont = 0;
		boolean bandera = false;
		if (registro != null) {
			for (int i = 0; i < Memoria.aerolineas.length; i++) {
				if (Memoria.aerolineas[i].getIdAerolinea().equals(id)) {
					bandera = true;
					break;
				}
				cont++;
			}

			if (bandera) {
				Memoria.aerolineas[cont] = (Aerolinea) registro;
				return "se encontrado";

			} else {
				return "no se a encontrado";
			}

		} else {
			return "Llene los espacios";
		}
	}

	@Override
	public String eliminar(String id) {
		boolean bandera = false;
		int cont = 0;
		for (Aerolinea aerolinea : Memoria.aerolineas) {
			if (aerolinea != null && aerolinea.getIdAerolinea().equals(id)) {
				bandera = true;
				break;
			}
			cont++;
		}
		if (bandera) {
			Memoria.aerolineas[cont] = null;
			return "Se elimino correctamente";
		} else {
			return "no se encontro registro";
		}
	}

	@Override
	public Object[] listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object consultarPorId(String id)throws Exception {
		Aerolinea aero = null;
		try {
			for (Aerolinea aerolinea : Memoria.aerolineas) {
				if ( aerolinea.getIdAerolinea().equals(id)) {
					aero = aerolinea;
					break;
				}
			}
		} catch (Exception e) {
			throw new Exception("Aerolinea no existe");
		}
		return aero;
	}

	public boolean disponibilidad(String id) {
		boolean bandera = true;
		for (Aerolinea aerolinea : Memoria.aerolineas) {
			if (aerolinea != null && aerolinea.getIdAerolinea().equals(id)) {
				bandera = false;
				break;
			}
		}
		return bandera;
	}

	/**
	 * Metodo para imprimir las aerolineas
	 */

	public String imprimirListaFormateada() {
		StringBuilder lista = new StringBuilder();
		for (Aerolinea aerolinea : Memoria.aerolineas) {
			if (aerolinea != null) {
				lista.append("Nombre: ").append(aerolinea.getNombre()).append(" ").append("ID: ")
						.append(aerolinea.getIdAerolinea()).append("||");

			}
		}
		return lista.toString();
	}

}
