package ejerciciosstring;
/*Usuario introduce un caracter, se mira si el caracter
 * está dentro de la cadena de caracteres, en caso de que
 * esté se pone en mayúsculas */
import java.util.Scanner;

public class vocalMayuscula {
	static Scanner sc=new Scanner (System.in);
	static String caracter;
	public static void ponermayus(String palabra) {
		System.out.println("Introduce el caracter a buscar");
		caracter=sc.next();
		//Se comprueba que el caracter está dentro de la cadena
		int posicion=palabra.indexOf(caracter);
		if(posicion!=-1) {
			//Si es así se pasa el caracter a mayúsculas
			System.out.println("El caracter introducido está en la cadena de caracteres");
			String palabraTotal=palabra.replace(caracter, caracter.toUpperCase());
			System.out.println(palabraTotal);
		}else {
			System.out.println("El caracter introducido no está en la cadena de caracteres");
		}
		
	}

	public static void main(String[] args) {
		String palabra="hola mundo";
		vocalMayuscula.ponermayus(palabra);
	}

}
