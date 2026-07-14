package Dominio;

public enum Posicion {

ARQUERO ("Arquero"), DEFENSOR ("Defensor"), MEDIOCAMPISTA ("Mediocampista"), DELANTERO ("Delantero");
	
private String posicion;	

private Posicion (String posicion) {
this.posicion=posicion;	
}

public String toString() {
    return this.posicion;
    }
}
