
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		///Aqui hemos realizado unos pedidos de compra estandar y los hemos puesto manualmente.
		Compra comp = new Compra(21,134,12,175);
		Compra comp2 = new Compra(4,10,1,150);
		Compra comp3 = new Compra(21,56,1,75);
		ArrayList<Compra> carrito = new ArrayList<Compra>();
		
		//Primero de todo vamos a declarar la clase y meter 3 elementos
		base_datos_articulos aux = new base_datos_articulos();
		
		aux.añadir_producto(1.3, "Juguete",comp);
		aux.añadir_producto(0.75, "Cuchara",comp2);
		aux.añadir_producto(5.6, "Vaso",comp3);

		
		
		///Apunte : Al mostrar la lista de toda la hashtable solo muestra la key de los objetos, si por ejemplo queremos que tambien muestre la informacion de dichos objetos
		
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
						
						System.out.println("Introduzca el iva del articulo (21 o 4)");
						double iva=lectura.nextDouble();
						
						
						System.out.println("Introduzca la cantidad total de articulos");
						int cantidad=lectura.nextInt();
						
						
						System.out.println("Introduzca la cantidad total pagada");
						double cantidad_pagada=lectura.nextDouble();
						
						Compra aux1= new Compra(iva,precio_art,cantidad,cantidad_pagada);
						aux.añadir_producto(precio_art, nombre_art,aux1);
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
