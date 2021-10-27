package U1.entregable2122;

import java.util.Scanner;

// Escribe un programa que solicite al usuario los siguientes números:
//
// Un número entero positivo
// Un número entre 0 y 2 (ambos inclusive)
// Una vez introducidos los dos números nos debe construir un número saltando las cifras según
// indique el segundo número.
//
// Ejemplo 1:
//
// Introduzca un número: 3456759
// Introduzca el salto: 1
// Resultado: 3579
//
// Ejemplo 2:
//
// Introduzca un número: 3456759
// Introduzca el salto: 2
// Resultado: 369
public class ej2 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    long n = sc.nextLong();
    int salto = 0;

    do {
      System.out.println("Introduzca el salto: ");
      salto = sc.nextInt();
    } while (salto < 0 || salto > 2);

    long cociente = n;
    long invertido = 0;

    while (cociente != 0) {
      invertido = invertido * 10 + cociente % 10;
      cociente = cociente / 10;
    }

    cociente = invertido;
    n = 0;
    int a_saltar = 0;

    while (cociente != 0) {
      if (a_saltar == 0) {
        n = n * 10 + cociente % 10;
        cociente = cociente / 10;
        a_saltar = salto;
      } else {
        cociente = cociente / 10;
        a_saltar--;
      }
    }

    System.out.println("Resultado = " + n);
  }
}
