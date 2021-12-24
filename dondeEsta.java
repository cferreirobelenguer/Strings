package ejerciciosstring;

import java.util.Scanner;

/*Realizar una función Java int dondeEsta (char c, String s) 
 * que reciba como parámetro un String y un

carácter e indique en que posición se encuentra o devuelva -1
 en el caso que la letra no aparezca. */
public class dondeEsta {
static Scanner sc=new Scanner(System.in);
static String palabra="";
static char caracter;
static String msg="";
public static void dondeEstaCaracter() {
	int contadorCaracter=0;
	//Se introducen los datos
	System.out.println("Introduce palabra");
	palabra=sc.next();
	System.out.println("Introduce caracter");
	caracter=sc.next().charAt(0);
	//Se busca la primera posición de la palabra
	int posicion=palabra.indexOf(caracter);
	//En caso de que no se encuentre el caracter -1 se muestra mensaje
	if(posicion==-1){
		System.out.println("El caracter no se encuentra");
	}else {
		System.out.println(posicion);
	}
	//Se busca el resto de posiciones de la palabra
	while(posicion!=-1) {
		posicion=palabra.indexOf(caracter,posicion+1);
		
		if(posicion!=-1) {
			System.out.println(posicion);
		}
		
	}
	
	
}
	public static void main(String[] args) {
		dondeEsta.dondeEstaCaracter();

	}

}
