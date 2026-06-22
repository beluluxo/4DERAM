package Dominio;

public enum Seleccion {
	ARGENTINA("ARG", Grupos.GRUPO_C), BRASIL("BRA", Grupos.GRUPO_C), FRANCIA("FRA", Grupos.GRUPO_D),
	ESPANIA("ESP", Grupos.GRUPO_D),

	ALEMANIA("ALE", Grupos.GRUPO_E), INGLATERRA("ING", Grupos.GRUPO_E), PORTUGAL("POR", Grupos.GRUPO_F),
	PAISES_BAJOS("PBA", Grupos.GRUPO_F),

	BELGICA("BEL", Grupos.GRUPO_G), CROACIA("CRO", Grupos.GRUPO_G), SUIZA("SUI", Grupos.GRUPO_H),
	DINAMARCA("DIN", Grupos.GRUPO_H),

	SERBIA("SER", Grupos.GRUPO_I), POLONIA("POL", Grupos.GRUPO_I), UCRANIA("UCR", Grupos.GRUPO_J),
	NORUEGA("NOR", Grupos.GRUPO_J),

	ESTADOS_UNIDOS("USA", Grupos.GRUPO_K), MEXICO("MEX", Grupos.GRUPO_K), CANADA("CAN", Grupos.GRUPO_L),
	COSTA_RICA("CRC", Grupos.GRUPO_L),

	PANAMA("PAN", Grupos.GRUPO_A), JAMAICA("JAM", Grupos.GRUPO_A), HONDURAS("HON", Grupos.GRUPO_B),
	EL_SALVADOR("ELS", Grupos.GRUPO_B),

	URUGUAY("URU", Grupos.GRUPO_C), COLOMBIA("COL", Grupos.GRUPO_C), ECUADOR("ECU", Grupos.GRUPO_D),
	PARAGUAY("PAR", Grupos.GRUPO_D),

	PERU("PER", Grupos.GRUPO_E), CHILE("CHI", Grupos.GRUPO_E), VENEZUELA("VEN", Grupos.GRUPO_F),
	BOLIVIA("BOL", Grupos.GRUPO_F),

	MARRUECOS("MAR", Grupos.GRUPO_G), SENEGAL("SEN", Grupos.GRUPO_G) , EGIPTO("EGI", Grupos.GRUPO_H),
	NIGERIA("NIG", Grupos.GRUPO_H),

	GHANA("GHA", Grupos.GRUPO_I), COSTA_DE_MARFIL("CDM", Grupos.GRUPO_I), CAMERUN("CAM", Grupos.GRUPO_J),
	SUDAFRICA("SUD", Grupos.GRUPO_J),

	JAPON("JAP", Grupos.GRUPO_K), COREA_DEL_SUR("CDS", Grupos.GRUPO_K), AUSTRALIA("AUS", Grupos.GRUPO_L),
	IRAN("IRA", Grupos.GRUPO_L),

	ARABIA_SAUDITA("ASA", Grupos.GRUPO_A), QATAR("QAT", Grupos.GRUPO_A), IRAK("IRQ", Grupos.GRUPO_B),
	UZBEKISTAN("UZB", Grupos.GRUPO_B);

	// Atributo
	private String codigo;
	private Grupos grupo;

	// Constructor
	private Seleccion(String codigo, Grupos grupo) {
		this.codigo = codigo;
		this.grupo = grupo;
	}

	// Metodo
	public String toString() {
		return this.codigo;
	}

	public Grupos getGrupo() {
		return grupo;
	}

}