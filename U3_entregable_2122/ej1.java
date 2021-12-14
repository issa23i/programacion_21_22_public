package U3_strings_arrays_funciones.ex_entre.entre_tarde_21_22;

// Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
// adivinar y el resultado
// parcial) y un carácter a buscar en la cadena a adivinar. Debe devolver el resultado de encontrar
// ese character en la
// cadena a adivinar.
//
// **Ejemplo:**
//
//    palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
//    palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--o-"
//    palabraAhorcado("hola","----",'x') debe devolver "----"

import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    String palabra = "programacion";
    String resultado = "------------";
    char caracter = 'o';
    Scanner sc = new Scanner(System.in);

    System.out.println(resultado);

    while (resultado.contains("-")) {
      System.out.print("¿Qué carácter quieres buscar?: ");
      caracter = sc.next().charAt(0);
      resultado = palabraAhorcado(palabra, resultado, caracter);
      System.out.println(resultado);
    }
    System.out.println("¡Has ganado!");
  }

  public static String palabraAhorcado(String a, String b, char c) {
    StringBuilder sb = new StringBuilder(b);
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == c) {
        sb.setCharAt(i, c);
      }
    }
    return sb.toString();
  }
}
