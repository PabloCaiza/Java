package com.pc12.reservaVuelos.vista;

import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmAdmin {
	public FrmAdmin() {
		crearMenu();
	}

	private void crearMenu() {
		int opcion = 0;
		do {

			System.out.println("****************************");
			System.out.println("*ADMINISTRACION DEL SISTEMA*");
			System.out.println("****************************");
			System.out.println("                            ");
			System.out.println("1.Administracion de vuelos");
			System.out.println("2.Administracion de aviones");
			System.out.println("3.Administracion de Aerolineas");
			System.out.println("4.Regresar");
			System.out.println("5.Salir");
			System.out.println("...Selecione una opcion");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTecalado());
			switch (opcion) {
			case 1:
				FrmVuelo b = new FrmVuelo();

				break;
			case 2:
				FrmAviones c = new FrmAviones();
				break;
			case 3:
				FrmAerolinea d=new FrmAerolinea();
				break;
			case 4:
				FrmLogin2 a = new FrmLogin2();
				break;
			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Solo numeros entre 1-4");
				break;
			}
		} while (opcion != 4);

	}
}
