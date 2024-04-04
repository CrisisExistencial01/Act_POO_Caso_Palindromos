package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testBorrarEspacios() {
        String valor_esperado = "Holaaaa";
        // Clase.metodo :
        String valor_obtenido = Main.borrarEspacios("Hola a a a");

        assertEquals(valor_esperado, valor_obtenido);
        valor_esperado = "";
        assertEquals(valor_esperado, Main.borrarEspacios("                "));
    }

    @Test
    void testInvertirString() {
        String cadena = "o la";
        String valor_esperado = "al o";
        String valor_obtenido = Main.invertirString(cadena);
        assertEquals(valor_esperado, valor_obtenido);
    }
    @Test
    void testEsPalindromo(){
        String[] falsos = {"200", "ahabccbaaa"};

        String[] verdaderos = {"", "aaabccbaaa", "La tele letal"};

        for(String cadena : verdaderos) assertTrue(Main.esPalindromo(cadena));

        for(String cadena : falsos) assertFalse(Main.esPalindromo(cadena));
    }

}