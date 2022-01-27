package U4_poo.ex_entregas.entregable_1920_bien_hecho;

import java.util.Calendar;

public class Pedido {
  private Pizza p;
  private String fecha;

  public Pedido() {
    p = new Pizza(Pizza.SizePizzas.FAMILIAR);
    Ingrediente i1 = new Ingrediente("Jamón ibérico", 300);
    Ingrediente i2 = new Ingrediente();
    p.add_ingrediente(i1);
    p.add_ingrediente(i2);
    this.fecha = get_fecha_pedido();
  }

  public Pedido(Pizza p) {
    this.p = p;
    this.fecha = get_fecha_pedido();
  }

  public String getFecha() {
    return fecha;
  }

  public Pizza getPizza() {
    return p;
  }

  private String get_fecha_pedido() {
    Calendar c = Calendar.getInstance();

    String dia, mes, annio, hora, minuto, segundo;

    dia = Integer.toString(c.get(Calendar.DATE));
    mes = Integer.toString(c.get(Calendar.MONTH) + 1);
    annio = Integer.toString(c.get(Calendar.YEAR));

    hora = Integer.toString(c.get(Calendar.HOUR));
    minuto = Integer.toString(c.get(Calendar.MINUTE));
    segundo = Integer.toString(c.get(Calendar.SECOND));

    return dia + "/" + mes + "/" + annio + " " + hora + ":" + minuto + ":" + segundo;
  }
}