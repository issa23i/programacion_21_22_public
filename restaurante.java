package U3_strings_arrays_funciones.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class restaurante {
  public static void main(String[] args) {
    // 1- Crear arrays (o array bidimensional para ocupación y número de mesas)
    int[][] mesas = new int[2][10];
    int grupo = 0;
    // 2- Rellenar las mesas aleatoriamente con los rangos adecuados
    for (int j = 0; j < mesas[0].length; j++) {
      mesas[0][j] = j + 1;
      mesas[1][j] = (int) (Math.random() * 5);
    }
    imprimir_mesas(mesas);
    // 3- Pedir al usuario el número de personas
    Scanner sc = new Scanner(System.in);
    while (true) {
      do {
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        grupo = sc.nextInt();
        // 4- Comprobar que el número de personas no es más de 4
        if (grupo > 4) {
          System.out.println(
              "Lo siento, no admitimos grupos de "
                  + grupo
                  + ", haga grupos de 4 personas como máximo e intente de nuevo");
        }
      } while (grupo > 4);

      if (grupo == -1) {
        break;
      }

      // 5- Buscar una mesa completamente vacía
      boolean ya_sentado = false;
      for (int i = 0; i < mesas[1].length; i++) {
        if (mesas[1][i] == 0) {
          mesas[1][i] = grupo;
          ya_sentado = true;
          break;
        }
      }
      // 6- Si no había mesa completamente vacía, buscar una mesa donde quepan.
      if (!ya_sentado) {
        for (int i = 0; i < mesas[1].length; i++) {
          if (mesas[1][i] + grupo <= 4) {
            mesas[1][i] += grupo;
            ya_sentado = true;
            break;
          }
        }
      }
      // 7- Si no cabía en ninguna mesa, dar el mensaje correspondiente.
      if (!ya_sentado) {
        System.out.println("Lo siento, en estos momentos no queda sitio");
      }
      imprimir_mesas(mesas);
    }
    System.out.println("Gracias. Hasta pronto");
  }

  public static void imprimir_mesas(int[][] mesas) {
    for (int[] mesa : mesas) {
      System.out.println(Arrays.toString(mesa));
    }
  }
}