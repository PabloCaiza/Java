package com.pc12.reservaVuelos.modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class Memoria {

	public static ArrayList<Pasajero> pasajeros;
	public static ArrayList<Avion> aviones;
	public static Aerolinea[] aerolineas;
	public static Vuelo[] vuelos;
	public static int contador = 0;
	public static String asientos1[][];
	public static String asientos2[][];
	public static String asientos3[][];
	public static String asientos4[][];

	static {

		pasajeros = new ArrayList<Pasajero>();
		aviones = new ArrayList<Avion>();
		vuelos = new Vuelo[5];
		aerolineas = new Aerolinea[5];
		asientos1 = new String[4][4];
		asientos2 = new String[4][4];
		asientos3 = new String[4][4];
		asientos4 = new String[4][4];
		inicializar(asientos1);
		inicializar(asientos2);
		inicializar(asientos3);
		inicializar(asientos4);

	}

	public static void inicializar(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = "disponible";
			}
		}
	}

}
