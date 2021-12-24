package ejerciciosstring;
/*Cuenta las vocales y las consonantes 
 * del String “Java Java Java”. ¡OJO CON LOS ESPACIOS! */
public class contarVocalesConsonantes {
	public static void  contarVocales(String palabra) {
		int contadorVocales=0;
		int contadorConsonantes=0;
		String vocales="aeiou";
		for(int i=0;i<palabra.length();i++) {
			//Pasamos charAt a String con valueOf y usamos contains para ver si contiene vocal cada caracter
			//En función de eso aumentamos el contador
			if(vocales.contains(String.valueOf(palabra.charAt(i)))&&(palabra.charAt(i)!=' ')){
				contadorVocales++;
				
			}else if(!vocales.contains(String.valueOf(palabra.charAt(i)))&&(palabra.charAt(i)!=' ')) {
				contadorConsonantes++;
			}
		}
		
		System.out.println("Vocales: "+contadorVocales);
		System.out.println("Consonantes: "+contadorConsonantes);
	}
	public static void main(String[] args) {
		String palabra="Java Java Java";
		contarVocalesConsonantes.contarVocales(palabra);

	}

}
