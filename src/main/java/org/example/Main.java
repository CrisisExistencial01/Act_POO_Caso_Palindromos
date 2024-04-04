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
        return cadena.replaceAll("\\s+", "");
    }
    public static String invertirString(String cadena){
        StringBuilder tmp = new StringBuilder(cadena);
        return tmp.reverse().toString();
    }
}