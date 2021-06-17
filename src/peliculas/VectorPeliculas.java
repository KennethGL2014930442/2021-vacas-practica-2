package src.peliculas;

import src.tienda.*;

public class VectorPeliculas{
	private Peliculas[] peliculas = new Peliculas[50];
	private int siguienteCodigo;
	
	public VectorPeliculas(){
		siguienteCodigo = 1;
	}
	
	//agregar peliculas
	
	public void agregarPeliculas(String nombres, String categoria, int anio){
		if (siguienteCodigo > 50){
			System.out.println("Limite de clientes alcanzado");
		}else{
			peliculas[(siguienteCodigo-1)] = new Peliculas(siguienteCodigo, nombres, categoria, anio);
		}
		siguienteCodigo++;
	}
	
	public void agregarPeliculas(){
		String nombres = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
		String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula: ");
		int anio = IngresoDatos.getEntero("Ingrese el anio de estreno de la pelicula: ", false);
		agregarPeliculas(nombres, categoria, anio);
	}
	
	//fin agregar
	
	public void mostrarPeliculas(){
		System.out.println("\nPeliculas de Memorabilia\n");
		for (int i = 0; i < (siguienteCodigo-1); i++){
			System.out.println("-"+i+") "+peliculas[i].getInformacion());	
		}
	}
	
	//ordenamiento
	public void ordenarNombre(boolean ascendente){
		boolean ordenar = true;
		
		for(int i = 1; i < (siguienteCodigo-1); i++){
			for(int j = 0; j < (siguienteCodigo-1-i); j++){
				if(ascendente){
					ordenar = (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0);
				}else{
					ordenar = (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0);
				}
				
				if(ordenar){
					Peliculas aux = peliculas[j];
					peliculas[j] = peliculas[j+1];
					peliculas[j+1]=aux;
				}
			}
		}
	}
	
}