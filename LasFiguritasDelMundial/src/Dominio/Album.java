package Dominio;

public class Album {
	//A
	private final static Figuritas CANTIDAD_DE_FIGURITAS[] = new Figuritas[1056];
	private Figuritas[] figuritasPegadas;
	private Figuritas figuritasRepetidas;
	private int cantidadPegadas;
	private int cantidadRepetidas;
	 
	
	//C
	public Album () {		
	}
	
	//M
	public void inicializarAlbum() { //Debe preparar la estructura de datos que alojará las	figuritas.
	}
	
	public void comprarSobre() { //TIENE QUE SER SOBRE //Simula la compra devolviendo un objeto Sobre con 5 figuritas generadas de forma aleatoria
	return ;	
	}
	
	public void pegarFiguritas(Sobre sobre) { //Recibe un sobre e intenta pegar cada una de sus figuritas en el álbum. Si la figurita ya se encontraba pegada
		                                     //previamente, deberá ser almacenada en el arreglo de figuritasRepetidas.
		
	}
	
	public boolean elAlbumEstaCompleto() {
	return false;	
	}
	
	public double calcularPorcentajeCompletado() {
	return 0.0;	
	}
	
	public int obtenerCantidadRepetidas() {
	return -1;	
	}

	public Figuritas[] getFiguritasPegadas() {
		return figuritasPegadas;
	}

	public void setFiguritasPegadas(Figuritas[] figuritasPegadas) {
		this.figuritasPegadas = figuritasPegadas;
	}

	public Figuritas getFiguritasRepetidas() {
		return figuritasRepetidas;
	}

	public void setFiguritasRepetidas(Figuritas figuritasRepetidas) {
		this.figuritasRepetidas = figuritasRepetidas;
	}

	public int getCantidadPegadas() {
		return cantidadPegadas;
	}

	public void setCantidadPegadas(int cantidadPegadas) {
		this.cantidadPegadas = cantidadPegadas;
	}

	public int getCantidadRepetidas() {
		return cantidadRepetidas;
	}

	public void setCantidadRepetidas(int cantidadRepetidas) {
		this.cantidadRepetidas = cantidadRepetidas;
	}

	public static Figuritas[] getCantidadDeFiguritas() {
		return CANTIDAD_DE_FIGURITAS;
	}
    
	
		
    }
