package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.controlador.PasajeroTrs;
import com.pc12.reservaVuelos.modelo.Pasajero;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmRegistro {

	public FrmRegistro() {
		registro();
	}

	private void registro() {

		System.out.println("                 ");
		System.out.print("Ingrese su nombre: ");
		String nombre = UtilLectura.leerDesdeTecalado();
		System.out.print("Ingrese su cedula: ");
		String cedula = UtilLectura.leerDesdeTecalado();
		System.out.print("Ingrese su email: ");
		String email = UtilLectura.leerDesdeTecalado();
		System.out.print("Ingrese su clave: ");
		String clave = UtilLectura.leerDesdeTecalado();
		Pasajero pasajero = new Pasajero();

		pasajero.setNombre(nombre);
		pasajero.setCedula(cedula);
		pasajero.setEmail(email);
		pasajero.setClave(clave);

		PasajeroTrs pas = new PasajeroTrs();
		if (pas.disponibilidad(pasajero.getCedula(), pasajero.getEmail())) {
			String mensaje = pas.guardar(pasajero);
			System.out.println(mensaje);
		} else {
			System.err.println("Usuario ya se encuentra registrado");
			System.out.print(" ");

			FrmRegistro a = new FrmRegistro();

		}

	}
}
