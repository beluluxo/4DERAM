package Dominio;

public enum Grupos {
GRUPO_A ("A"), GRUPO_B ("B"), GRUPO_C ("C"), GRUPO_D ("D"), GRUPO_E ("E"), GRUPO_F ("F"), GRUPO_G ("G"), GRUPO_H ("H"), GRUPO_I ("I"), GRUPO_J ("J"), GRUPO_K ("K"), GRUPO_L ("L");
	

private String grupoNombre;	

private Grupos (String grupo) {
this.grupoNombre = grupo;
}
	
public String toString () {
return this.grupoNombre;	
}
}
