package Dominio;

public class Sobre {
	
	    private Figuritas[] sobre = new Figuritas[5];

	    public Sobre() {
	    }
	    
	    
	    public void generarFiguritas() {
	    	
	        for (int i = 0; i < sobre.length; i++) {
	            int indiceRandom = (int) (Math.random() * Figuritas.getTodasLasFiguritas().length);
	            sobre[i] = Figuritas.getTodasLasFiguritas()[indiceRandom];
	        }
	    }
	   

	    public Figuritas[] getSobre() {
	        return sobre;
	    }
	    
	    
	}	   
	