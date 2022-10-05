import java.util.*;
public class base_datos_articulos {
	Hashtable<String,Double> articulos;
	public base_datos_articulos(){
		this.articulos = new Hashtable<String,Double>();
	}
	
	public void añadir_producto(double precio, String nombre) {
		articulos.put(nombre, precio);
	}
	
	public double consultar_articulo(String nombre) {
		return articulos.get(nombre);
	}
	
	public void listar_base_datos(){
		Enumeration<String> keys=articulos.keys();
		System.out.println("Tamano base de datos: "+articulos.size());
		while(keys.hasMoreElements()) {
			System.out.println(""+" hashtable key " + keys.nextElement());
		}
	}
}
