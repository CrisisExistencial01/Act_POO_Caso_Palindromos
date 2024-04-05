# Caso Palindromos: Programación Orinetada a Objetos
### Estudiante: Cristóbal Cheuquel
## Definición de palindromo: 
__Un palindromo es una _"Palabra o frase cuyas letras están dispuestas de tal manera que resulta la misma leída de izquierda a derecha que de derecha a izquierda; p. ej., anilina; dábale arroz a la zorra el abad."_ (Real Academia Española, s.f., definición 1)__
## Paso 1:
__Leer y entender el contexto problema.__
``` js
// Javascript
function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}
```
__Preguntas clave:__

1.1 ¿Qué hace el método? 

- Ans: verifica si la cadena entregada es un palíndromo.

1.2 ¿Cómo lo hace?

- Ans: Recibe como parámetro una cadena de texto, inicializa un string vacio llamado resultado, elimina los espacios entre palabras, da vuelta la string y finalmente evalúa si la string inicial es igual a la string invertida.

1.3 ¿Cómo lo uso?
- Ans: llamando a la función y entregandole una string como parámetro
  ```js
  esPalindromo("bob")
  ```
  Salida:
  ```js
  //output
  true
  ```
## Paso 2:
__Construya el método en java__
```java
public class Main {
  public static void main(String[] args){
      System.out.println("bob");
    }
  public static boolean esPalindromo(String cadena){
    return cadena.equals(new StringBuilder(cadena).reverse().toString());
  }
}
```
```java
//output
true
```
## Paso 3:

__Cree casos de prueba__
Los casos de interés podrían ser:
- Ingresar cadenas vacias: ""
- Ingresar cadenas con espacios: " ", “la tele letal”
- ingresar caracteres especiales: " !'·$%&/()= "
- ingresar cadenas con mayusculas y minusculas: “La tele letal”
### implementación en JUnit:
```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain{
  @Test
  void testEsPalindromo(){
    // Testeo de "aca"
    assertTrue(Main.esPalindromo("aca"));
    // Testeo con "acas"
    asserFalse(Main.esPalindromo("acas"));
    // Testeo con "h"
    assertTrue(Main.esPalindromo("h"));

  }
}
```
## Paso 4:

__De las pruebas analizadas, concluya y construya una versión mejorada de su método. Construya además nuevas pruebas unitarias considerando los casos anteriores y verifique sus resultados teóricos con los empíricos.__

```java
package palindromos;
import java.util.Scanner;
public class Main {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        while(true) {
            System.out.print("Ingrese un palindromo: ");
            String cadena = leerCadena();
            System.out.println(esPalindromo(cadena));
            System.out.println("Desea continuar? y/n");
            String op = leerCadena();
            if(!op.equalsIgnoreCase("y")){
                break;
            }
        }
    }
    public static String leerCadena(){
        return leer.nextLine();
    }
    public static String borrarEspacios(String cadena){
        /*
         * reemplaza las coincidencias de espacios en blanco por "",
         * \\s+ son dichos espacios
         */
        return cadena.replaceAll("\\s+", "");
    }
    public static String invertirString(String cadena){
        // Crea un objeto StringBuilder y usa StringBuilder.reverse()
        StringBuilder tmp = new StringBuilder(cadena);
        return tmp.reverse().toString();
    }
    public static boolean esPalindromo(String cadena){
        // borra los espacios e invierte la string
        cadena = borrarEspacios(cadena);
        String inversa = invertirString(cadena);
        //compara la string original con la invertida ignorando mayusculas
        return cadena.equalsIgnoreCase(inversa);
    }
}
```
4.2.1 Qué consideraciones tomaron en cuenta?
  - Ans: los casos de cadenas con espacios, insensibilidad a mayusculas, implementación de buenas prácticas
    
4.2.2 ¿Qué mejoró en su método?
  - Se crearon métodos adicionales para promover la atomicidad del programa.
    
4.2.3 ¿Qué rol jugaron las pruebas en mejorar su código?
  - Jugaron un papel clave en la detección de errores e inconsistencias en el código, de modo que se pudieron arreglar antes de llevar el programa a producción. P. ej., me di cuenta de que el resultado final se estaba comparando con la cadena original antes de eliminar los espacios. Sin los test correspondientes no me habría percatado de dicho comportamiento.
    
