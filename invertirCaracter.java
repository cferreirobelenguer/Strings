package ejerciciosstring;
/* Invertir el texto: “Java desde 0”*/
public class invertirCaracter {
	public static String invertir() {
		//Invertimos el texto creando un stringbuilder y usando la función reverse
		StringBuilder palabra = new StringBuilder("Java desde 0");
		palabra.reverse();
		//Se pasa el stringbuilder a string con toString()
		String palabraTotal=palabra.toString();
		return palabraTotal;
	}
	public static void main(String[] args) {
		System.out.println("La palabra a la inversa es: ");
		System.out.println(invertirCaracter.invertir());
	}

}
