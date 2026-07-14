package Dominio;

public class Album {

	// A
	private final static int TOTAL_DE_FIGURITAS_DEL_ALBUM = 1056;
	private Figurita[] figuritasPegadas;
	private Figurita[] figuritasRepetidas;
	private int cantidadPegadas;
	private int cantidadRepetidas;
	private Sobre sobre;

	// C
	public Album() {

	}

	// M
	public void inicializarAlbum() { // Debe preparar la estructura de datos que alojará las figuritas.
		figuritasPegadas = new Figurita[TOTAL_DE_FIGURITAS_DEL_ALBUM];
		figuritasRepetidas = new Figurita[TOTAL_DE_FIGURITAS_DEL_ALBUM * 2];
		this.cantidadPegadas = 0;
		this.cantidadRepetidas = 0;
	}

	public void comprarSobre() { // TIENE QUE SER SOBRE //Simula la compra devolviendo un objeto Sobre con 5
		sobre = new Sobre();// figuritas generadas de forma aleatoria

		return;
	}

	public void pegarFiguritas(Sobre sobre) { // Recibe un sobre e intenta pegar cada una de sus figuritas en el álbum.
												// Si la figurita ya se encontraba pegada
												// previamente, deberá ser almacenada en el arreglo de

		boolean existeFigurita = false;

		Figurita[] figuritasSobre = sobre.getSobre();

		for (int i = 0; i < figuritasSobre.length; i++) {

			for (int j = 0; j < cantidadPegadas; j++) {
				if (figuritasPegadas[j] != null) {
					if (figuritasSobre[i].getCodigo().compareTo(figuritasPegadas[j].getCodigo()) == 0) {
						existeFigurita = true;
					}
				}
			}

			if (existeFigurita) {
				figuritasRepetidas[cantidadRepetidas] = figuritasSobre[i];
				cantidadRepetidas++;
			} else {
				figuritasPegadas[cantidadPegadas] = figuritasSobre[i];
				cantidadPegadas++;
			}

			existeFigurita = false;

		}
	}

	public Figurita crearFigurita() {
		Figurita nuevaFigurita;

		int numeroSeleccion = (int) (Math.random() * Seleccion.values().length);
		Seleccion seleccion = Seleccion.values()[numeroSeleccion];

		int numeroJugador = (int) (Math.random() * 22) + 1;

		String nombreJugador = "Jugador " + numeroJugador;

		int valorMercado = (int) (Math.random() * 500) + 10;

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

		nuevaFigurita = new Figurita(seleccion, nombreJugador, valorMercado, posicion, numeroJugador);

		return nuevaFigurita;
	}

	public Figurita intercambiarFiguritas(Figurita figuritaIntercambiable) {

		Figurita nuevaFigurita;
		boolean yaEstabaPegada;

		// Generar una figurita que no esté pegada
		do {
			nuevaFigurita = crearFigurita();

			yaEstabaPegada = false;

			for (int i = 0; i < cantidadPegadas; i++) {
				if (figuritasPegadas[i].getCodigo().equals(nuevaFigurita.getCodigo())) {
					yaEstabaPegada = true;
				}
			}

		} while (yaEstabaPegada);

		//Agregar la nueva figurita al álbum
		figuritasPegadas[cantidadPegadas] = nuevaFigurita;
		cantidadPegadas++;

		//Busca en el array de figuritas repetidas la figurita que se desea intercambiar
		for (int i = 0; i < cantidadRepetidas; i++) {

			if (figuritasRepetidas[i].getCodigo().equals(figuritaIntercambiable.getCodigo())) {

				//Desplaza una posición hacia la izquierda todas las figuritas que están después de la figurita encontrada para eliminarla del arreglo sin dejar espacios vacíos.
				for (int j = i; j < cantidadRepetidas - 1; j++) {
					figuritasRepetidas[j] = figuritasRepetidas[j + 1];
				}

				//La última posición queda duplicada luego del desplazamiento, por eso se la establece en null y se disminuye la cantidad de figuritas repetidas almacenadas.
				figuritasRepetidas[cantidadRepetidas - 1] = null;
				cantidadRepetidas--;
			}
		}

		return nuevaFigurita;
	}

	public Figurita[] ordenarFiguritas() {

		Figurita[] figuritasPegadasOrdenadas = new Figurita[figuritasPegadas.length];

		for (int i = 0; i < figuritasPegadas.length; i++) {
			figuritasPegadasOrdenadas[i] = figuritasPegadas[i];
		}

		for (int i = 1; i < figuritasPegadasOrdenadas.length; i++) {
			for (int j = 0; j < figuritasPegadasOrdenadas.length - 1; j++) {
				if (figuritasPegadasOrdenadas[j] != null && figuritasPegadasOrdenadas[j + 1] != null) {
					if (figuritasPegadasOrdenadas[j].getCodigo()
							.compareTo(figuritasPegadasOrdenadas[j + 1].getCodigo()) > 0) {
						Figurita auxiliar = figuritasPegadasOrdenadas[j];
						figuritasPegadasOrdenadas[j] = figuritasPegadasOrdenadas[j + 1];
						figuritasPegadasOrdenadas[j + 1] = auxiliar;
					}
				}
			}

		}

		return figuritasPegadasOrdenadas;

	}

	public boolean elAlbumEstaCompleto() {

		if (cantidadPegadas == TOTAL_DE_FIGURITAS_DEL_ALBUM) {
			return true;
		}

		return false;
	}

	public double calcularPorcentajeCompletado() {
		double porcentajeCompletado;

		porcentajeCompletado = (100 * cantidadPegadas) / TOTAL_DE_FIGURITAS_DEL_ALBUM;

		return porcentajeCompletado;
	}

	public int obtenerCantidadRepetidas() {

		return this.cantidadRepetidas;
	}

	public Figurita[] getFiguritasPegadas() {
		return this.figuritasPegadas;
	}

	public Figurita[] getFiguritasRepetidas() {
		return figuritasRepetidas;
	}

	public void setFiguritasRepetidas(Figurita[] figuritasRepetidas) {
		this.figuritasRepetidas = figuritasRepetidas;
	}

	public Sobre getSobre() {
		return sobre;
	}

	public void setSobre(Sobre sobre) {
		this.sobre = sobre;
	}

	public void setFiguritasPegadas(Figurita[] figuritasPegadas) {
		this.figuritasPegadas = figuritasPegadas;
	}

	public int getCantidadPegadas() {
		return this.cantidadPegadas;
	}

	public void setCantidadPegadas(int cantidadPegadas) {
		this.cantidadPegadas = cantidadPegadas;
	}

	public int getCantidadRepetidas() {
		return this.cantidadRepetidas;
	}

	public void setCantidadRepetidas(int cantidadRepetidas) {
		this.cantidadRepetidas = cantidadRepetidas;
	}

}
