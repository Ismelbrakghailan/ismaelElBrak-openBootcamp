package sesion1;

import java.sql.SQLOutput;

public class ejercicio1 {
    public static void main(String[] args) {

        // Tipo identificador = 30;
        // Tipo identificador;
        // identificador = 30;

        // Enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4; // 8 byte
        System.out.println("Los datos numéricos byte: " + number1);
        System.out.println("Los datos numéricos short: " + number2);
        System.out.println("Los datos numéricos int: " + number3);
        System.out.println("Los datos numéricos long: " + number4);

        // Punto flotante
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;
        System.out.println("Los datos Decimales float: " + decimal1);
        System.out.println("Los datos Decimales double: " + decimal2);

        // Caracter
        char caracter1 = 'a';
        System.out.println("Los datos caracteres char: " + caracter1);

        // booleanos
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Los datos Boleanos boolean (verdadero): " + verdadero);
        System.out.println("Los datos Decimales Boleanos boolean (falso): " + falso);

        //cadenas de texto
        String nombre = "ismael";
        System.out.println("La clase Cadena de carácteres String: " + nombre);

        //Dado que los tipos de datos vistos anteriormente son tipos de datos primitivos su valor no puede ser null
        // asi que hay que recorrer a los tipos envoltorio.

        //Tipos envoltorio
        Integer num = null;
        Long num1 = 2L;
    }
}
