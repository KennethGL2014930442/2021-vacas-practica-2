package src.peliculas;

public class Peliculas{
	private int id;
	private String nombres;
	private String categoria;
	private int anio;
	
	public Peliculas(int id, String nombres, String categoria, int anio){
		this.id = id;
        this.nombres = nombres;
        this.categoria = categoria;
		this.anio = anio;
	}
	
	public Peliculas(int id, String nombre, String categoria){
        this(id, nombre, categoria, 0);
    }
	
	//getters y setters
	public int getId(){
		return id;
	}
	
	public int getAnio(){
		return anio;
	}
	
	public String getNombre(){
		return nombres;
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public void setNombres(String nombres){
		this.nombres = nombres;
	}
	
	public void setAnio(int anio){
		this.anio = anio;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	//fin
	
	public String getInformacion(){
		String resultado = "Id: "+id+"Nombre de la pelicula: " +nombres+"----- Categoria: "+categoria;
        return resultado;
	}
	
}