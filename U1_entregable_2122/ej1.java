package U1.entregable2122;

import java.util.Scanner;

// Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
// La anchura y altura de cada una de las letras deberá ser la misma. Se solicitará al usuario una
// altura que deberá siempre impar y mayor que 3. En caso de que el usuario no introduzca un valor
// correcto, se pedirá de nuevo la altura.
//
// Ejemplo 1:
//
// Introduzca una altura: 5
//
// *   *    *   *
// ** **     * *
// * * *      *
// *   *      *
// *   *      *
// Ejemplo 2:
//
// Introduzca una altura: 7
//
// *     *    *     *
// **   **     *   *
// * * * *      * *
// *  *  *       *
// *     *       *
// *     *       *
// *     *       *
public class ej1 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    int altura = 7;
    final int espaciado = 4;

    //    do {
    //      System.out.print("Introduzca una altura (impar y mayor que 3): ");
    //      altura = sc.nextInt();
    //    } while (altura < 3 && altura % 2 == 0);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura * 2 + espaciado; j++) {
        if (j == 0
            || j == altura - 1
            || ((j == i) && i <= altura / 2)
            || ((j == altura - i - 1) && i <= altura / 2)
            || ((j == altura + espaciado + altura / 2) && i >= altura / 2)
            || ((j == altura * 2 + espaciado - i - 1) && i <= altura / 2)
            || ((j == altura + espaciado + i) && i <= altura / 2)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
