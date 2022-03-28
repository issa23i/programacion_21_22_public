package U7_collections.ejercicios.en2122tarde;

public class Criptomoneda extends Divisa {
  private Double precioUSD;
  private Double volumen;
  private String fecha;
  private Integer ranking;

  public Criptomoneda(String nombre, String simbolo) {
    super(nombre, simbolo);
  }
}
