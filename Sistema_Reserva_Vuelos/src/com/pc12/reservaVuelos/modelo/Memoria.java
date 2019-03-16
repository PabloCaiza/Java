package com.pc12.reservaVuelos.modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class Memoria {

	public static ArrayList<Pasajero> pasajeros;
	public static ArrayList<Avion> aviones;
	public static Aerolinea[] aerolineas;
	public static Vuelo []vuelos;
	public static int contador=0;

	static {

		pasajeros = new ArrayList<Pasajero>();
		aviones= new ArrayList<Avion>();
		vuelos= new Vuelo[5];
		aerolineas= new Aerolinea[5];
	}

}
