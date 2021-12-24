package ejerciciosstring;
/* Divide la cadena de texto “www.javadesde0.com” en dos partes 
 * “www.java” y “desde0.com”.
 *  Para posteriormente concaténalas y mostrarlas de nuevo.*/
public class dividirConcatenar {
	
	static String palabra1;
	static String palabra2;
	static String palabratotal;
	public static void dividir(String palabra) {
		//Función de dividir la palabra en dos con substring
		palabra1=palabra.substring(0,7);
		palabra2=palabra.substring(8,palabra.length());
	}
	public static void concatenar() {
		//Función de concatenar las dos divisiones
		System.out.println(palabra1);
		System.out.println(palabra2);
		palabratotal=palabra1+palabra2;
		System.out.println(palabratotal);
		
	}
	public static void main(String[] args) {
		String palabra="www.javadesde0.com";
		dividirConcatenar.dividir(palabra);
		dividirConcatenar.concatenar();
	}

}
