package Dominio;

public class Figuritas {
private String codigo;	
private String nombreJugador;
private int numeroJugador;
private double valorMercado;
private Seleccion seleccion;
private Posicion posicion;


 public Figuritas (Seleccion seleccion, String nombreJugador, double valorMercado, Posicion posicion, int numeroJugador) {
        this.seleccion = seleccion;
        this.nombreJugador = nombreJugador;
        this.valorMercado = valorMercado;
        this.posicion = posicion;
        this.numeroJugador = numeroJugador;
        this.codigo = seleccion.toString() + numeroJugador;
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


public Posicion getPosicion() {
	return posicion;
}


public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
} 
}


