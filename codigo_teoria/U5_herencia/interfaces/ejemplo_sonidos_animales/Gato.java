package U5_herencia_interfaces.teoria.interfaces.ejemplo_sonidos_animales;

public class Gato implements Sonido, Andares {
  @Override
  public void voz() {
    System.out.println("¡Miau!");
  }

  @Override
  public void andando() {
    System.out.println("Andando sigilosamente");
  }
}
