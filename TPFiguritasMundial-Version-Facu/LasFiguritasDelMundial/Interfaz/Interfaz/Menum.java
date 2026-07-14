package Interfaz;

public enum Menum {

	INICIAR_ALBUM(1, "1. Iniciar album"), COMPRAR_SOBRE(2, "2. Comprar sobre"), INTERCAMBIAR_FIGURITAS(3, "3. Intercambiar figuritas"), VISUALIZAR_ALBUM(4, "4. Visualizar el album"), SALIR(0, "0. Salir"), OPCION_INVALIDA(-1, "Invalida");
	//LA posicion -1 espra indicar que el muchacho puso cualquier cosa

	private final int id;
	private String descripcion;

	Menum(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId(){
		return this.id;
	}
	public String toString() {
		return this.descripcion;
	}

}
