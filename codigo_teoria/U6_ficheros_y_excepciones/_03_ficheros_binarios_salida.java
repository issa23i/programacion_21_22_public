package U6_ficheros.teoria.ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _03_ficheros_binarios_salida { // salida = escribir = output
  public static void main(String[] args) {
    // Para escribir ficheros binarios, esta vez vamos a utilizar el ObjectOutputStream, que se lo
    // pasaremos al FileOutputStream para crear un flujo de salida.
    // Como siempre, es necesario rodear el código con el try-catch correspondiente.
    // Sin embargo, esta vez vamos a dar una manera diferente de hacerlo, que nos permite un
    // autocierre de los ficheros y un mejor control de las excepciones.
    // Fíjate bien en cómo se hace el try.

    int[] enteros = new int[10];
    for (int i = 0; i < enteros.length; i++) {
      enteros[i] = i;
    }
    try (ObjectOutputStream flujo_salida =
        new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
      // Podemos escribir este array de enteros, recorriéndolo...pero se escribiría como una hilera
      // de enteros.
      //      for (int num : enteros) {
      //        flujo_salida.writeInt(num);
      //      }
      // ...pero una forma más sencilla de hacerlo es utilizando el método writeObject.
      flujo_salida.writeObject(enteros);

    } catch (IOException e) {
      System.out.println("¡Error al escribir el fichero!");
    }

    // Tenemos los siguientes métodos para escribir los diferentes tipos:
    // void writeBoolean (boolean b)    ---- escribe un valor boolean en el flujo
    // void writeChar(int c)            ---- escribe el valor char del valor entero que se pasa
    // void writeInt(int n)             ---- escribe un entero
    // void writeLong(long n)           ---- escribe un entero largo
    // void writeDouble(double d)       ---- escribe un
    // double void writeObject(Objecto) ---- escribe un objeto Serializable

    // Para escribir objetos típicos de Java (Integer, Double, String, etc) no hay problema, no hay
    // que hacer nada especial. Pero... ¿y para escribir un objeto de una clase que hemos
    // confeccionado nosotros?. Para ello tiene que implementar la interfaz Serializable. ¿Cómo?.
    // Simplemente así:

    //    class miClase implements Serializable {
    //         cuerpo de la clase
    //      }

    // No es necesario que se incluya ningún método en la clase.

  }
}
