package U5_herencia_interfaces.teoria.abstracta;

public class Breakdancer extends Bailarin {
  private String dni;

  public Breakdancer(String nombre, String dni) {
    super(nombre);
    this.dni = dni;
  }

  // Esta clase tiene la obligación de implementar el método bailar(), que es
  // `abstract` en la clase abstracta de la que deriva.
  @Override
  public void bailar() {
    System.out.println("Yiha! mira este tornillo loco!");
  }
}