package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.controlador.PasajeroTrs;
import com.pc12.reservaVuelos.modelo.Pasajero;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmRegistro {

	public FrmRegistro() {
		registro();
	}

	private void registro() {
		int opcion = 0;

		do {
			try {
				System.out.println("***********************************************");
				System.out.println("* Bienvenidos al Sistema de Registros *");
				System.out.println("***********************************************");
				System.out.println("                                               ");
				System.out.println("1.Ingresar Datos");
				System.out.println("2.Regresar");
				System.out.println("3.Salir");
				System.out.print("Eliga una Opcion: ");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			} catch (NumberFormatException e2) {
				System.err.println("Solo Ingrese numero !!");
			}
			switch (opcion) {
			case 1:

				String nombre = null, cedula = null, email = null, clave = null;
				System.out.println("                 ");
				System.out.print("Ingrese su nombre: ");
				nombre = UtilLectura.leerDesdeTecalado();
				System.out.print("Ingrese su cedula: ");
				cedula = UtilLectura.leerDesdeTecalado();
				System.out.print("Ingrese su email: ");
				email = UtilLectura.leerDesdeTecalado();
				System.out.print("Ingrese su clave: ");
				clave = UtilLectura.leerDesdeTecalado();

				Pasajero pasajero = null;
				try {
					pasajero = new Pasajero(nombre, cedula, email, clave);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.err.println(e1.getMessage());
				}

				PasajeroTrs pas = new PasajeroTrs();

				try {
					if (pas.disponibilidad(pasajero.getCedula(), pasajero.getEmail())) {

						String mensaje = pas.guardar(pasajero);
						System.out.println(mensaje);
						FrmLogin2 a = new FrmLogin2();
						

					} else {
						System.err.println("Usuario ya se encuentra registrado");
						System.out.print(" ");

						FrmRegistro a = new FrmRegistro();

					}
				} catch (Exception e) {

				}
				break;
			case 2:
				FrmLogin2 a = new FrmLogin2();
				break;
			case 3:
				System.exit(0);
				break;

			default:
				System.err.println("Solo numero del 1 al 3");
				break;
			}

		} while (opcion != 3);
	}
}
