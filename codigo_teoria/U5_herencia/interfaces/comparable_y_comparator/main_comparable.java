package U5_herencia_interfaces.teoria.interfaces.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class main_comparable {
  public static void main(String[] args) {
    //
    Persona[] array = new Persona[4];
    Persona p1 = new Persona("Juan", 23, 172.0);
    Persona p2 = new Persona("Carmen", 45, 122.0);
    Persona p3 = new Persona("Manuela", 23, 138.0);
    Persona p4 = new Persona("Esteban", 16, 190.0);

    array[0] = p1;
    array[1] = p2;
    array[2] = p3;
    array[3] = p4;

    imprimir(array);
    Arrays.sort(array);
    imprimir(array);
    Arrays.sort(array, new comparaPersonasEstatura());
    imprimir(array);

    p2.compareTo("Hola");
    Arrays.sort(
        array,
        new Comparator<Persona>() {
          @Override
          public int compare(Persona persona1, Persona persona2) {
            if (persona1.getEstatura() < persona2.getEstatura()) {
              return -1;
            } else if (persona1.getEstatura() > persona2.getEstatura()) {
              return 1;
            }

            return 0;
          }
        });
  }

  public static void imprimir(Persona[] array) {
    for (Persona p : array) {
      System.out.println(p);
    }
    System.out.println("------------------");
  }
}