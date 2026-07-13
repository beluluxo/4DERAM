package Interfaz;

import java.util.Scanner;

import Dominio.Figuritas;

public class Interfaz {

	public static void main(String[] args) {
		
	  Menum menuOpciones[] = Menum.values();
      Menum opcionElegida = null;
      Scanner teclado = new Scanner(System.in);
      
      do {
    	  
      Figuritas.generarTodasLasFiguritas();  
      
      System.out.println("=====================================\n");  
      System.out.println("SISTEMA FIGURITAS MUNDIAL DE FÚTBOL 2026\n");
      System.out.println("=====================================\n");  
      
      mostrarOpciones(menuOpciones);
      
      opcionElegida = elegirOpcion(menuOpciones, teclado);
      
      ejecutarOpcion(opcionElegida);
      
      } while (opcionElegida != Menum.SALIR);
       
     teclado.close();      
	}

	private static void ejecutarOpcion(Menum opcionElegida) {
		switch(opcionElegida){
		  case INICIAR_ALBUM:
		  break;
		  case COMPRAR_SOBRE:
		  break;
		  case INTERCAMBIAR_FIGURITAS:
		  break;
		  case VISUALIZAR_ALBUM:
		  break;
		  case SALIR:
		  break;
		 
		  }
	}

	private static Menum elegirOpcion(Menum[] menuOpciones, Scanner teclado) {
		Menum opcionElegida;
		System.out.println("\nSeleccione una opción: ");
		  int opcionSeleccionada = teclado.nextInt();
		  opcionElegida = menuOpciones[opcionSeleccionada];
		return opcionElegida;
	}

	private static void mostrarOpciones(Menum[] menuOpciones) {
		for (int i=0; i<menuOpciones.length; i++) {
		  System.out.println(menuOpciones[i]);	  
		  }
	}
	
   
}
