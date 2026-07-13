package Interfaz;

public enum Menum {
	
	INICIAR_ALBUM("1. Iniciar album"), COMPRAR_SOBRE("2. Comprar sobre"), INTERCAMBIAR_FIGURITAS("3. Intercambiar figuritas"),
	VISUALIZAR_ALBUM("4. Visualizar el album"), SALIR("5. Salir");

	private String descripcion;

	Menum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String toString() {
		return this.descripcion;
	}

}
