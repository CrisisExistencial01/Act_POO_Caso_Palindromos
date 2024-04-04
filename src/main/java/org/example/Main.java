package org.example;
import java.util.Scanner;
public class Main {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {


    }
    public static String leerCadena(String cadena){
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
        String inversa = invertirString( borrarEspacios( cadena ) );
        //compara la string original con la invertida ignorando mayusculas
        return cadena.equalsIgnoreCase(inversa);
    }
}