package U3_strings_arrays_funciones.ejercicios.T4_arrays_adicionales;

import java.util.Arrays;

public class ej4_nuevo {
  public static void main(String[] args) {
    //
    String[][] m = new String[8][8];
    String letras = "abcdefgh";

    // Relleno el array bidimensional con las posiciones
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = letras.charAt(j) + String.valueOf(m.length - i);
      }
    }

    // Imprimo el array bidimensional de forma "corta y bonita"
    for (String[] fila : m) {
      System.out.println(Arrays.toString(fila));
    }

    String posicion = "d5";
    int x = -1;
    int y = -1;

    // Busco la posición introducida por el usuario
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (posicion.equalsIgnoreCase(m[i][j])) {
          x = i;
          y = j;
        }
      }
    }

    // Comprobamos las 4 diagonales posibles
    System.out.println(comprobar_diagonal(m, x, y, -1, 1));
    System.out.println(comprobar_diagonal(m, x, y, -1, -1));
    System.out.println(comprobar_diagonal(m, x, y, 1, 1));
    System.out.println(comprobar_diagonal(m, x, y, 1, -1));
  }

  // La función recibe el tablero entero, la posición del alfil, y los incrementos posibles
  // según cada una de las cuatro posibles diagonales en las que se puede mover
  public static String comprobar_diagonal(String[][] m, int x, int y, int inc_x, int inc_y) {
    String movimientos = "";
    int temp_x = x + inc_x;
    int temp_y = y + inc_y;
    while (temp_x >= 0 && temp_x < m.length && temp_y >= 0 && temp_y < m.length) {
      movimientos += m[temp_x][temp_y] + " ";
      temp_x = temp_x + inc_x;
      temp_y = temp_y + inc_y;
    }

    return movimientos;
  }
}