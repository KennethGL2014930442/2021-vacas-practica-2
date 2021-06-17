package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPeliculas;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
	private VectorPeliculas tablaPeliculas = new VectorPeliculas();
	
    public Principal(){

        int menu = 0;

        while(menu != 9){
            System.out.println("\nBienvenido a memorabilia \n");
            System.out.println("1) Ingreso de peliculas");
            System.out.println("2) Mostrar peliculas");
            System.out.println("3) Ordenar peliculas Ascendente");
            System.out.println("4) Ordenar peliculas Descendente");
			System.out.println("5) Ingreso de clientes");
            System.out.println("6) Mostrar clientes");
            System.out.println("7) Ordenar clientes Ascente");
            System.out.println("8) Ordenar clientes Descendente");
            System.out.println("9) Salir");
            menu = IngresoDatos.getEntero("Ingrese la opción: ", true);

			if (menu == 1 ){
                //ingreso de datos
                tablaPeliculas.agregarPeliculas();
            }
            if (menu == 2){
                //mostrar clientes
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaPeliculas.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                tablaPeliculas.ordenarNombre(true);
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaPeliculas.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                tablaPeliculas.ordenarNombre(false);
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 5 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 6){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 7){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 8){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
			

        }

    }

    
}
