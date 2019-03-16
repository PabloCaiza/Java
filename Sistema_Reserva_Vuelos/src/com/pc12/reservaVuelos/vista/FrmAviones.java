package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.controlador.AvionTrs;
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
		Avion avion;
		String placa;
		int capacidad;
		String tipo;
		String compania;
		String mensaje;

		do {

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
			switch (opcion) {
			case 1:
				for (Avion avion1 : Memoria.aviones) {
					System.out.println(avion1);
				}

				break;
			case 2:
				// recuperacion de valores
				System.out.print("Compañia:  ");
				compania = UtilLectura.leerDesdeTecalado();
				System.out.print("Tipo:  ");
				tipo = UtilLectura.leerDesdeTecalado();
				System.out.print("Capacidad: ");
				capacidad = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				System.out.print("Placa: ");
				placa = UtilLectura.leerDesdeTecalado();

				// Dar valores
				
				avion= new Avion(compania,tipo,capacidad,placa);
			
				// crear un objeto para aceder a sus metodos
				if (av.disponibilidad(placa)) {
					mensaje = av.guardar(avion);
					// Procesar la informacion
					System.out.println(mensaje);
				} else {
					System.err.println("Ese Avion ya se encuentra registrado");
				}

				break;
			case 3:
				for (Avion avion1 : Memoria.aviones) {
					System.out.println(avion1);
				}
				
				System.out.print("¿Cual avion desea modificar? ingrese su placa: ");
				placa=UtilLectura.leerDesdeTecalado();
				System.out.print("Compañia:  ");
				compania = UtilLectura.leerDesdeTecalado();
				System.out.print("Tipo:  ");
				tipo = UtilLectura.leerDesdeTecalado();
				System.out.print("Capacidad: ");
				capacidad = Integer.parseInt(UtilLectura.leerDesdeTecalado());
				avion= new Avion(compania,tipo,capacidad,placa);
			
				mensaje=av.modificar(avion);
				System.out.println(mensaje);
				
				break;
			case 4:
				for (Avion avion1 : Memoria.aviones) {
					System.out.println(avion1);
				}
				System.out.print("¿Que avion desea eliminar? ingrese su placa : ");
				String id = UtilLectura.leerDesdeTecalado();
				mensaje = av.eliminar(id);
				System.out.println(mensaje);

				break;
			case 5:
				FrmLogin2 a = new FrmLogin2();
				break;
			case 6:

				System.exit(0);
				break;

			default:
				System.out.println("Solo numeros entre 1 y 6");
				break;
			}

		} while (opcion != 6);
	}
}
