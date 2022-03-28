package U7_collections.ejercicios.en2122tarde;

public class Fiat extends Divisa {
  private String pais;

  public Fiat(String nombre, String simbolo) {
    super(nombre, simbolo);
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public String toString() {
    return "Fiat{" + "pais='" + pais + '\'' + '}';
  }
}
