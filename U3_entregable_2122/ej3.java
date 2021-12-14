package U3_strings_arrays_funciones.ex_entre.entre_tarde_21_22;

import java.util.Arrays;
import java.util.Scanner;

// Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y columnas
// como indique el usuario.
// Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos incluidos).
//
// A continuación, el programa debe insertar en un array `pares` los números que se encuentran en la
// intersección de las filas pares con las columnas pares.
// Se hace lo mismo para el array `impares` con los números que se encuentran en la intersección de
// las filas impares con las columnas impares.
//
// Finalmente se debe mostrar la suma, media y máximo y mínimo de cada uno de los arrays `pares` e
// `impares`.
public class ej3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el número de filas: ");
    int filas = sc.nextInt();
    System.out.print("Introduce el número de columnas: ");
    int columnas = sc.nextInt();
    int[][] matriz = new int[filas][columnas];
    int[] pares = new int[0];
    int[] impares = new int[0];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        matriz[i][j] = (int) (Math.random() * (78 - 14 + 1) + 14);
      }
    }

    int idx_pares = 0;
    int idx_impares = 0;
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        if (i % 2 == 0 && j % 2 == 0) {
          pares = Arrays.copyOf(pares, pares.length + 1);
          pares[idx_pares++] = matriz[i][j];
        } else if (i % 2 != 0 && j % 2 != 0) {
          impares = Arrays.copyOf(impares, impares.length + 1);
          impares[idx_impares++] = matriz[i][j];
        }
      }
    }

    System.out.println("\nMatriz:");
    for (int i = 0; i < filas; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }

    System.out.println("\nPares:");
    System.out.println(Arrays.toString(pares));
    System.out.println("\nImpares:");
    System.out.println(Arrays.toString(impares));

    int maximo_pares = 0;
    int minimo_pares = 0;
    int maximo_impares = 0;
    int minimo_impares = 0;
    int suma_pares = 0;
    int suma_impares = 0;

    for (int impar : impares) {
      suma_impares += impar;
      if (impar > maximo_impares) {
        maximo_impares = impar;
      }
      if (minimo_impares > impar || minimo_impares == 0) {
        minimo_impares = impar;
      }
    }

    for (int par : pares) {
      suma_pares += par;
      if (par > maximo_pares) {
        maximo_pares = par;
      }
      if (minimo_pares > par || minimo_pares == 0) {
        minimo_pares = par;
      }
    }

    System.out.println("\nSuma de pares: " + suma_pares);
    System.out.println("Suma de impares: " + suma_impares);
    System.out.println("Media de pares: " + (suma_pares / pares.length));
    System.out.println("Media de impares: " + (suma_impares / impares.length));
    System.out.println("Máximo de pares: " + maximo_pares);
    System.out.println("Mínimo de pares: " + minimo_pares);
    System.out.println("Máximo de impares: " + maximo_impares);
    System.out.println("Mínimo de impares: " + minimo_impares);
  }

}