package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.controlador.AerolineaTrs;
import com.pc12.reservaVuelos.controlador.AvionTrs;
import com.pc12.reservaVuelos.modelo.Aerolinea;
import com.pc12.reservaVuelos.modelo.Avion;
import com.pc12.reservaVuelos.modelo.Memoria;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmAerolinea {

	public FrmAerolinea() {
		crearMenu();
	}

	private void crearMenu() {
		int opcion = 0;
		AerolineaTrs aerolineaTrs = new AerolineaTrs();
		Aerolinea aerolinea;
		String nombre, mensaje, id;

		do {

			System.out.println("\n\n*************************************");
			System.out.println("*         SISTEMA DE AEROLINEAS      *");
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
				for (Aerolinea ae : Memoria.aerolineas) {
					System.out.println(ae);
				}

				break;
			case 2:
				System.out.print("Nombre: ");
				nombre = UtilLectura.leerDesdeTecalado();
				System.out.print("ID: ");
				id = UtilLectura.leerDesdeTecalado();
				aerolinea = new Aerolinea(nombre, id);
				if(aerolineaTrs.disponibilidad(id)) {
				mensaje = aerolineaTrs.guaradar(aerolinea);
				System.out.println(mensaje);
				}else {
					System.err.println("ya se encuentra registrado");
				}
				break;
			case 3:
				for (Aerolinea ae : Memoria.aerolineas) {
					System.out.println(ae);
				}
				System.out.print("¿Que aerolinea desea modificar? por su ID: ");
				id = UtilLectura.leerDesdeTecalado();
				System.out.print("Nombre: ");
				nombre = UtilLectura.leerDesdeTecalado();
				aerolinea=new Aerolinea(nombre,id);
				mensaje=aerolineaTrs.actualizar(id, aerolinea);
				System.out.println(mensaje);
				break;
			case 4:
				for (Aerolinea ae : Memoria.aerolineas) {
					System.out.println(ae);
				}
				System.out.print("¿Que aerolinea desea eliminar? por su ID: ");
				id = UtilLectura.leerDesdeTecalado();
				mensaje = aerolineaTrs.eliminar(id);
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
