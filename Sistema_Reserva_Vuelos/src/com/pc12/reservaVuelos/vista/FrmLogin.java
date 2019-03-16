package com.pc12.reservaVuelos.vista;

import java.util.Scanner;

import com.pc12.reservaVuelos.controlador.PasajeroTrs;
import com.pc12.reservaVuelos.modelo.Pasajero;
import com.pc12.reservaVuelos.util.UtilLectura;

public class FrmLogin {

	public static void main(String[] args) {

		String email;
		String clave;
		String opcion="";
		Scanner leer= new Scanner(System.in);
		boolean bandera = false;
		do {
		System.out.println("***********************************************");
		System.out.println("* Bienvenidos al Sistema de Reserva de Vuelos *");
		System.out.println("***********************************************");
		System.out.println("                                               ");
		System.out.println("Desea Registrase Si o No(Si ya lo esta)");
	     opcion =leer.next();
		opcion = opcion.toUpperCase();
		
		}while(!opcion.equals("SI")&& !opcion.equals("NO"));
		
		if (opcion.equals("SI")) {
			FrmRegistro frmRegistro = new FrmRegistro();
			bandera = true;

		}
		if (bandera == true || opcion.equals("NO")) {
        
			System.out.println("                                               ");
			System.out.println("***********************************************");
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
				Pasajero pasajero = pas.validarPasajero(email, clave);

				if (pasajero != null) {
					

					FrmPrincipal frmPrincipal = new FrmPrincipal(pasajero);

				} else {

					System.err.println("No Existe");
					
				}

			}

		}
	}
}