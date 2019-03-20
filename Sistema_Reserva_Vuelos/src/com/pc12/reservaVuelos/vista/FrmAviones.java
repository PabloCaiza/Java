package com.pc12.reservaVuelos.vista;

import java.util.Collections;
import java.util.List;

import com.pc12.reservaVuelos.controlador.AerolineaTrs;
import com.pc12.reservaVuelos.controlador.AvionTrs;
import com.pc12.reservaVuelos.modelo.Aerolinea;
import com.pc12.reservaVuelos.modelo.Avion;
import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.util.UtilLectura;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

public class FrmAviones {

	public FrmAviones() {
		crearMenu();
	}

	private void crearMenu() {
		int opcion = 0;
		AvionTrs av = new AvionTrs();
		AerolineaTrs aeo = new AerolineaTrs();

		Avion avion = null;
		String placa = null;
		int capacidad = 0;
		String tipo = null;
		String compania = null, id = null;
		String mensaje = null;

		do {
		
			try {
				System.out.println("\n\n*************************************");
				System.out.println("*         SISTEMA DE AVIONES        *");
				System.out.println("*************************************");
				System.out.println("1. Listar");
				System.out.println("2. Guardar");
				System.out.println("3. Actualizar");
				System.out.println("4. Eliminar");
				System.out.println("5. Regresar");
				System.out.println("6. Salir");
				System.out.print("... Seleccione una opción:");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			} catch (NumberFormatException e2) {
				System.err.println("Solo Ingrese numero !!");
			}
			
			switch (opcion) {
			case 1:
				Collections.sort(Memoria.aviones, new Avion().new ordenarCapacidad());
				Collections.reverse(Memoria.aviones);
				for (Avion avion1 : Memoria.aviones) {
					System.out.println(avion1);
				}

				break;
			case 2:
				// recuperacion de valores
				Aerolinea aerolinea = null;
				try {
					System.out.print("Compañia:  ");
					compania = UtilLectura.leerDesdeTecalado();
					System.out.print("Tipo:  ");
					tipo = UtilLectura.leerDesdeTecalado();
					System.out.print("Capacidad: ");
					capacidad = Integer.parseInt(UtilLectura.leerDesdeTecalado());
					System.out.println("Ingrese un numero");
					System.out.print("Placa: ");
					placa = UtilLectura.leerDesdeTecalado();
					System.out.println("Lista De Aerolineas " + aeo.imprimirListaFormateada());
					id = UtilLectura.leerDesdeTecalado();
					aerolinea = (Aerolinea) aeo.consultarPorId(id);

					avion = new Avion(compania, tipo, capacidad, placa, aerolinea);

					// crear un objeto para aceder a sus metodos

					if (av.disponibilidad(placa)) {

						try {
							mensaje = av.guardar(avion);
							System.out.println(mensaje);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					} else {
						System.err.println("Ese Avion ya se encuentra registrado");
					}

				} catch (NumberFormatException e) {
					System.err.println("Datos numericos incorectos");
				} catch (Exception e1) {
					System.err.println(e1.getMessage());
				}

				break;
			case 3:
				for (Avion avion1 : Memoria.aviones) {
					System.out.println(avion1);
				}

				System.out.print("¿Cual avion desea modificar? ingrese su placa: ");
				placa = UtilLectura.leerDesdeTecalado();
				try {
					if (!av.disponibilidad(placa)) {
						System.out.print("Compañia:  ");
						compania = UtilLectura.leerDesdeTecalado();
						System.out.print("Tipo:  ");
						tipo = UtilLectura.leerDesdeTecalado();
						System.out.print("Capacidad: ");
						capacidad = Integer.parseInt(UtilLectura.leerDesdeTecalado());
						System.out.println("Lista De Aerolineas " + aeo.imprimirListaFormateada());
						id = UtilLectura.leerDesdeTecalado();
						aerolinea = (Aerolinea) aeo.consultarPorId(id);
						avion = new Avion(compania, tipo, capacidad, placa, aerolinea);
						try {
							mensaje = av.modificar(avion);
							System.out.println(mensaje);
						} catch (Exception e) {
							System.out.println("Error al modificar"+e.getMessage());
						}
					} else {
						System.err.println("No se encontro registro");
					}
				} catch (NumberFormatException e) {
					System.err.println("Ingrese numeros en capacidad");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

				break;
			case 4:
				for (Avion avion1 : Memoria.aviones) {
					System.out.println(avion1);
				}
				System.out.print("¿Que avion desea eliminar? ingrese su placa : ");
				id = UtilLectura.leerDesdeTecalado();
				Avion avion1 = (Avion) av.consultarTodos(id);
				mensaje = av.eliminar(avion1);
				System.out.println(mensaje);

				break;
			case 5:
				FrmAdmin a = new FrmAdmin();
				break;
			case 6:

				System.exit(0);
				break;

			default:
				System.err.println("Solo numeros entre 1 y 6");
				break;
			}

		} while (opcion != 6);

	}
}
