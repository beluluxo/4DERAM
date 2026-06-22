package Dominio;

public enum Posicion {

Arquero ("Arquero"), Defensor ("Defensor"), Mediocampista ("Mediocampista"), Delantero ("Delantero");
	
private String posicion;	

private Posicion (String posicion) {
this.posicion=posicion;	
}

public String toString() {
return this.posicion;	
}

}
