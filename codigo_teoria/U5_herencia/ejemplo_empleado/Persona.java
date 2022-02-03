package U5_herencia_interfaces.teoria.ejemplo_empleado;

public class Persona extends SerHumano {
  private String nombre = "Abel";

  @Override
  public void nombre() {
    System.out.println("He sido civilizado. Soy una persona. Tengo nombre = " + nombre);
  }

  @Override
  public void apellido() {
    System.out.println("Mi apellido es tal");
  }
}
