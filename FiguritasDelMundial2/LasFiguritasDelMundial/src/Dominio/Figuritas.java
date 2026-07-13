package Dominio;

public class Figuritas {

	private static Figuritas[] todasLasFiguritas = new Figuritas[1056];
	private static final int POSICION_MINIMA = 1;
	private static final int POSICION_MAX = 22;

	private String codigo;
	private String nombreJugador;
	private int numeroJugador;
	private double valorMercado;
	private Seleccion seleccion;
	private Posicion posicion;

	public Figuritas(Seleccion seleccion, String nombreJugador, double valorMercado, Posicion posicion,
			int numeroJugador) {

		this.seleccion = seleccion;
		this.nombreJugador = nombreJugador;
		this.valorMercado = valorMercado;
		this.posicion = posicion;
		this.numeroJugador = numeroJugador;
		this.codigo = seleccion.toString() + numeroJugador; // asi lo pidieron el el pdf que se genere codigo
	}

	public static void generarTodasLasFiguritas() {
		Seleccion[] selecciones = Seleccion.values();
		int indice = 0;

		for (int i = 0; i < selecciones.length; i++) {
			for (int j = 0; j < POSICION_MAX; j++) {
				int numero = j + POSICION_MINIMA;
				Posicion posicionAsignada;

				if (numero <= 3) {
					posicionAsignada = Posicion.Arquero;
				} else if (numero <= 11) {
					posicionAsignada = Posicion.Defensor;
				} else if (numero <= 19) {
					posicionAsignada = Posicion.Mediocampista;
				} else {
					posicionAsignada = Posicion.Delantero;
				}

				double valorMercadoAsignado = 100000 + (numero * 50000);

				Figuritas figurita = new Figuritas(selecciones[i], "Jugador", valorMercadoAsignado,
						posicionAsignada, numero);

				todasLasFiguritas[indice] = figurita;
				indice++;
			}
		}
	}

	public static void setTodasLasFiguritas(Figuritas[] todasLasFiguritas) {
		Figuritas.todasLasFiguritas = todasLasFiguritas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getNumeroJugador() {
		return numeroJugador;
	}

	public void setNumeroJugador(int numeroJugador) {
		this.numeroJugador = numeroJugador;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public Seleccion getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(Seleccion seleccion) {
		this.seleccion = seleccion;
	}

	public static Figuritas[] getTodasLasFiguritas() {
		return todasLasFiguritas;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}
