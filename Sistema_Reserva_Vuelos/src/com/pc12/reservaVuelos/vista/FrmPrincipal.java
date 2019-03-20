package com.pc12.reservaVuelos.vista;

import java.util.Collections;

import com.pc12.reservaVuelos.controlador.PasajeroTrs;
import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.modelo.Pasajero;
import com.pc12.reservaVuelos.modelo.Vuelo;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmPrincipal {

	public FrmPrincipal(Pasajero pasajero) {
		int opcion = 0;
		PasajeroTrs pasajeroTrs = new PasajeroTrs();
		String mensaje, id, clave;
		do {
			try {
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
			} catch (NumberFormatException e1) {
				System.err.println("Solo Ingrese numero !!");
			}
			switch (opcion) {
			case 1:
				int op = 0;
				do {

					try {
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
					} catch (NumberFormatException e) {
						System.err.println("Solo Ingrese numero !!");
					}
					switch (op) {
					case 1:
						for (Vuelo vuelo : Memoria.vuelos) {
							if (vuelo != null) {

								System.out.println("*" + "Partida: " + vuelo.getPartida() + "  " + "Destino"
										+ vuelo.getDestino() + "  " + "Fecha" + vuelo.getFecha() + "*");
								System.out.println("***************************************************************");
							}
						}

						break;
					case 2:
						int cuentaCambios = 0;

						for (boolean ordenado = false; !ordenado;) {

							for (int i = 0; i < Memoria.vuelos.length - 1; i++) {

								if (Memoria.vuelos[i] != null && Memoria.vuelos[i + 1] != null
										&& Memoria.vuelos[i].getCosto() < Memoria.vuelos[i + 1].getCosto()) {
									Vuelo aux = Memoria.vuelos[i];
									Memoria.vuelos[i] = Memoria.vuelos[i + 1];
									Memoria.vuelos[i + 1] = aux;
									cuentaCambios++;

								}
							}

							if (cuentaCambios == 0) {
								ordenado = true;
							}

							cuentaCambios = 0;
						}

						for (Vuelo vuelo : Memoria.vuelos) {
							System.out.println(vuelo);
						}
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
				} while (op != 5);

				break;
			case 2:
				FrmReserva c = new FrmReserva();

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
					try {
						Pasajero pas = new Pasajero(nombre, id, email, clave);
						mensaje = pasajeroTrs.modificar(pas);
						System.out.println(mensaje);
					} catch (Exception e) {

						System.out.println(e.getMessage());
					}

				} else {
					System.err.println("Ingrese bien la cedula para modificar");
				}

				break;
			case 6:
				System.out.print("Ingrese su cedula: ");
				id = UtilLectura.leerDesdeTecalado();
				if(!pasajeroTrs.disponibilidad(id)) {
				for (Pasajero pas : Memoria.pasajeros) {
					if (pas.getCedula().equals(id)) {
						System.out.println(pas);
						break;
					}
				}
				}else {
					System.err.println("Revise su cedula");
				}

				break;
			case 7:
				try {
					System.out.println("Ingrese su cedula");
					id = UtilLectura.leerDesdeTecalado();
					Pasajero pas = (Pasajero) pasajeroTrs.consultarPorIde(id);
					mensaje = pasajeroTrs.eliminar(pas);
					System.out.println(mensaje);
					FrmLogin2 b = new FrmLogin2();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
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

	public FrmPrincipal() {
		// TODO Auto-generated constructor stub
	}

}
