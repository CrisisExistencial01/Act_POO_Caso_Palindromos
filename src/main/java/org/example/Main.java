package org.example;
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