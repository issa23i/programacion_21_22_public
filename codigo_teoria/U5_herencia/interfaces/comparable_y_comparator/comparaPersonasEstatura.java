package U5_herencia_interfaces.teoria.interfaces.comparable;

import java.util.Comparator;

public class comparaPersonasEstatura implements Comparator {
  @Override
  public int compare(Object objeto_persona1, Object objeto_persona2) {
    Persona persona1 = (Persona) objeto_persona1;
    Persona persona2 = (Persona) objeto_persona2;

    if (persona1.getEstatura() < persona2.getEstatura()) {
      return -1;
    } else if (persona1.getEstatura() > persona2.getEstatura()) {
      return 1;
    }

    return 0;
  }
}