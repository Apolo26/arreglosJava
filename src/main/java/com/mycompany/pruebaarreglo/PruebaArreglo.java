package com.mycompany.pruebaarreglo;

public class PruebaArreglo {

    public static void main(String[] args) {

        int[] arreglo1 = {3, 5, 7, 10};
        Arreglo.sumarLista(arreglo1);

        int[][] arreglo2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int mayor = Arreglo.buscarMayor(arreglo2);
        System.out.println("El numero entero más grande es: " + mayor);

        String cadena1 = "Laboratorio De Programacion";
        int cantidadVocales = Arreglo.cuentaVocales(cadena1);
        System.out.println("La cantidad de vocales en la cadena es: " + cantidadVocales);

        String cadena2 = "Programacion";
        char caracter = 'a';
        int cantidadCaracter = Arreglo.cuentaCaracter(cadena2, caracter);
        System.out.println("La cantidad de veces que se repite el carácter '" + caracter + "' en la cadena es: " + cantidadCaracter);
    }
}
