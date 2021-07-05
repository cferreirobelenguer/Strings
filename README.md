# ejercicios-de-strings

Cadenas de caracteres.

Probablemente, una de las cosas que más utilizarás cuando estés programando en cualquier lenguaje de programación son las cadenas de
caracteres. Las cadenas de caracteres son estructuras de almacenamiento que permiten almacenar una secuencia de caracteres de casi
cualquier longitud. Y la pregunta ahora es, ¿qué es un carácter?
En Java y en todo lenguaje de programación, y por ende, en todo sistema informático, los caracteres se codi!can como secuencias de bits que
representan a los símbolos usados en la comunicación humana. Estos símbolos pueden ser letras, números, símbolos matemáticos e incluso
ideogramas y pictogramas.
Para saber más Para saber más
Si quieres puedes profundizar en la codi!cación de caracteres leyendo el siguiente artículo de la Wikipedia.




Codi!cación de caracteres.

La forma más habitual de ver escrita una cadena de caracteres es como un literal de cadena. Consiste simplemente en una secuencia de
caracteres entre comillas dobles, por ejemplo:

"Ejemplo de cadena de caracteres".

En Java, los literales de cadena son en realidad instancias de la clase String, lo cual quiere decir que, por el mero hecho de escribir un literal, se
creará una instancia de dicha clase. Esto da mucha "exibilidad, puesto que permite crear cadenas de muchas formas diferentes, pero
obviamente consume mucha memoria. La forma más habitual es crear una cadena partiendo de un literal:

String cad="Ejemplo de cadena";

En este caso, el literal de cadena situado a la derecha del igual es en realidad una instancia de la clase String. Al realizar esta asignación
hacemos que la variable cad se convierta en una referencia al objeto ya creado. Otra forma de crear una cadena es usando el operador new y un
constructor, como por ejemplo:

String cad=new String ("Ejemplo de cadena");

Cuando se crean las cadenas de esta forma, se realiza una copia en memoria de la cadena pasada por parámetro. La nueva instancia de la clase
String hará referencia por tanto a la copia de la cadena, y no al original.
ReRe"exiona exiona
Fijate en el siguiente línea de código, ¿cuántas instancias de la clase String ves?
String cad="Ejemplo de cadena 1"; cad="Ejemplo de cadena 2"; cad=new String("Ejemplo de cadena 3");
Solución
Pues en realidad hay 4 instancias. La primera instancia es la que se crea con el literal de cadena "Ejemplo de cadena 1". El segundo literal,
"Ejemplo de cadena 2", da lugar a otra instancia diferente a la anterior. El tercer literal, "Ejemplo de cadena 3", es también nuevamente otra
instancia de String diferente. Y por último, al crear una nueva instancia de la clase String a través del operador new, se crea un nuevo objeto
String copiando para ello el contenido de la cadena que se le pasa por parámetro, con lo que aquí tenemos la cuarta instancia del objeto
String en solo una línea.




Operaciones avanzadas con cadenas de caracteres (I).

¿Qué operaciones puedes hacer con una cadena? Muchas más de las que te imaginas. Empezaremos con la operación más sencilla: la
concatenación. La concatenación es la unión de dos cadenas, para formar una sola. En Java es muy sencillo, pues sólo tienes que utilizar el
operador de concatenación (signo de suma):
En la operación anterior se esta creando una nueva cadena, resultado de unir dos cadenas: una cadena con el texto "¡Bien", y otra cadena con
el texto "venido!". La segunda línea de código muestra por la salida estándar el resultado de la concatenación. El resultado de su ejecución será
que aparecerá el texto "¡Bienvenido!" por la pantalla.
Otra forma de usar la concatenación, que ilustra que cada literal de cadena es a su vez una instancia de la clase String, es usando el método
concat del objeto String:
Fíjate bien en la expresión anterior, pues genera el mismo resultado que la primera opción y en ambas participan tres instancias de la clase
String. Una instancia que contiene el texto "¡Bien", otra instancia que contiene el texto "venido!", y otra que contiene el texto "¡Bienvenido!".
La tercera cadena se crea nueva al realizar la operación de concatenación, sin que las otras dos hayan desaparecido. Pero no te preocupes por
las otras dos cadenas, pues se borrarán de memoria cuando el recolector de basura detecte que ya no se usan.
Fíjate además, que se puede invocar directamente un método de la clase String, posponiendo el método al literal de cadena. Esto es una señal
de que al escribir un literal de cadena, se crea una instancia del objeto inmutable String.
Pero no solo podemos concatenar una cadena a otra cadena. Gracias al método toString() podemos concatenar cadenas con literales
numéricos e instancias de otros objetos sin problemas.
El método toString() es un método disponible en todas las clases de Java. Su objetivo es simple, permitir la conversión de una instancia de
clase en cadena de texto, de forma que se pueda convertir a texto el contenido de la instancia. Lo de convertir, no siempre es posible, hay clases
fácilmente convertibles a texto, como es la clase Integer, por ejemplo, y otras que no se pueden convertir, y que el resultado de invocar el
método toString() es información relativa a la instancia.
La gran ventaja de la concatenación es que el método toString() se invocará automáticamente, sin que tengamos que especi!carlo, por ejemplo:
En el ejemplo anterior, se ha invocado automáticamente i1.toString(), para convertir el número a cadena. Esto se realizará para cualquier
instancia de clase concatenada, pero cuidado, como se ha dicho antes, no todas las clases se pueden convertir a cadenas.


Autoevaluación
¿Qué se mostrará como resultado de ejecutar el siguiente código ¿Qué se mostrará como resultado de ejecutar el siguiente código System.out.println(4+1+"-"+4+1); ??
 Mostrará la cadena "5-41". 
 Mostrará la cadena "41-14". 
 Esa operación dará error. 
 
 
