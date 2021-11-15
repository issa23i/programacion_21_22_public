package U3_strings_arrays_funciones.teoria;

public class string_builder_benchmark {
  public static void main(String[] args) {
    final int num_iteraciones = 1000000;

    // StringBuffer
    StringBuffer sbuffer = new StringBuffer();
    long inicio = System.currentTimeMillis();
    for (int i = 0; i < num_iteraciones; i++) {
      sbuffer.append("Elefante");
    }
    long fin = System.currentTimeMillis();
    System.out.println("Tiempo del StringBuffer: " + (fin - inicio));

    // StringBuilder
    StringBuilder sbuilder = new StringBuilder();
    inicio = System.currentTimeMillis();
    for (int i = 0; i < num_iteraciones; i++) {
      sbuilder.append("Elefante");
    }
    fin = System.currentTimeMillis();
    System.out.println("Tiempo del StringBuilder: " + (fin - inicio));

    // String
    String string = "";
    inicio = System.currentTimeMillis();
    for (int i = 0; i < num_iteraciones; i++) {
      string += "Elefante";
    }
    fin = System.currentTimeMillis();
    System.out.println("Tiempo del String: " + (fin - inicio));
  }
}