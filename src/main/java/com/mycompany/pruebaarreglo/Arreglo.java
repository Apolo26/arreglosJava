package com.mycompany.pruebaarreglo;

public class Arreglo {

    public static void sumarLista(int[] arreglo) {
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        promedio = (double) suma / arreglo.length;
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }

    public static int buscarMayor(int[][] arreglo) {
        int mayor = arreglo[0][0];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] > mayor) {
                    mayor = arreglo[i][j];
                }
            }
        }
        return mayor;
    }

    public static int cuentaVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char vocal = cadena.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' || vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public static int cuentaCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }
}
