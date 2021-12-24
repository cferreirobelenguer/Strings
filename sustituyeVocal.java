package ejerciciosstring;
/*Sobre la cadena de texto “Jeve jeve jeve”, 
 * sustituye/reemplaza todas las vocales e por 
 * la vocal a dando como resultado “Java java java”. */
public class sustituyeVocal {
	
	public static String sustituir(String palabra) {
		//Se sustituye e por a
		String palabraNueva="";
		palabraNueva=palabra.replace("e","a");
		return palabraNueva;
	}
	public static void main(String[] args) {
		String palabra="Jeve jeve jeve";
		System.out.println("La palabra resultante de sustituir e por a es: "+sustituyeVocal.sustituir(palabra));

	}

}
