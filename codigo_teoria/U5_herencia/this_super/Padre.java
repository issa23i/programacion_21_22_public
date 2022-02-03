package U5_herencia_interfaces.teoria.this_super;

public class Padre {
  String nombre;

  public Padre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "padre{" + "nombre='" + nombre + '\'' + '}';
  }
}