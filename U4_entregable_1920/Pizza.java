package U4_poo.ex_entregas.entregable_1920_bien_hecho;

public class Pizza {
  public enum SizePizzas {
    MEDIANA,
    FAMILIAR
  }

  private final int MAX_INGREDIENTES = 3;
  private final SizePizzas size;
  private Ingrediente[] ingredientes = new Ingrediente[MAX_INGREDIENTES];
  private int contador_ingredientes = 0;

  public Pizza() {
    this.size = SizePizzas.FAMILIAR;
  }

  public Pizza(SizePizzas size) {
    this.size = size;
  }

  public static void mostrar_tamanyos() {
    System.out.println("Tamaños: ");
    for (SizePizzas _size : SizePizzas.values()) {
      System.out.println("    -" + _size);
    }
  }

  public int num_ingredientes() {
    return contador_ingredientes;
  }

  public boolean add_ingrediente(Ingrediente ingrediente) {
    boolean resultado = false;
    if (contador_ingredientes < MAX_INGREDIENTES) {
      ingredientes[contador_ingredientes++] = ingrediente;
      resultado = true;
    }
    return resultado;
  }

  public void mostrar_pizza() {
    System.out.println("Tamaño: " + size);
    System.out.println("Ingredientes: ");
    for (int i = 0; i < contador_ingredientes; i++) {
      System.out.println("   - " + ingredientes[i].getNombre());
    }
  }
}