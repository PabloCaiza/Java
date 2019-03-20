package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.controlador.AerolineaTrs;
import com.pc12.reservaVuelos.controlador.AvionTrs;
import com.pc12.reservaVuelos.modelo.Aerolinea;
import com.pc12.reservaVuelos.modelo.Avion;
import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmReserva {

	public FrmReserva() {
		crearMenu();
	}

	private void crearMenu() {
		String id, op = null;
		int opcion = 0;
		int fila = 0, columna = 0;

		AvionTrs avionTrs = new AvionTrs();

		do {
			for (Avion av : Memoria.aviones) {
				System.out.println(av);
			}
			System.out.println("En que avion desear realizar la reserva Ingrese su Placa: ");
			System.out.println("5.Regresar");
			System.out.println("6.Salir");
			System.out.print("Eliga Una Opcion: ");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			switch (opcion) {
			case 1:

				mostrarAsiento(Memoria.asientos1);
				boolean bandera = false;
				System.out.println("Eliga su Asiento: ");
				System.out.print("Fila");
				fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				System.out.print("Columna");
				columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				if (disponibilidadAsiento(Memoria.asientos1, fila, columna)) {
					elegirAsiento(Memoria.asientos1, fila, columna);

					do {
						System.out.println("desea elegir otro asiendo Si o No");
						op = UtilLectura.leerDesdeTecalado();
						op = op.toUpperCase();

						if (op.equals("SI")) {
							mostrarAsiento(Memoria.asientos1);
							System.out.println("Eliga su Asiento: ");
							System.out.print("Fila");
							fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							System.out.print("Columna");
							columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							elegirAsiento(Memoria.asientos1, fila, columna);

						}
						if (op.equals("NO")) {
							System.out.println("gracias");
							bandera = true;
						}
					} while (bandera == false);
				} else {
					System.err.println("Ya esta Ocupado");
				}

				break;
			case 2:
				mostrarAsiento(Memoria.asientos2);
				boolean bandera1 = false;
				System.out.println("Eliga su Asiento: ");
				System.out.print("Fila");
				fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				System.out.print("Columna");
				columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				if (disponibilidadAsiento(Memoria.asientos2, fila, columna)) {
					elegirAsiento(Memoria.asientos2, fila, columna);

					do {
						System.out.println("desea elegir otro asiendo Si o No");
						op = UtilLectura.leerDesdeTecalado();
						op = op.toUpperCase();

						if (op.equals("SI")) {
							mostrarAsiento(Memoria.asientos1);
							System.out.println("Eliga su Asiento: ");
							System.out.print("Fila");
							fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							System.out.print("Columna");
							columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							elegirAsiento(Memoria.asientos2, fila, columna);

						}
						if (op.equals("NO")) {
							System.out.println("gracias");
							bandera1 = true;
						}
					} while (bandera1 == false);
				} else {
					System.err.println("Ya esta Ocupado");
				}
				break;
			case 3:
				mostrarAsiento(Memoria.asientos3);
				boolean bandera2 = false;
				System.out.println("Eliga su Asiento: ");
				System.out.print("Fila");
				fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				System.out.print("Columna");
				columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				if (disponibilidadAsiento(Memoria.asientos3, fila, columna)) {
					elegirAsiento(Memoria.asientos3, fila, columna);

					do {
						System.out.println("desea elegir otro asiendo Si o No");
						op = UtilLectura.leerDesdeTecalado();
						op = op.toUpperCase();

						if (op.equals("SI")) {
							mostrarAsiento(Memoria.asientos3);
							System.out.println("Eliga su Asiento: ");
							System.out.print("Fila");
							fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							System.out.print("Columna");
							columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							elegirAsiento(Memoria.asientos3, fila, columna);

						}
						if (op.equals("NO")) {
							System.out.println("gracias");
							bandera2 = true;
						}
					} while (bandera2 == false);
				} else {
					System.err.println("Ya esta Ocupado");
				}
				break;
			case 4:
				mostrarAsiento(Memoria.asientos4);
				boolean bandera3 = false;
				System.out.println("Eliga su Asiento: ");
				System.out.print("Fila");
				fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				System.out.print("Columna");
				columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				if (disponibilidadAsiento(Memoria.asientos4, fila, columna)) {
					elegirAsiento(Memoria.asientos4, fila, columna);

					do {
						System.out.println("desea elegir otro asiendo Si o No");
						op = UtilLectura.leerDesdeTecalado();
						op = op.toUpperCase();

						if (op.equals("SI")) {
							mostrarAsiento(Memoria.asientos4);
							System.out.println("Eliga su Asiento: ");
							System.out.print("Fila");
							fila = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							System.out.print("Columna");
							columna = Integer.parseInt(UtilLectura.leerDesdeTecalado());
							elegirAsiento(Memoria.asientos4, fila, columna);

						}
						if (op.equals("NO")) {
							System.out.println("gracias");
							bandera3 = true;
						}
					} while (bandera3 == false);
				} else {
					System.err.println("Ya esta Ocupado");
				}
				break;
			case 5:
				FrmPrincipal a = new FrmPrincipal();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.err.println("Solo numeros del 1 -4");
				break;

			}
		} while (opcion != 6);

	}

	public void mostrarAsiento(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" ||asiento" + "[" + i + "]" + "[" + j + "]" + " " + matriz[i][j]);

			}
			System.out.println(" ");
		}
	}

	public void elegirAsiento(String matriz[][], int fila, int columna) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == fila && j == columna) {
					matriz[i][j] = "ocupado";
				}

			}
		}
	}

	public boolean disponibilidadAsiento(String matriz[][], int fila, int columna) {
		boolean bandera = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[fila][columna].equals("ocupado")) {
					bandera = false;
					break;
				}
			}
		}
		return bandera;
	}
}
