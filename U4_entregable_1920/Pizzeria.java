package U4_poo.ex_entregas.entregable_1920_bien_hecho;

import java.util.Arrays;

public class Pizzeria {
  private int MAX_PEDIDOS;
  private int contador_pedidos;
  private Pedido[] pedidos;

  public Pizzeria() {
    MAX_PEDIDOS = 5;
    pedidos = new Pedido[MAX_PEDIDOS];
  }

  public Pizzeria(int MAX_PEDIDOS) {
    this.MAX_PEDIDOS = MAX_PEDIDOS;
    pedidos = new Pedido[MAX_PEDIDOS];
  }

  public void add_pedido(Pedido p) {
    if (contador_pedidos < MAX_PEDIDOS) {
      pedidos[contador_pedidos++] = p;
    } else {
      pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
      pedidos[contador_pedidos++] = p;
    }
  }

  public void mostrar_pedidos() {
    System.out.println("Pedidos: ");
    for (int i = 0; i < contador_pedidos; i++) {
      System.out.println("- Pedido " + i + " (" + pedidos[i].getFecha() + ") :");
      pedidos[i].getPizza().mostrar_pizza();
    }
  }

  public void mostrar_cantidad_pedidos() {
    System.out.println("Num. pedidos: " + contador_pedidos);
  }
}