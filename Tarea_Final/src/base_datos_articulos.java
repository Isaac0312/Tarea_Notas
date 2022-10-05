import java.util.*;
public class base_datos_articulos {
	Hashtable<String,Compra> articulos;
	public base_datos_articulos(){
		this.articulos = new Hashtable<String,Compra>();
	}
	
	public void añadir_producto(double precio, String nombre, Compra comp) {
		comp.setPrecio_total(precio);
		articulos.put(nombre,comp);
	}
	
	public Compra consultar_articulo(String nombre) {
		return articulos.get(nombre);
	}
	
	public void listar_base_datos(){
		Enumeration<String> keys=articulos.keys();
		System.out.println("Tamano base de datos: "+articulos.size());
		while(keys.hasMoreElements()) {
			String aux_nombre=keys.nextElement();
			System.out.println("Informacion de la key "+aux_nombre+""+consultar_articulo(aux_nombre));
		}
	}
}
