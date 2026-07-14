package Dominio;

public enum Seleccion {
    ARGENTINA("ARG"), BRASIL("BRA"), FRANCIA("FRA"), ESPANIA("ESP"),

    ALEMANIA("ALE"), INGLATERRA("ING"), PORTUGAL("POR"), PAISES_BAJOS("PBA"),

    BELGICA("BEL"), CROACIA("CRO"), SUIZA("SUI"), DINAMARCA("DIN"),

    SERBIA("SER"), POLONIA("POL"), UCRANIA("UCR"), NORUEGA("NOR"),

    ESTADOS_UNIDOS("USA"), MEXICO("MEX"), CANADA("CAN"), COSTA_RICA("CRC"),

    PANAMA("PAN"), JAMAICA("JAM"), HONDURAS("HON"), EL_SALVADOR("ELS"),

    URUGUAY("URU"), COLOMBIA("COL"), ECUADOR("ECU"), PARAGUAY("PAR"),

    PERU("PER"), CHILE("CHI"), VENEZUELA("VEN"), BOLIVIA("BOL"),

    MARRUECOS("MAR"), SENEGAL("SEN"), EGIPTO("EGI"), NIGERIA("NIG"),

    GHANA("GHA"), COSTA_DE_MARFIL("CDM"), CAMERUN("CAM"), SUDAFRICA("SUD"),

    JAPON("JAP"), COREA_DEL_SUR("CDS"), AUSTRALIA("AUS"), IRAN("IRA"),

    ARABIA_SAUDITA("ASA"), QATAR("QAT"), IRAK("IRQ"), UZBEKISTAN("UZB");

    //Atributo
    private String descripcion;

    //Constructor
    private Seleccion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //El metodo
    public String toString() {
        return this.descripcion;
    }
    
}