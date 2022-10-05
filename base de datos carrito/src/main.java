import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Primero de todo vamos a declarar la clase y meter 10 elementos
		base_datos_articulos aux = new base_datos_articulos();
		
		aux.añadir_producto(1.3, "Juguete");
		aux.añadir_producto(0.75, "Cuchara");
		aux.añadir_producto(5.6, "Vaso");
		aux.añadir_producto(13433.3333, "Coche");
		aux.añadir_producto(148888.94, "Piso");
		aux.añadir_producto(3.555, "Estuche");
		aux.añadir_producto(10.7, "Peluche");
		aux.añadir_producto(5.9, "Cojin");
		aux.añadir_producto(4.4, "Plato");
		aux.añadir_producto(1.8, "Tenedor");
		
		//Una vez hemos metido 10 elementos, podemos pedir al usuario que introduzca un nuevo elemento, consulte algun elemento o liste informacion de la lista
		
		while(true) {
		
			Scanner lectura = new Scanner(System.in);
			System.out.println("Indique que accion quiere realizar");
			System.out.println("1. Introducir elemento");
			System.out.println("2. Consultar precio elemento");
			System.out.println("3. Informacion base de datos");
			System.out.println("4. Salir");
			
			if(lectura.hasNextInt()) {
			switch(lectura.nextInt()) {
					case 1:
						System.out.println("Introduzca el nombre del articulo");
						String nombre_art= lectura.next();
						System.out.println("Introduzca el precio del articulo, separado por coma");
						Double precio_art=lectura.nextDouble();
						aux.añadir_producto(precio_art, nombre_art);
						break;
						
					case 2:
						System.out.println("Introduzca el nombre del articulo el cual quieres consultar el precio");
						nombre_art="";
						nombre_art=lectura.next();
						System.out.println(""+aux.consultar_articulo(nombre_art));
						break;
						
					case 3:
						aux.listar_base_datos();
						break;
						
					case 4:
						return;
			}
			}
		}
	}

}