String cad = "¡Bien"+"venido!";

System.out.println(cad);

String cad="¡Bien".concat("venido!");

System.out.printf(cad);

Integer i1=new Integer (1223); // La instancia i1 de la clase Integer contiene el número 1223.

System.out.println("Número: " + i1); // Se mostrará por pantalla el texto "Número: 1223"




Operaciones avanzadas con cadenas de caracteres (II).

Vamos a continuar revisando las operaciones que se pueden realizar con cadenas. Como verás las operaciones a realizar se complican un poco a
partir de ahora. En todos los ejemplos la variable cad contiene la cadena "¡Bienvenido!", como se muestra en las imágenes.

int length(). Retorna un número entero que contiene la longitud de una cadena, resultado de contar el número de caracteres por la que
está compuesta. Recuerda que un espacio es también un carácter.

char charAt(int pos). Retorna el carácter ubicado en la posición pasada por parámetro. El carácter obtenido de dicha posición será
almacenado en un tipo de dato char. Las posiciones se empiezan a contar desde el 0 (y no desde el 1), y van desde 0 hasta longitud - 1.Por
ejemplo, el código siguiente mostraría por pantalla el carácter "v":

String substring(int beginIndex, int endIndex). Este método permite extraer una subcadena de otra de mayor tamaño. Una cadena
compuesta por todos los caracteres existentes entre la posición beginIndex y la posición endIndex - 1. Por ejemplo, si pusiéramos
cad.substring(0,5) en nuestro programa, sobre la variable cad anterior, dicho método devolvería la subcadena "¡Bien" tal y como se
muestra en la imagen.

String substring (int beginIndex). Cuando al método substring solo le proporcionamos un parámetro, extraerá una cadena que
comenzará en el carácter con posición beginIndex e irá hasta el !nal de la cadena. En el siguiente ejemplo se mostraría por pantalla la
cadena "ienvenido!":
Otra operación muy habitual es la conversión de número a cadena y de cadena a número. Imagínate que un usuario introduce su edad. Al
recoger la edad desde la interfaz de usuario, capturarás generalmente una cadena, pero, ¿cómo compruebas que la edad es mayor que 0? Para
poder realizar esa comprobación tienes que pasar la cadena a número. Empezaremos por ver como se convierte un número a cadena.

char t = cad.charAt(5);

System.out.println(t);

String subcad = cad.substring(2);

System.out.println(subcad);




Los números generalmente se almacenan en memoria como números binarios, es decir, secuencias de unos y ceros con los que se puede
operar (sumar, restar, etc.). No debes confundir los tipos de datos que contienen números (int, short, long, float y double) con las secuencias
de caracteres que representan un número. No es lo mismo 123 que "123", el primero es un número y el segundo es una cadena formada por
tres caracteres: '1', '2' y '3'.
Convertir un número a cadena es fácil desde que existe, para todas las clases Java, el método toString(). Gracias a ese método podemos hacer
cosas como las siguientes:
El resultado del código anterior es que se mostrará por pantalla "Número cinco: 5", y no dará ningún error. Esto es posible gracias a que Java
convierte el número 5 a su "clase envoltorio" (wrapper class) correspondiente (Integer, Float, Double, etc.), y después ejecuta
automáticamente el método toString() de dicha clase.

