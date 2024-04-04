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
