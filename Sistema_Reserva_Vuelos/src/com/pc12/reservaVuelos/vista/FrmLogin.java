package com.pc12.reservaVuelos.vista;

import java.util.Scanner;

import com.pc12.reservaVuelos.controlador.PasajeroTrs;
import com.pc12.reservaVuelos.modelo.Pasajero;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmLogin {

	public static void main(String[] args) {
		int option = 0;
		String email;
		String clave;
		String opcion = "";
		Scanner leer = new Scanner(System.in);
		boolean bandera = false;
		boolean bandera1 = false;
		do {

			try {
				System.out.println("***********************************************");
				System.out.println("* Bienvenidos al Sistema de Reserva de Vuelos *");
				System.out.println("***********************************************");
				System.out.println("                                               ");
				System.out.println("1.Ingresar");
				System.out.println("2.Registrarse");
				System.out.println("3.Salir");
				System.out.print("Selecione  una opcion: ");
				option = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			} catch (NumberFormatException e1) {
				System.err.println("Ingrese solo numeros");
			}
			switch (option) {
			case 1:

				try {

					System.out.println("                                               ");
					System.out.println("*******'****************************************");
					System.out.println("*             LOGIN DEL SISTEMA               *");
					System.out.println("***********************************************");
					System.out.print("Email:");
					email = UtilLectura.leerDesdeTecalado();
					System.out.print("Clave:");
					clave = UtilLectura.leerDesdeTecalado();
					if (email.equals("admin") && clave.equals("123")) {
						FrmAdmin a = new FrmAdmin();
					} else {

						// Crear un objeto de adminUsu para aceder a sus atributos
						PasajeroTrs pas = new PasajeroTrs();
						// almacenar en usu el usuario que retorma validarUsuario
						Pasajero pasajero;

						pasajero = pas.validarPasajero(email, clave);
						if (pasajero != null) {

							FrmPrincipal frmPrincipal = new FrmPrincipal(pasajero);
							bandera1 = true;

						} else {
							bandera1 = false;
							System.err.println("No Existe");

						}
					}
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}

				break;
			case 2:
				FrmRegistro a = new FrmRegistro();
				break;
			case 3:
				System.exit(0);
				break;

			default:
				break;
			}

		} while (option != 3);
	}
}
