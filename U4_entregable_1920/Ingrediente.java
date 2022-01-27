package U4_poo.ex_entregas.entregable_1920_bien_hecho;

public class Ingrediente {
  private String nombre;
  private int calorias_100g;

  public Ingrediente() {
    this.nombre = "Queso";
    this.calorias_100g = 250;
  }

  public Ingrediente(String nombre, int calorias_100g) {
    this.nombre = nombre;
    this.calorias_100g = calorias_100g;
  }

  public String getNombre() {
    return nombre;
  }
}