package ejerciciosstring;
//Quitar espacios a "James Gosling Created Java"
public class eliminarEspacios {
	
	public static void eliminar(String palabra) {
		//Quitamos espacios
		palabra=palabra.replace(" ","");
		System.out.println(palabra);
	}
	public static void main(String[] args) {
		String palabra="James Gosling Created Java";
		eliminarEspacios.eliminar(palabra);
	}

}
