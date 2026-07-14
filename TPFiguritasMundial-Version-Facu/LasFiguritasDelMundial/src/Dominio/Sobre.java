package Dominio;

import java.util.Arrays;

public class Sobre {

	private Figurita[] sobre = new Figurita[5];

	public Sobre() {
		generarFiguritas();
	}

	public void generarFiguritas() {

		for (int i = 0; i < sobre.length; i++) {

			int numeroSeleccion = (int) (Math.random() * Seleccion.values().length);
			Seleccion seleccion = Seleccion.values()[numeroSeleccion];

			int numeroJugador = (int) (Math.random() * 22) + 1;

			String nombreJugador = "Jugador " + numeroJugador;

			int valorMercado = (int)(Math.random() * 500) + 10;

			Posicion posicion;

			if (numeroJugador <= 2) {
			    posicion = Posicion.ARQUERO;
			} else if (numeroJugador <= 10) {
			    posicion = Posicion.DEFENSOR;
			} else if (numeroJugador <= 18) {
			    posicion = Posicion.MEDIOCAMPISTA;
			} else {
			    posicion = Posicion.DELANTERO;
			}

			sobre[i] = new Figurita(seleccion, nombreJugador, valorMercado, posicion, numeroJugador);
		}
	}

	public Figurita[] getSobre() {
		return sobre;
	}

	@Override
	public String toString() {
		String resultado = "Sobre:\n";

		for (int i = 0; i < sobre.length; i++) {
			if (sobre[i] != null) {
				resultado += sobre[i] + "\n";
			} else {
				resultado += "Espacio vacío\n";
			}
		}

		return resultado;

	}

}