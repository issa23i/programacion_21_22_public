package U7_collections.ejercicios.en2122tarde;

import java.util.Objects;

public abstract class Divisa implements Comparable<Divisa> {
  protected String nombre;
  protected String simbolo;
  protected Integer id;
  private static Integer contador = 0;

  public Divisa(String nombre, String simbolo) {
    setNombre(nombre);
    setSimbolo(simbolo);
    setId(contador++);
  }

  @Override
  public int compareTo(Divisa divisa) {
    return this.getSimbolo().compareTo(divisa.getSimbolo());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Divisa)) return false;
    Divisa divisa = (Divisa) o;
    return Objects.equals(simbolo, divisa.simbolo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simbolo);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSimbolo() {
    return simbolo;
  }

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Divisa{"
        + "nombre='"
        + nombre
        + '\''
        + ", simbolo='"
        + simbolo
        + '\''
        + ", id="
        + id
        + '}';
  }
}
