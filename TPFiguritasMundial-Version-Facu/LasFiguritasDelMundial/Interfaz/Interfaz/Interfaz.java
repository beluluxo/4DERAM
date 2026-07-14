package Interfaz;

import java.util.Scanner;
import Dominio.Album;
import Dominio.Figurita;
import Dominio.Sobre;

public class Interfaz {

	//Instancia un objeto de tipo Album de manera estática para gestionar la colección
	private static Album album2026 = new Album();
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		//Almacena en un array todas las opciones disponibles en el Menum
		Menum menuOpciones[] = Menum.values();
		//Declara la variable que VA AGUARDAR la opción del menú
		Menum opcionElegida = null;

		do {
			System.out.println("=====================================\n");
			System.out.println("SISTEMA FIGURITAS MUNDIAL DE FÚTBOL 2026\n");
			System.out.println("=====================================\n");

			//llama la función que muetsra el listado de opciones
			mostrarOpciones(menuOpciones);
			System.out.print("Ingrese el numero de la accion a realizar: ");

			//Asigna el resultado del procesamiento y validación de la entrada del usuario
			opcionElegida = elegirOpcion(menuOpciones, teclado);

			//Deriva la opción validada hacia el gestor de acciones del sistema
			ejecutarOpcion(opcionElegida);

		} while (opcionElegida != Menum.SALIR);

		//Libera el recurso del Scanner al finalizar el ciclo principal de la deshechosaplicación
		teclado.close();
	}

	private static void ejecutarOpcion(Menum opcionElegida) {
		switch (opcionElegida) {
			case INICIAR_ALBUM:
				System.out.println("\nINICIALIZAMOS EL ALBUM\n\n");
				//Llama al metodo
				album2026.inicializarAlbum();
				break;
			case COMPRAR_SOBRE:
				//Chequea si el array de figuritas pegadas sigue sin inicializar en memoria para verificar el estado del album
				if (album2026.getFiguritasPegadas() == null) {
					System.out.println("\nPRIMERO SE DEBE INICIALIZAR EL ALBUM\n\n");
				} else {
					System.out.println("\nSE COMPRA 1 SOBRE\n\n");
					//Ejecuta el metodo que genera las 5 figus random
					album2026.comprarSobre();
					Sobre nuevoSobre = album2026.getSobre(); //TRAE el objeto "Sobre" generado en de la instancia del álbum
					System.out.println(album2026.getSobre().toString());
					album2026.pegarFiguritas(nuevoSobre); //Le manda el sobre que se abrió para pasar a la inserción de las figuritas nuevas o repetidas
				}
				break;
			case INTERCAMBIAR_FIGURITAS:
				//Comprueba que exista una instancia válida del álbum antes de operar
				if (album2026.getFiguritasPegadas() == null) {
					System.out.println("\nPRIMERO SE DEBE INICIALIZAR EL ALBUM\n\n");
				//Valida que el contador del array de repetidas sea mayor a cero
				} else if (album2026.getCantidadRepetidas() != 0) {
					System.out.println("\nESTAS SON SUS FIGURITAS REPETIDAS:");
				//Itera sobre el array de figuritas repetidas basándose en su cantidad actual
					for (int i = 0; i < album2026.getCantidadRepetidas(); i++) {
						System.out.println((i + 1) + "- " + album2026.getFiguritasRepetidas()[i].getCodigo());
					}
					System.out.println("Indique que figurita desea intercambiar: ");
					int figuritaElegida = teclado.nextInt();
					//Extrae la figurita seleccionada del array restando una unidad al índice ingresado
					Figurita figuritaAIntercambiar = album2026.getFiguritasRepetidas()[figuritaElegida - 1];
					//Procesa el intercambio y devuelve una nueva instancia de tipo Figurita
					Figurita figuritaNueva = album2026.intercambiarFiguritas(figuritaAIntercambiar);
					System.out.println(figuritaAIntercambiar + "\n intercambiada por la \n" + figuritaNueva);
				} else {
					System.out.println("\nUSTED NO TIENE FIGURITAS REPETIDAS TODAVIA\n\n");
				}
				break;
			case VISUALIZAR_ALBUM:
				//Verifica la existencia del álbum antes de intentar recorrer los datos
				if (album2026.getFiguritasPegadas() == null) {
					System.out.println("\nPRIMERO SE DEBE INICIALIZAR EL ALBUM\n\n");
				} else {
					//Recorre el array ordenado imprimiendo los códigos de los elementos pegados
					for (int i = 0; i < album2026.getCantidadPegadas(); i++) {
						System.out.println((i + 1) + " - " + album2026.ordenarFiguritas()[i].getCodigo());
					}
					System.out.println("\nPorcentaje del album completado: " + album2026.calcularPorcentajeCompletado() + "%");
				}
				break;
			case SALIR:
				System.out.println("\nSaliendo...\n");
				break;
			default:
				System.out.println("\nOPCION INVALIDA\n\n");
		}
	}

	//Acá le digo que agarre la opción que coincida con el número ID ingresado
	private static Menum elegirOpcion(Menum[] menuOpciones, Scanner teclado) {
		//Lee la entrada como String para evitar que se rompa con letras
		String entrada = teclado.next();
		int opcionSeleccionada;

		try {
			//Acá conviete el texto a número entero
			opcionSeleccionada = Integer.parseInt(entrada);
		} catch (NumberFormatException e) {
			//Si no es un número (si ingresó 'r')
			return Menum.OPCION_INVALIDA;
		}

		//Si es un número, buscamos la opción que coincida con el ID
		for (Menum opcion : menuOpciones) {
			if (opcion.getId() == opcionSeleccionada) {
				return opcion;
			}
		}
		return Menum.OPCION_INVALIDA;
	}

	//Este tiene que mosyrar todas las opciones válidas (evitando imprimir la OPCION_INVALIDA)
	private static void mostrarOpciones(Menum[] menuOpciones) {
		for (Menum opcion : menuOpciones) {
			if (opcion != Menum.OPCION_INVALIDA) {
				System.out.println(opcion);
			}
		}
	}
}