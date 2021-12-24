package ejerciciosstring;
/* Comparar las veces que se repite en una cadena carol o pepa*/
public class compararVeces {
	static int contadorCarol=0;
	static int contadorPepa=0;
	static int posicionCarol=0;
	static int posicionPepa=0;
	public static void compararCarol(String palabra) {
		//Primera posición
		posicionCarol=palabra.indexOf("carol");
		//Resto de posiciones
		while(posicionCarol!=-1) {
			contadorCarol++;
			posicionCarol=palabra.indexOf("carol",posicionCarol+1);
		}
		
	}
	public static void compararPepa(String palabra) {
		//Primera posición
		posicionPepa=palabra.indexOf("pepa");
		//Resto de posiciones
		while(posicionPepa!=-1) {
			contadorPepa++;
			posicionPepa=palabra.indexOf("pepa",posicionPepa+1);
		}
		
	}
	public static void compararCarolPepa() {
		if(contadorCarol>contadorPepa) {
			System.out.println("Se repite más veces carol que pepa, "+contadorCarol+" veces");
		}else {
			System.out.println("Se repite más veces pepa que carol, "+contadorPepa+" veces");
		}
	}
	public static void main(String[] args) {
		String palabra="holacarolpepacarolpepacarolpepapepapepa";
		compararVeces.compararCarol(palabra);
		compararVeces.compararPepa(palabra);
		compararVeces.compararCarolPepa();

	}

}
