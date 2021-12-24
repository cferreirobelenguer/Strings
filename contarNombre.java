package ejerciciosstring;
/* Contar el número de veces que aparece carol en la
 * cadena de caracteres: "holacarolcarolholacarolcarolcarolholacarol"*/
public class contarNombre {
	public static void contar(String palabra) {
		//Busca la primera búsqueda
		int posicion=palabra.indexOf("carol");
		int contador=0;
		//Busca el resto hasta que la posición de -1
		while(posicion!=-1) {
			contador++;
			posicion=palabra.indexOf("carol",posicion+1);
		}
		System.out.println("Número de veces que se repite carol: "+contador);
	}
	public static void main(String[] args) {
		String palabra="holacarolcarolholacarolcarolcarolholacarol";
		contarNombre.contar(palabra);
	}

}
