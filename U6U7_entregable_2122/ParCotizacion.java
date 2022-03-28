package U7_collections.ejercicios.en2122tarde;

public class ParCotizacion {
  private Divisa base;
  private Divisa destino;
  private Double precio;
  private Double variacion;

  public ParCotizacion(Divisa base, Divisa destino) {
    setBase(base);
    setDestino(destino);
    setPrecio(0.0);
    setVariacion(0.0);
  }

  public Divisa getBase() {
    return base;
  }

  public void setBase(Divisa base) {
    this.base = base;
  }

  public Divisa getDestino() {
    return destino;
  }

  public void setDestino(Divisa destino) {
    this.destino = destino;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Double getVariacion() {
    return variacion;
  }

  public void setVariacion(Double variacion) {
    this.variacion = variacion;
  }

  @Override
  public String toString() {
    return "ParCotizacion [base="
        + base
        + ", destino="
        + destino
        + ", precio="
        + precio
        + ", variacion="
        + variacion
        + "]";
  }
}