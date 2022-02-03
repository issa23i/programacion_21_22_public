package U5_herencia_interfaces.teoria.this_super;

public class Hijo extends Padre {
  public Hijo(String nombre) {
    super(nombre);
  }

  public void set_nombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Hijo{"
        + "this.nombre='"
        + this.nombre
        + ' '
        + "super.nombre='"
        + super.nombre
        + '\''
        + '}';
  }
}