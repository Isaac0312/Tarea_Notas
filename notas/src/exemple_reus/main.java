package exemple_reus;
import java.util.ArrayList;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> contenedor = new Hashtable<String,Double>();
		ArrayList<Double> notas = new ArrayList<Double>();
		ArrayList<Double> notas_teresa = new ArrayList<Double>();
		ArrayList<Double> notas_ernest = new ArrayList<Double>();
		
		do{
			
		//Vamos a pedir por pantalla los datos
		Scanner lectura = new Scanner (System.in);
		System.out.println("Porfavor, introduzca el nombre del alumno");
		String nombre = lectura.next();
		System.out.println("Ahora, introduzca sus notas");
		
		Double nota = lectura.nextDouble();
		notas.add(nota);
		
		nota = lectura.nextDouble();
		notas.add(nota);
		
		nota = lectura.nextDouble();
		notas.add(nota);
		
		//Ahora lo que vamos a hacer es calcular la media de su nota
		Double nota_media=calcular_nota(notas);
		
		//Ahora guardamos en la hashtable
		contenedor.put(nombre,nota_media);
		
		System.out.println("Si desea salir, pulse 1, si no introduzca cualquier caracter");
		if((lectura.hasNextInt())&&(lectura.nextInt())==1) {
			lectura.close();
			return;
		}
	}while(true);
}
	
	
	
	public static Double calcular_nota(ArrayList<Double> aux) {
		Double nota_final=0.0,contador=0.0;
		for(Double nota:aux) {
			nota_final=nota_final+nota;
			contador++;
		}
		
		nota_final=nota_final/contador;
		System.out.println("Nota final de "+aux+" es :"+nota_final);
		return nota_final;
	}

}
