package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.controlador.PasajeroTrs;
import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.modelo.Pasajero;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmPrincipal {

	public FrmPrincipal(Pasajero pasajero) {
		int opcion = 0;
		PasajeroTrs pasajeroTrs = new PasajeroTrs();
		String mensaje, id, clave;
		do {
			System.out.println("                                ");
			System.out.println("********************************");
			System.out.println("* Sistema de Reserva de Vuelos *");
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.println("*BIENVENIDO: " + pasajero.getNombre());
			System.out.println("                                ");
			System.out.println("*     Selecione una opcion     *");
			System.out.println("                                ");
			System.out.println("1. Consulta de vuelos");
			System.out.println("2. Reserva de vuelos ");
			System.out.println("3. Compra de Billetes");
			System.out.println("4. Cerrar Sesion ");
			System.out.println("5.Modificar Datos Personales");
			System.out.println("6.Mostrar Datos");
			System.out.println("7.Eliminar Cuenta");
			System.out.println("8.Salir");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			switch (opcion) {
			case 1:

				int op = 0;
				System.out.println("Usuario: " + pasajero.getNombre());
				System.out.println("                                ");
				System.out.println("*     Selecione una opcion     *");
				System.out.println("                                ");
				System.out.println("1. Horario Vuelos");
				System.out.println("2. Tarifa de Vuelos ");
				System.out.println("3. Informacion de Vuelos");
				System.out.println("4. Regresar");
				System.out.println("5. Salir");

				op = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				switch (op) {
				case 1:

					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					FrmPrincipal a = new FrmPrincipal(pasajero);
					break;
				case 5:
					System.exit(0);
					break;

				default:
					System.err.println("Solo numeros del 1 al 5");
					break;
				}

				break;
			case 2:

				break;
			case 3:
				break;
			case 4:
				FrmLogin2 a = new FrmLogin2();

				break;
			case 5:
				System.out.print("Ingrese su cedula para modificar sus datos: ");
				id = UtilLectura.leerDesdeTecalado();
				if (!pasajeroTrs.disponibilidad(id)) {
					System.out.print("Ingrese su nombre: ");
					String nombre = UtilLectura.leerDesdeTecalado();

					System.out.print("Ingrese su email: ");
					String email = UtilLectura.leerDesdeTecalado();
					System.out.print("Ingrese su clave: ");
					clave = UtilLectura.leerDesdeTecalado();
					Pasajero pas = new Pasajero(nombre, id, email, clave);
					mensaje = pasajeroTrs.modificar(pas);
					System.out.println(mensaje);
				} else {
					System.err.println("Ingrese bien la cedula para modificar");
				}

				break;
			case 6:
				System.out.print("Ingrese su cedula: ");
				id = UtilLectura.leerDesdeTecalado();

				for (Pasajero pas : Memoria.pasajeros) {
					if (pas.getCedula().equals(id)) {
						System.out.println(pas);
						break;
					}
				}

				break;
			case 7:
				System.out.println("Ingrese su cedula");
				id = UtilLectura.leerDesdeTecalado();
				Pasajero pas = (Pasajero) pasajeroTrs.consultarPorIde(id);
				mensaje = pasajeroTrs.eliminar(pas);
				System.out.println(mensaje);
				FrmLogin2 b = new FrmLogin2();
				break;
			case 8:
				System.exit(0);
				break;

			default:
				System.err.println("Solo numero entres 1 y 7");
				break;
			}
		} while (opcion != 8);
	}

}
