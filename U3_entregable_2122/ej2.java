package U3_strings_arrays_funciones.ex_entre.entre_tarde_21_22;

import java.util.Arrays;

// Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
//    public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//
// Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros
// que contenga el primer array con el segundo array insertado de manera completa a partir de la
// posición dada. Si la posición es menor que 0, el vector devuelto deberá contener el primer array.
// Si la posición es mayor que la longitud del primer array, el vector devuelto deberá contener el
// segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto deberá
// contener el primer array con el segundo array insertado al final. Probar dicha función en el
// método Main.
//
// **Ejemplo 1:**
//
//    v1 = {1,2,3,4,5,6}
//    v2 = {4,9,12,5,7}
//    pos = 2
//
// El resultado de insertarEnVector será:
//
//    {1,2,4,9,12,5,7,3,4,5,6}
//
// **Ejemplo 2:**
//
//    v1 = {6,12,8,9,3,13}
//    v2 = {13,11,4,8,6,1}
//    pos = -1
//
// El resultado de insertarEnVector será:
//
//    {6,12,8,9,3,13}
//
// **Ejemplo 3:**
//
//    v1 = {6,12,8,9,3,13}
//    v2 = {13,11,4,8,6,1}
//    pos = 7
//
// El resultado de insertarEnVector será:
//
//    {13,11,4,8,6,1}
public class ej2 {
  public static void main(String[] args) {
    int[] v1 = {6, 12, 8, 9, 3, 13};
    int[] v2 = {13, 11, 4, 8, 6, 1};
    int pos = 7;
    int[] resultado = insertarEnVector(v1, v2, pos);
    for (int i = 0; i < resultado.length; i++) {
      System.out.print(resultado[i] + " ");
    }
  }

  public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
    int[] resultado = new int[v1.length + v2.length];
    if (pos < 0) {
      resultado = Arrays.copyOf(v1, v1.length);
    } else if (pos >= v1.length) {
      resultado = Arrays.copyOf(v2, v2.length);
    } else {
      for (int i = 0; i < pos; i++) {
        resultado[i] = v1[i];
      }
      for (int i = 0; i < v2.length; i++) {
        resultado[i + pos] = v2[i];
      }
      for (int i = pos; i < v1.length; i++) {
        resultado[i + v2.length] = v1[i];
      }
    }
    return resultado;
  }
}
