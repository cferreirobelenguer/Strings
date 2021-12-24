package ejerciciosstring;
/*el método deberá imprimir el número de letras,
 *  dígitos y espacios en blanco de la cadena. 
 *  Intenta hacer un programa que escriba el conteo 
 *  (por ejemplo) de la cadena.
 *  «Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012 */
public class contarCaracteresNumeros {
	public static void contar(String palabra) {
		int contadorEspacios=0;
		int contadorNumeros=0;
		int contadorLetras=0;
		int contadorEspe=0;
		boolean numerosOK=false;
		boolean espaciosOK=false;
		boolean letrasOK=false;
		boolean caracteresEspe=false;
		
		for(int i=0;i<palabra.length();i++) {
			
			if((Character.isDigit(palabra.charAt(i)))&&(palabra.charAt(i)!=' ')) {
				//Contamos números
				contadorNumeros++;
				numerosOK=true;
			}else if((Character.isLetter(palabra.charAt(i)))&&(palabra.charAt(i)!=' ')){
				//Contamos letras
				contadorLetras++;
				letrasOK=true;
			}else if(palabra.charAt(i)==' ') {
				//Contamos espacios en blanco
				contadorEspacios++;
				espaciosOK=true;
			}else {
				//Contamos caracteres especiales
				contadorEspe++;
				caracteresEspe=true;
			}
		}
		if(palabra.length()>0) {
			System.out.println("Contador caracteres totales: "+palabra.length());
			if(numerosOK==true) {
				System.out.println("Contador de números: "+contadorNumeros);
			}else {
				System.out.println("La palabra no contiene números");
			}
			if(espaciosOK==true) {
				System.out.println("Contador de espacios: "+contadorEspacios);
			}else {
				System.out.println("La palabra no contiene espacios");
			}
			if(letrasOK==true) {
				System.out.println("Contador de letras: "+contadorLetras);
			}else {
				System.out.println("La palabra no contiene letras");
			}
			if(caracteresEspe==true) {
				System.out.println("Contador de caracteres especiales: "+contadorEspe);
			}else {
				System.out.println("La palabra no contiene caracteres especiales");
			}
		}else {
			System.out.println("La palabra no existe");
		}
		
		
	}
	public static void main(String[] args) {
		String palabra="Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012";
		contarCaracteresNumeros.contar(palabra);
	}

}
