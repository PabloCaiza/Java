package com.pc12.reservaVuelos.vista;

import java.util.Date;

import com.pc12.reservaVuelos.controlador.AvionTrs;
import com.pc12.reservaVuelos.controlador.VueloTrs;
import com.pc12.reservaVuelos.modelo.Avion;
import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.modelo.Vuelo;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmVuelo {

	public FrmVuelo() {
		crearMenu();
	}

	private void crearMenu() {
		int opcion = 0;
		VueloTrs vuelotrs = new VueloTrs();
		Vuelo vuelo;
		Object[] vue = null;
		String mensaje, partida, destino, id;
		double costo;

		do {

			try {
				System.out.println("\n\n*************************************");
				System.out.println("*         SISTEMA DE VUELOS         *");
				System.out.println("*************************************");
				System.out.println("1. Listar");
				System.out.println("2. Guardar");
				System.out.println("3. Actualizar");
				System.out.println("4. Eliminar");
				System.out.println("5. Regresar");
				System.out.println("6. Salir");
				System.out.print("... Seleccione una opción:");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			} catch (NumberFormatException e) {
				System.err.println("Solo Ingrese numero !!");
			}
			switch (opcion) {
			case 1:
				vue = vuelotrs.listar();
				for (Object op : vue) {
					System.out.println(op);
				}

				break;
			case 2:
				// recuperacion de valores
				System.out.print("Ingrese la partida del vuelo: ");
				partida = UtilLectura.leerDesdeTecalado();
				System.out.print("Ingrese el destino del vuelo: ");
				destino = UtilLectura.leerDesdeTecalado();
				System.out.print("Ingrese el costo del vuelo: ");
				costo = Double.parseDouble(UtilLectura.leerDesdeTecalado());
				System.out.print("Ingrese el ID de vuelo: ");
				id = UtilLectura.leerDesdeTecalado();
				// Dar valores
				vuelo = new Vuelo();
				vuelo.setCosto(costo);
				vuelo.setDestino(destino);
				vuelo.setPartida(partida);
				vuelo.setId(id);
				vuelo.setFecha(new Date());

				// crear un objeto para aceder a sus metodos

				if (vuelotrs.disponibilidad(id)) {
					mensaje = vuelotrs.guaradar(vuelo);
					// Procesar la informacion
					System.out.println(mensaje);
				} else {
					System.err.println("Ya se encuentra registrado");
				}

				break;
			case 3:

				for (Vuelo vuelo1 : Memoria.vuelos) {
					System.out.println(vuelo1);
				}

				System.out.print("¿Cual registro desea modificar?Ingrese su ID: ");
				id = UtilLectura.leerDesdeTecalado();
				if (!vuelotrs.disponibilidad(id)) {
					// recuperacion de valores
					System.out.print("Ingrese la partida del vuelo: ");
					partida = UtilLectura.leerDesdeTecalado();
					System.out.print("Ingrese el destino del vuelo: ");
					destino = UtilLectura.leerDesdeTecalado();
					System.out.print("Ingrese el costo del vuelo: ");
					costo = Double.parseDouble(UtilLectura.leerDesdeTecalado());
					vuelo = new Vuelo(costo, partida, destino, id, new Date());
					mensaje = vuelotrs.actualizar(id, vuelo);
					System.out.println(mensaje);
				} else {
					System.err.println("no existe");
				}

				break;
			case 4:
				for (Vuelo vuelo1 : Memoria.vuelos) {
					System.out.println(vuelo1);
				}
				System.out.print("Que dato de sea eliminar ingrese su id:  ");
				String id1 = UtilLectura.leerDesdeTecalado();
				mensaje = vuelotrs.eliminar(id1);
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
