package com.pc12.reservaVuelos.util;

import java.util.Scanner;
/*
 * Clase que representa las operaciones utilarias de lectura
 */
public class UtilLectura {

	
	public static  String leerDesdeTecalado() {
		//creamos un lector para que leea desde tecaldo
		String valorLeer=null;
		Scanner leer = new Scanner(System.in);
		valorLeer=leer.next();
		//retornamos lo que va a leer
		return valorLeer;
		
		
	}
	
}