Reflexiona:
¿Cuál crees que será el resultado de poner System.out.println("A"+5f)? Pruébalo y recuerda: no olvides indicar el tipo de literal (f para lo
literales de números "otantes, y d para los literales de números dobles), así obtendrás el resultado esperado y no algo diferente.
String cad2="Número cinco: " + 5;

System.out.println(cad2);



Operaciones avanzadas con cadenas de caracteres (III).

¿Cómo comprobarías que la cadena "3" es mayor que 0? No puedes comparar directamente una cadena con un número, así que necesitarás
aprender cómo convertir cadenas que contienen números a tipos de datos numéricos (int, short, long, float o double). Esta es una operación
habitual en todos los lenguajes de programación, y Java, para este propósito, ofrece los métodos valueOf, existentes en todas las clases
envoltorio descendientes de la clase Number: Integer, Long, Short, Float y Double.
Veamos un ejemplo de su uso para un número de doble precisión, para el resto de las clases es similar:
Fíjate en el código anterior, en él puedes comprobar cómo la cadena c contiene en su interior un número, pero escrito con dígitos numéricos
(caracteres). El código escrito esta destinado a transformar la cadena en número, usando el método valueOf. Este método lanzará la excepción
NumberFormatException si no consigue convertir el texto a número. De momento no te preocupes demasiado acerca de este nuevo concepto,
aunque es probable que ya te haya sucedido; más adelante dedicaremos todo un tema al tratamiento de excepciones en Java. En el siguiente
código, tienes un ejemplo más completo, donde aparecen también ejemplos para las otros tipos numéricos:


import javax.swing.JOptionPane; 

/**

 * Ejemplo en el que se muestra la conversión de varias cadenas de texto, que
 * 
 * contienen números, a números.
 * 
 * @author Salvador Romero Villegas
 * 
 */
public class EjemplosConversionStringANumero {

 boolean operacionCancelada;
 
 /**
 * Constructor de la clase.
 * 
 */
 public EjemplosConversionStringANumero() {
 
 setOperacionCancelada(false);
 
 }
 
 /**
 
 * Método que permite comprobar si la última operación tipo Pedir ha sido
 * 
 * cancelada.
 * 
String c="1234.5678";

double n;

try { 

 n=Double.valueOf(c).doubleValue();
 
} catch (NumberFormatException e)

{ /* Código a ejecutar si no se puede convertir */ }

 @return true si la última operación realizada ha sido cancelada, false
 
 * en otro caso.
 * 
 */
 public boolean isOperacionCancelada() {
 
 return operacionCancelada;
 
 }
 
 /**
 * Método que permite cambiar el estado de la variable privada
 * 
 * operacionCancelada. Este método es privado y solo debe usarse desde
 * 
 * un método propio de esta clase.
 * 
 * @param operacionCancelada True o false, el nuevo estado para la variable.
 */
 
 private void setOperacionCancelada(boolean operacionCancelada) {
 
 this.operacionCancelada = operacionCancelada;
 
 } 
 /**
 * Clase que pide al usuario que introduzca un número. El número esperado
 * 
 * es un número de doble precisión, en cualquiera de sus formatos. Admitirá
 * 
 * números como: 2E10 (2*10^10); 2,45; etc.
 * 
 * @param titulo
 * 
 * @param mensaje
 * 
 * @return
 * 
 */
 
 public double PedirNumeroDouble(String titulo, String mensaje) {
 
 double d = 0;
 
 setOperacionCancelada(false);
 
 boolean NumeroValido = false;
 
 do {
 
 String s = (String) JOptionPane.showInputDialog(null, mensaje,
 
 titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
 
 if (s != null) {
 
 try {
 
 d = Double.valueOf(s).doubleValue();
 
NumeroValido = true;

 } catch (NumberFormatException e) {
 
 JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
 
 }
 
 }
 else { NumeroValido=true; // Cancelado
 
 setOperacionCancelada(true);
 
 }
 
 } while (!NumeroValido);
 
 return d;
 
 }
 /**
 
 * Clase que pide al usuario que introduzca un número. El número esperado
 * 
 * es un número de precisión sencilla, en cualquiera de sus formatos.
 * 
 * @param titulo
 * 
 * @param mensaje
 * 
 * @return
 * 
 */
 public "oat PedirNumeroFloat (String titulo, String mensaje) {
 
 "oat d = 0;
 
 setOperacionCancelada(false);
 
 boolean NumeroValido = false;
 
 do {
 
 String s = (String) JOptionPane.showInputDialog(null, mensaje,
 
 titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
 
 if (s != null) {
 
 try {
 
 d = Float.valueOf(s)."oatValue();
 
 NumeroValido = true;
 
 } catch (NumberFormatException e) {
 
 JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
 
 }
 
 }
 else { NumeroValido=true; // Cancelado
 
setOperacionCancelada(true);

 }
 
 } while (!NumeroValido);
 
 return d;
 
 }
 
 /**
 * Clase que pide al usuario que introduzca un número. El número esperado
 * 
 * es un número entero.
 * 
 * @param titulo
 * 
 * @param mensaje
 * 
 * @return
 * 
 */
 
 public int PedirNumeroInteger (String titulo, String mensaje) {
 
 int d = 0;
 
 setOperacionCancelada(false);
 
 boolean NumeroValido = false;
 
 do {
 
 String s = (String) JOptionPane.showInputDialog(null, mensaje,
 
 titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
 
 if (s != null) {
 
 try {
 
 d = Integer.valueOf(s).intValue();
 
 NumeroValido = true;
 
 } catch (NumberFormatException e) {
 
 JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
 
 }
 
 }
 else { NumeroValido=true; // Cancelado
 
 setOperacionCancelada(true);
 }
 
 } while (!NumeroValido);
 
 return d;
 
 }
/**
 * Clase que pide al usuario que introduzca un número. El número esperado
 * 
 * es un número entero.
 * 
 * @param titulo
 * 
 * @param mensaje
 * 
 * @return
 * 
 */
 public long PedirNumeroLong (String titulo, String mensaje) {
 
 long d = 0;
 
 setOperacionCancelada(false);
 
 boolean NumeroValido = false;
 
 do {
 
 String s = (String) JOptionPane.showInputDialog(null, mensaje,
 
 titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
 
 if (s != null) {
 
 try {
 
 d = Long.valueOf(s).longValue();
 
 NumeroValido = true;
 
 } catch (NumberFormatException e) {
 
 JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
 
 }
 
 }
 else { NumeroValido=true; // Cancelado
 
 setOperacionCancelada(true);
 
 }
 
 } while (!NumeroValido);
 
 return d;
 
 }
 
 /**
 * Clase que pide al usuario que introduzca un número. El número esperado
 * 
 * es un número entero corto.
 * 
 * @param titulo
 * 
 * @param mensaje
 * 
 * @return
 */
 public short PedirNumeroShort (String titulo, String mensaje) {
 
 short d = 0;
 
 setOperacionCancelada(false);
 
 boolean NumeroValido = false;
 
 do {
 String s = (String) JOptionPane.showInputDialog(null, mensaje,
 
 titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
 
 if (s != null) {
 
 try {
 
 d = Short.valueOf(s).shortValue();
 
 NumeroValido = true;
 
 } catch (NumberFormatException e) {
 
 JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
 
 }
 
 }
 else { NumeroValido=true; // Cancelado
 
 setOperacionCancelada(true);
 
 }
 
 } while (!NumeroValido);
 
 return d;
 
 }
 
}


Seguro que ya te vas familiarizando con este embrollo y encontrarás interesante todas estas operaciones. Ahora te planteamos otro reto:
imagina que tienes que mostrar el precio de un producto por pantalla. Generalmente, si un producto vale, por ejemplo 3,3 euros, el precio se
debe mostrar como "3,30 €", es decir, se le añade un cero extra al !nal para mostrar las centésimas. Con lo que sabemos hasta ahora, usando
la concatenación en Java, podemos conseguir que una cadena se concatene a un número "otante, pero el resultado no será el esperado. Prueba
el siguiente código:

Si has probado el código anterior, habrás comprobado que el resultado no muestra "3,30 €" sino que muestra "3,3 €". ¿Cómo lo
solucionamos? Podríamos dedicar bastantes líneas de código hasta conseguir algo que realmente funcione, pero no es necesario, dado que Java
y otros lenguajes de programación (como C), disponen de lo que se denomina formateado de cadenas. En Java podemos "formatear" cadenas a
través del método estático format disponible en el objeto String. Este método permite crear una cadena proyectando los argumentos en un
formato especí!co de salida. Lo mejor es verlo con un ejemplo, veamos cuál sería la solución al problema planteado antes:

float precio=3.3f;

System.out.println("El precio es: "+precio+"€");

float precio=3.3f;

String salida=string.format ("El precio es: %.2f €", precio));

System.out.println(salida);

El formato de salida, también denominado "cadena de formato", es el primer argumento del método format. La variable precio, situada como
segundo argumento, es la variable que se proyectará en la salida siguiendo un formato concreto. Seguro que te preguntarás, ¿qué es "%.2f""?
Pues es un especi!cador de formato, e indica cómo se deben formatear o proyectar los argumentos que hay después de la cadena de formato
en el método format.


Es necesario que conozcas bien el método format y los especi!cadores de formato. Por ese motivo, te pedimos que estudies el siguiente anexo:

Anexo I.- Formateado de cadenas en Java.
Sintaxis de las cadenas de formato y uso del método Sintaxis de las cadenas de formato y uso del método format..
En Java, el método estático format de la clase String permite formatear los datos que se muestran al usuario o la usuaria de la aplicación. El
método format tiene los siguientes argumentos:
Cadena de formato. Cadena que especi!ca cómo será el formato de salida, en ella se mezclará texto normal con especi!cadores de formato,
que indicarán cómo se debe formatear los datos.

Lista de argumentos. Variables que contienen los datos cuyos datos se formatearán. Tiene que haber tantos argumentos como
especi!cadores de formato haya en la cadena de formato.
Los especi!cadores de formato comienzan siempre por "%", es lo que se denomina un carácter de escape (carácter que sirve para indicar que lo
que hay a continuación no es texto normal, sino algo especial). El especi!cador de formato debe llevar como mínimo el símbolo "%" y un carácter
que indica la conversión a realizar, por ejemplo "%d". 
La conversión se indica con un simple carácter, y señala al método format cómo debe ser formateado el argumento. Dependiendo del tipo de
dato podemos usar unas conversiones u otras. Veamos las conversiones más utilizadas:

Listado de conversiones más Listado de conversiones más utilizada y ejemplos. utilizada y ejemplos.
Tipo de conversión Especi Especi!cación
de formato Tipos de datos aplicables Tipos de datos aplicables Ejemplo
Resultado
del del
ejemplo
Valor lógico o booleano. "%b" o "%B" Boolean (cuando se usan otros tipos de datos siempre lo
formateará escribiendo true).
Resultado:
true
Cadena de caracteres. "%s" o "%S" Cualquiera, se convertirá el objeto a cadena si es posible
(invocando el método toString).
Resultado:
hola
mundo
Entero decimal "%d" Un tipo de dato entero. Resultado:
10
Resultado:
1.050000E
boolean b=true;
String d=
String.format("Resultado:
%b", b);
System.out.println (d);
String cad="hola mundo";
String d=
String.format("Resultado:
%s", cad);
System.out.println (d);
int i=10;
String d=
String.format("Resultado:
%d", i);
System.out.println (d);
double i=10.5;
11/1/21 11:08
Página 13 de 18Número en notación
cientí!ca
"%e" o "%E" Flotantes simples o dobles. +01
Número decimal "%f" Flotantes simples o dobles. Resultado:
10,500000
Número en notación
cientí!ca o decimal (lo
más corto)
"%g" o "%G"
Flotantes simples o dobles. El número se mostrará como
decimal o en notación cientí!ca dependiendo de lo que sea
más corto.
Resultado:
10.5000


Ahora que ya hemos visto alguna de las conversiones existentes (las más importantes), veamos algunos modi!cadores que se le pueden aplicar
a las conversiones, para ajustar como queremos que sea la salida. Los modi!cadores se sitúan entre el carácter de escape ("%") y la letra que
indica el tipo de conversión (d, f, g, etc.).

Podemos especi!car, por ejemplo, el número de caracteres que tendrá como mínimo la salida de una conversión. Si el dato mostrado no llega a
ese ancho en caracteres, se rellenará con espacios (salvo que se especi!que lo contrario):
El hecho de que esté entre corchetes signi!ca que es opcional. Si queremos por ejemplo que la salida genere al menos 5 caracteres (poniendo
espacios delante) podríamos ponerlo así:

Se mostrará el "10" pero también se añadirán 3 espacios delante para rellenar. Este tipo de modi!cador se puede usar con cualquier conversión.
Cuando se trata de conversiones de tipo numéricas con decimales, solo para tipos de datos que admitan decimales, podemos indicar también la
precisión, que será el número de decimales mínimos que se mostrarán:
Como puedes ver, tanto el ancho como la precisión van entre corchetes, los corchetes no hay que ponerlos, solo indican que son modi!caciones
opcionales. Si queremos, por ejemplo, que la salida genere 3 decimales como mínimo, podremos ponerlo así:
Como el número indicado como parámetro solo tiene un decimal, el resultado se completará con ceros por la derecha, generando una cadena
como la siguiente: "4,200".

Una cadena de formato puede contener varios especi!cadores de formato y varios argumentos. Veamos un ejemplo de una cadena con varios
especi!cadores de formato:

Cuando el orden de los argumentos es un poco complicado, porque se reutilizan varias veces en la cadena de formato los mismos argumentos,
se puede recurrir a los índices de argumento. Se trata de especi!car la posición del argumento a utilizar, indicando la posición del argumento (el
primer argumento sería el 1 y no el 0) seguido por el símbolo del dólar ("$"). El índice se ubicaría al comienzo del especi!cador de formato,
después del porcentaje, por ejemplo:

String d=
String.format("Resultado:
%E", i);
System.out.println (d);
float i=10.5f;
String d=
String.format("Resultado:
%f", i);
System.out.println (d);
double i=10.5;
String d=
String.format("Resultado:
%g", i);
System.out.println (d);
%[Ancho]Conversión
String.format ("%5d",10);
%[Ancho][.Precisión]Conversión
String.format ("%.3f",4.2f);
String np="Lavadora";
int u=10;
float ppu = 302.4f;
float p=u*ppu;
String output=String.format("Producto: %s; Unidades: %d; Precio por unidad: %.2f €; Total: %.2f €", np, u, ppu, p);
System.out.println(output);


El ejemplo anterior mostraría por pantalla la cadena "10 multiplicado por 20 (10x20) es 200". Los índices de argumento se pueden usar
con todas las conversiones, y es compatible con otros modi!cadores de formato (incluida la precisión). 

Si quieres profundizar en los especi!cadores de formato puedes acceder a la siguiente página (en inglés), donde encontrarás información
adicional acerca de la sintaxis de los especi!cadores de formato en Java:
Sintaxis de los especi!cadores de formato.
int i=10;
int j=20;
String d=String.format("%1$d multiplicado por %2$d (%1$dx%2$d) es %3$d",i,j,i*j);
System.out.println(d);





String.valueOf() 

Descripción
Convierte a una cadena String los tipos de datos pasados como parámetro. En el caso de que queramos convertir un array de caracteres en una cadena String podemos tener una excepción IndexOutOfBoundsException en el caso de que intentemos acceder a un elemento que no exista.

Sintaxis
public static String valueOf(boolean b)
public static String valueOf(char c)
public static String valueOf(char[] data)
public static String valueOf(char[] data, int offset, int count)
public static String valueOf(double d)
public static String valueOf(float f)
public static String valueOf(int i)
public static String valueOf(long l)
public static String valueOf(Object obj)
Parámetros
float f, Número con coma flotante que queremos convertir a cadena.

long l, Número entero de hasta 64 bits que queremos convertir a cadena.

double d, Número con coma flotante de hasta 64 bits que queremos convertir a cadena.

boolean b, Valor booleano (true o false) que queremos convertir a cadena.

int count, Número de caracteres del array que queremos convertir a cadena. Se empiezan a coger caracteres desde el inicio marcado por al valor de offset.

char[] data, Array de caracteres que queremos convertir a cadena.

int offset, Posición inicial del array de caracteres desde la que queremos realizar la conversión a cadena.

char c, Caracter que queremos convertir a cadena.

Object obj, Objeto que queremos convertir a cadena. En este caso el objeto deberá de contener un método .toString() para poder realizar la conversión a cadena.

int i, Número entero que queremos convertir a cadena






Integer.parseInt() 


 
Descripción
Convierte una cadena de texto en un número entero.

Sintaxis
public static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException
public static int parseInt(String s) throws NumberFormatException
public static int parseInt(String s, int radix) throws NumberFormatException
Parámetros
String s,

int beginIndex,

int radix,

CharSequence s,

int endIndex,

Excepciones
IndexOutOfBoundsException, NumberFormatException, NullPointerException

Clase Padre
Integer

Ejemplo
Integer numero = Integer.parseInt("12");





Método matches:

El método matches de String nos permite comprobar si un String cumple una expresión regular pasado como parámetro. Si es cierta devuelve true, sino false.

Una expresión regular es una expresión textual que utiliza símbolos especiales para hacer búsquedas avanzadas.

Las expresiones pueden contener:

Caracteres.
Caracteres de control, por ejemplo, \s, \d, etc. Recuerda que añadir un \ mas al introducirlo en una cadena. Los mas usados son:
\d , dígito, es igual que [0-9]
\D , no dígito, es igual que [^0-9]
\s , carácter en blanco, es igual que [\t\n\x0B\f\r]
\S , no carácter en blanco, es igual que [^\s]
\w , carácter alfanumérico, es igual que [a-zA-Z_0-9]
\W , no carácter alfanumérico, es igual que [^\w]
Opciones de caracteres, se usa el corchete. Por ejemplo, [afgd] significa que puede contener a, f, g o d.
Negación de caracteres, funciona al revés que el anterior, se usa ^. Por ejemplo, [^afgd]
Rangos, se usa para que incluya un rango de caracteres. Por ejemplo, para que incluya los caracteres entre a y z [a-z]
Intersección: permite unir dos condiciones, es como el operador &&.
Cualquier carácter: se usa un punto.
Opcional: se usa el símbolo ?, indica que un carácter puede o no aparecer.
Repetición: se usa el símbolo *, indica que un conjunto de caracteres se pueden repetir o no.
Repetición obligada: se usa el símbolo +, es como el anterior pero debe aparecer mínimo una vez.
Repetición un número exacto de veces: después de una expresión abrimos llaves {} con un número dentro, indica el numero de veces que debe repetirse un carácter o expresión. Si después del numero escribimos una coma, indica que debe repetirse como mínimo el número que indiquemos y como máximo los que queramos. Si después de la coma escribimos un número, indica que debe repetirse entre los números que le indiquemos como si fuera un rango.
Veamos una serie de ejemplos:


public class PruebaApp {
 
    public static void main(String[] args) {
 
        String cadena="Solo se que no se nada";
 
        // ejemplo1: devolvera false, ya que la cadena tiene mas caracteres
        System.out.println("ejemplo1: "+cadena.matches("Solo"));
 
        // ejemplo2: devolvera true, siempre y cuando no cambiemos la cadena Solo
        System.out.println("ejemplo2: "+cadena.matches("Solo.*"));
 
        // ejemplo3: devolvera true, siempre que uno de los caracteres se cumpla
        System.out.println("ejemplo3: "+cadena.matches(".*[qnd].*"));
 
        // ejemplo3: devolvera false, ya que ninguno de esos caracteres estan
        System.out.println("ejemplo4: "+cadena.matches(".*[xyz].*"));
 
        // ejemplo4: devolvera true, ya que le indicamos que no incluya esos caracteres
        System.out.println("ejemplo4: "+cadena.matches(".*[^xyz].*"));
 
        // ejemplo5: devolvera true, si quitamos los caracteres delante de ? del STring original seguira devolviendo true
        System.out.println("ejemplo5: "+cadena.matches("So?lo se qu?e no se na?da"));
 
        // ejemplo6: devolvera false, ya que tenemos una S mayuscula empieza en el String
        System.out.println("ejemplo6: "+cadena.matches("[a-z].*"));
 
        // ejemplo7: devolvera true, ya que tenemos una S mayuscula empieza en el String
        System.out.println("ejemplo7: "+cadena.matches("[A-Z].*"));
 
        String cadena2="abc1234";
 
        // ejemplo8: devolvera true, ya que minimo debe repetirse alguno de los caracteres al menos una vez
        System.out.println("ejemplo8: "+cadena2.matches("[abc]+.*"));
 
        // ejemplo9: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico 4 veces
        System.out.println("ejemplo9: "+cadena2.matches("[abc]+\\d{4}"));
 
        // ejemplo10: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico entre 1 y 10 veces
        System.out.println("ejemplo10: "+cadena2.matches("[abc]+\\d{1,10}"));
 
    }
}
El mejor ejemplo para este método es la evaluación de un e-mail, veamos como seria:


import javax.swing.JOptionPane;
public class PruebaApp {
 
    public static void main(String[] args) {
 
        String email;
        boolean emailCorrecto;
        do{
            email=JOptionPane.showInputDialog("Introduce un email");
            emailCorrecto=email.matches("[-\\w\\.]+@\\w+\\.\\w+");
        }while(!emailCorrecto);
 
        System.out.println("El email "+email+" es correcto");
    }
    
    
    
    
    
    
 
 toLowerCase() y toUpperCase():
 
  Método tolowercase ()
Este método de cadena Java convierte cada carácter de la cadena en particular en la minúscula mediante el uso de las reglas de la configuración regional predeterminada.

Nota : Este método es sensible a la configuración regional. Por lo tanto, puede mostrar resultados inesperados si se usa para cadenas que deben interpretarse por separado.

Sintaxis

public String toLowerCase ()
1
public String toLowerCase ()
Parámetros

N / A

Valor de retorno

Devuelve la cadena, que se convierte a minúsculas.


Ejemplo 1:

public class Guru99 {   
public static void main(String args[]) {       
String S1 = new String("MAYÚSCULA CONVERTIDA EN MINÚSCULA");       
// Convertir a LowerCase     
System.out.println(S1.toLowerCase());    
}
}



public class Guru99 {   
    public static void main(String args[]) {       
        String S1 = new String("MAYÚSCULA CONVERTIDA EN MINÚSCULA");       
        // Convertir a LowerCase     
        System.out.println(S1.toLowerCase());    
    }
}
Salida:




mayúscula convertida a minúscula

2. Método toUppercase ()
El método toUppercase () se usa para convertir todos los caracteres de una cadena dada a mayúsculas.

Sintaxis:

toUpperCase ()
1
toUpperCase ()
Parámetros:

N / A

Devuelve el valor:

Cadena en una letra mayúscula.

Ejemplo 2:

public class Guru99 {   
public static void main(String args[]) {       
String S1 = new String("minúsculas convertidas en mayúsculas");       
// Convertir a UpperCase    
System.out.println(S1.toUpperCase());   
}
}





public class Guru99 {   
    public static void main(String args[]) {       
        String S1 = new String("minúsculas convertidas en mayúsculas");       
 
        // Convertir a UpperCase    
        System.out.println(S1.toUpperCase());   
    }
}
Salida:

MINÚSCULA CONVERTIDA EN MAYÚSCULAS






Método equals:

El método equals y hashCode
Mientras que es muy habitual usar el operador == para comparar tipos básicos no es tan habitual usarlo a la hora de comparar objetos ya que no tiene sentido a nivel de reglas de negocio. Por ejemplo en este caso a nivel de negocio consideraremos dos objetos iguales si tienen el mismo nombre. Por lo tanto deberemos sobreescribir el método equals y hashcode  de la clase Persona y hacer que dos objetos  Persona sean iguales si su nombre coincide  :


package com.arquitecturajava;
 
public class Persona {
 
private String nombre;
 
public String getNombre() {
return nombre;
}
 
public void setNombre(String nombre) {
this.nombre = nombre;
}
 
public Persona(String nombre) {
super();
this.nombre = nombre;
}
 
@Override
public int hashCode() {
return nombre.hashCode();
}
 
@Override
public boolean equals(Object obj) {
Persona p= (Persona)obj;
 
return p.getNombre().equals(this.getNombre());
 
}
 
}
Acabamos de sobreescribir los métodos (de forma simplificada) . Ahora podemos usar el método equals para comparar los siguientes objetos y nos devolverá true.


package com.arquitecturajava;
 
public class Principal4 {
 
public static void main(String[] args) {
 
Persona p= new Persona("cecilio");
Persona p1= new Persona("cecilio");
 
System.out.println(p.equals(p1));
 
}
 
}
Aunque tenemos dos variables que apuntan a objetos distintos ambos se consideran iguales a nivel semántico o de reglas de negocio que es lo que importa.






Método replace:

String.replace() 
 
Descripción
Método que nos permite cambiar un carácter por otro dentro de una cadena.

Sintaxis
public String replace(char oldChar, char newChar)
public String replace(CharSequence target, CharSequence replacement)
Parámetros
char oldChar, caracter que queremos reemplazar.

CharSequence target,

char newChar, caracter nuevo el cual queremos incluir.

CharSequence replacement,

Clase Padre
String

Ejemplo
String cadena = new String("secar");
System.out.println(cadena.replace('e','a')); //sacar
Líneas de Código
String: Quitar saltos de línea de un texto con Java
String: Reemplazar cadenas con Java
Reemplazar contenido con Java
Palíndromos en Java con reverse
Remplazar caracteres con Java






Método String charAt ():

¿Por qué usar el método de cadena “chatAt”?

El método de charat devuelve el carácter en el índice definido. En este método, el valor del índice debe estar entre 0 y la longitud de la cadena menos 1

Sintaxis del método:

public char charAt(int index)
1
public char charAt(int index)
Entrada de parámetros:

index – Este método de Java acepta solo una entrada, que es un tipo de datos int.

Método de devoluciones:

Este método devuelve datos de tipo de caracteres basados ​​en la entrada de índice




Excepción:

Lanza java.lang.StringIndexOutOfBoundsException si el valor del índice no está entre 0 y String length menos uno

Ejemplo 1:


public class CharAtGuru99 {
public static void main(String args[]) {
String s1 = "This is String CharAt Method";
//returns the char value at the 0 index
System.out.println("Character at 0 position is: " + s1.charAt(0));
//returns the char value at the 5th index
System.out.println("Character at 5th position is: " + s1.charAt(5));
//returns the char value at the 22nd index
System.out.println("Character at 22nd position is: " + s1.charAt(22));
//returns the char value at the 23th index
char result = s1.charAt(-1);
System.out.println("Character at 23th position is: " + result);
}
}



public class CharAtGuru99 {
    public static void main(String args[]) {
        String s1 = "This is String CharAt Method";
        //returns the char value at the 0 index
        System.out.println("Character at 0 position is: " + s1.charAt(0));
        //returns the char value at the 5th index
        System.out.println("Character at 5th position is: " + s1.charAt(5));
        //returns the char value at the 22nd index
        System.out.println("Character at 22nd position is: " + s1.charAt(22));
        //returns the char value at the 23th index
        char result = s1.charAt(-1);
        System.out.println("Character at 23th position is: " + result);
    }
}
Salida:

El personaje en la posición 0 es: T El
personaje en la quinta posición es: i El
personaje en la posición 22 es: M

Excepción en el hilo “principal” java.lang.StringIndexOutOfBoundsException: Índice de cadena fuera de rango: -1

Algunas cosas importantes sobre este método Java charAt:

Este método Java toma un argumento que siempre es de tipo int.
Este método devuelve el carácter como char para el argumento int dado. El valor int especifica el índice que comienza en 0.
Si el valor del índice es mayor que la longitud de la cadena o un valor negativo, se produce un error de excepción de IndexOutOfBounds.
El rango de índice debe estar entre 0 y string_length-1.
 


← Prev
Next →
0
REPLIES
Leave a Reply
Want to join the discussion?
Feel free to contribute!

Name *

Email *

Website






StringBuilder:


Java StringBuilder - StringBuffer
La clase String es una clase no modificable. Esto quiere decir que cuando se modifica un String se crea un nuevo objeto String modificado a partir del original y el recolector de basura es el encargado de eliminar de la memoria el String original.
Java proporciona la clase StringBuffer y a partir de Java 5 la clase StringBuilder para trabajar con cadenas de caracteres sobre las que vamos a realizar modificaciones frecuentes de su contenido.
La diferencia entre StringBuffer y StringBuilder es que los métodos de StringBuffer están sincronizados y los de StringBuilder no lo están. Por este motivo StringBuilder ofrece mejor rendimiento que StringBuffer y la utilizaremos cuando la aplicación tenga un solo hilo de ejecución.
En general decidiremos cuando usar String, StringBuilder o StringBuffer según lo siguiente:
-         Usaremos String si la cadena de caracteres no va a cambiar.
-         Usaremos StringBuilder si la cadena de caracteres puede cambiar y solamente tenemos un hilo de ejecución.
-         Usaremos StringBuffer si la cadena de caracteres puede cambiar y tenemos varios hilos de ejecución.
En esta entrada utilizaremos StringBuilder teniendo en cuenta que todo lo que se explica aquí es aplicable a StringBuffer.
Constructores de la Clase StringBuilder
Un objeto de tipo StringBuilder gestiona automáticamente su capacidad
– Se crea con una capacidad inicial.
– La capacidad se incrementa cuando es necesario.
La clase StringBuilder proporcionan varios constructores, algunos de ellos son:
CONSTRUCTOR
DESCRIPCIÓN
StringBuilder ()
Crea un StringBuilder vacío.
StringBuilder sb = new StringBuilder ();  
StringBuilder(int n)
Crea un StringBuilder vacío con capacidad para n caracteres.
StringBuilder(String s);
Crea un StringBuilder y le asigna el contenido del String s.
String s = "ejemplo";
StringBuilder sb = new StringBuilder (s);  
Métodos de la Clase StringBuilder
La clase StringBuilder proporcionan métodos para acceder y modificar la cadena de caracteres. Algunos de ellos son:
MÉTODO
DESCRIPCIÓN
length()
Devuelve la longitud de la cadena
append(X);
Añade X al final de la cadena. X puede ser de cualquier tipo
insert(posicion, X)
Inserta X en la posición indicada. X puede ser de cualquier tipo.
setCharAt(posicion, c)
Cambia el carácter que se encuentra en la posición indicada, por el carácter c.
charAt(posicion)
Devuelve el carácter que se encuentra en la posición indicada.
indexOf(‘caracter’)
Devuelve la posición de la primera aparición de carácter. Devuelve -1 si no lo encuentra.
lastIndexOf(‘caracter’)
Devuelve la posición de la última aparición de carácter.
Devuelve -1 si no lo encuentra.
substring(n1,n2)
Devuelve la subcadena (String) comprendida entre las posiciones n1 y n2 - 1. Si no se especifica n2, devuelve desde n1 hasta el final.
delete(inicio, fin)
Elimina los caracteres desde la posición inicio hasta fin - 1.
reverse()
Invierte el contenido de la cadena
toString()
Devuelve el String equivalente.
Los puedes consultar todos en la API de Java:
http://docs.oracle.com/javase/10/docs/api/java/lang/StringBuilder.html
http://docs.oracle.com/javase/10/docs/api/java/lang/StringBuffer.html
Ejemplo de uso de la clase StringBuilder: 
Vamos a escribir un método separarMiles que reciba un String que representa un número entero y devuelva un String con el mismo número al que se le añadirán los puntos separadores de millares.
Por ejemplo, si el método recibe el String "12345678" debe devolver el String "12.345.678"
Este problema lo podemos resolver de varias formas. En este caso la idea es darle la vuelta al número e insertar el primer punto en la cuarta posición del String, el siguiente punto 4 posiciones más adelante el siguiente otras 4 posiciones más adelante .... hasta llegar al final del número. De esta forma obtendremos grupos de 3 cifras separados por punto.
Finalmente le volvemos a dar la vuelta y ya lo tendremos.
Por ejemplo si el String es:
"12345678"
Primero le damos la vuelta:
"87654321"
Ahora tenemos que insertar un punto donde está el 5. Nos queda:
"876.54321"
Insertamos otro punto cuatro posiciones más adelante, donde está el 2:
"876.543.21"
Ahora intentaríamos insertar otro punto cuatro posiciones más adelante pero como llegamos al final el proceso termina.
Si le damos la vuelta obtendremos el resultado:
"12.345.678"

/*
 * Ejemplo de uso de StringBuilder
 * Separador de millares
 */
package string8;
public class String8 {

    public static void main(String[] args) {
        String s = "1234567890";      
        s = separarMiles(s);
        System.out.println(s);
    }

    public static String separarMiles(String s){
 
        //creamos un StringBuilder a partir del String s                                                          
        StringBuilder aux = new StringBuilder(s);
  
        //le damos la vuelta
        aux.reverse();
  
        //variable que indica donde insertar el siguiente punto                                                   
        int posicion = 3;
  
        //mientras no lleguemos al final del número
        while(posicion < aux.length()){
            //insertamos un punto en la posición
            aux.insert(posicion,'.');
            //siguiente posición donde insertar
            posicion+=4;
        }
  
        //le damos de nuevo la vuelta
        aux.reverse();
  
        //el StringBuilder se pasa a String y se devuelve                                                         
        return aux.toString();
    }
}









JOptionPane para imprimir:

JOptionPane: showMessageDialog y showInputDialog
Entrada y salida usando ventanas
Como hacer esto dependerá de qué tipo de aplicación estemos desarrollando. Si es Web usaremos una página html, si es android una Activity,  si es de línea de comandos MS-DOS lo vimos en el tutorial "Entrada y salida por consola en Java" y sí es una aplicación de escritorio podemos usar una ventana como veremos en este tutorial.

JOptionPane
Esta clase hace realmente fácil el mostrar ventanas standards para mostrar y pedir información a los usuarios. Estas ventanas llamadas Dialogs, se muestran en forma “Modal” que significa que bloquean la aplicación hasta que son cerradas.

JOptionPane es parte de la librería Swing para el manejo de interfaces gráficas. Esta librería es muy compleja, pero en este tutorial veremos lo suficiente para mostrar y recibir información del usuario. Más adelante veremos Swing en más detalle.


 
showMessageDialog(Component parentComponent, Object message)
Este método crea una ventana que muestra un mensaje entregado en el parámetro message. El parámetro parentComponent es para indicar la ventana padre. En estos primeros tutoriales usaremos null en este parámetro.

   import javax.swing.JOptionPane;
    
    public class HelloWorld {
        public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, "Hello World");
        }
    }
Mensaje de alerta

String showInputDialog(Object message)

 
Este método es una función que muestra una ventana con una caja de texto y dos botones: Aceptar y Cancelar. Si oprimimos aceptar, recibiremos un String con el contenido de la caja de texto como retorno de la función. Si oprimimos cancelar, recibiremos un null como resultado.

Ventana de mensaje showinputdialog

El siguiente ejemplo muestra cómo podemos usar este Dialog.

  package com.edu4java.javatutorials;

import javax.swing.JOptionPane;

public class ShowInputDialogExample {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Type your name please");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
}
Resumen
Los métodos showMessageDialog y showInputDialog de JOptionPane son un poco avanzados para la altura de nuestro curso actual pero son la forma más simple de entrada y salida de información para nuestros proximos tutoriales.

Aquí podemos ver el poder de la programación orientada a objetos donde componentes sofisticados se pueden manejar de una forma sencilla. JOptionPane oculta toda la complejidad en el manejo de estas ventanas.
