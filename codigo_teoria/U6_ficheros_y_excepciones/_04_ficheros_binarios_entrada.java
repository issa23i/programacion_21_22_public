package U6_ficheros.teoria.ficheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class _04_ficheros_binarios_entrada { // entrada = leer = input
  public static void main(String[] args) {
    // Para leer ficheros binarios, esta vez vamos a utilizar el ObjectInputStream, que se lo
    // pasaremos al FileInputStream para crear un flujo de entrada.
    // Como siempre, es necesario rodear el código con el try-catch correspondiente.
    // Utilizamos la nueva forma del try-catch para evitar el problema de que el flujo de entrada no
    // se cierre.

    int[] numeros = new int[0];
    try (ObjectInputStream flujo_entrada =
        new ObjectInputStream(new FileInputStream("datos.dat"))) {
      // Podemos escribir este array de enteros, recorriéndolo...pero se escribiría como una hilera
      // de enteros.
      //      for (int num : enteros) {
      //        flujo_salida.writeInt(num);
      //      }
      // ...pero una forma más sencilla de hacerlo es utilizando el método writeObject.
      numeros = (int[]) flujo_entrada.readObject(); // <- aquí leemos un objeto (o array),
      // que convertimos, porque siempre devuelve un objeto.

    } catch (IOException e) {
      System.out.println("¡Error al leer el fichero!");
    } catch (ClassNotFoundException e) { // <- esto es una excepción que se lanza cuando
      // no se encuentra la clase que se está leyendo.
      System.out.println(e.getMessage());
    }
    System.out.println(Arrays.toString(numeros));

    // Tenemos los siguientes métodos para escribir los diferentes tipos:
    // boolean readBoolean ()  ----- lee un valor boolean en el flujo
    // char readChar()         ----- lee un valor char del valor entero que se pasa
    // int readInt()           ----- lee un entero
    // long readLong()         ----- lee un entero largo
    // double readDouble()     ----- lee un double
    // Object readObject()     ----- lee un objeto Serializable

    // Sin embargo, si queremos leer un array de enteros, podemos hacerlo de la siguiente forma:
    try (ObjectInputStream flujo_entrada =
        new ObjectInputStream(new FileInputStream("datos.dat"))) {
      // Tendremos que hacer un bucle infinito, ya que no sabemos cuantos números vamos a leer.
      // Cuando se llegue al final,
      // saltará una excepción de fin de fichero (EOFException, End Of File) y podremos seguir
      // normalmente.
      while (true) {
        int num = flujo_entrada.readInt();
        System.out.println(num);
      }
    } catch (EOFException e) {
      System.out.println("¡Fin de fichero!");
    } catch (IOException e) {
      System.out.println("¡Error al leer el fichero!");
    }
    System.out.println(Arrays.toString(numeros));
  }
}
