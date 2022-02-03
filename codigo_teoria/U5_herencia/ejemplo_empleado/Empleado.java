package U5_herencia_interfaces.teoria.ejemplo_empleado;

public class Empleado extends SerHumano {

  @Override
  public void nombre() {
    System.out.println("Ahora soy un empleado con nombre");
  }

  @Override
  public void apellido() {
    System.out.println("Ahora soy un empleado con apellido");
  }
}
