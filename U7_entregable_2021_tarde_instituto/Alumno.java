package U7_collections.ejercicios.instituto;

import java.io.Serializable;

public class Alumno implements Serializable, Comparable<Alumno> {
  private String nombre;
  private String apellidos;
  private String dni;

  private Integer id;
  private Unidad unidad;
  private static Integer contador = 0;

  public Alumno(String nombre, String apellidos, String dni, Unidad unidad) {
    setNombre(nombre);
    setApellidos(apellidos);
    setDni(dni);
    setUnidad(unidad);
    setId(contador++);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public Unidad getUnidad() {
    return unidad;
  }

  public void setUnidad(Unidad unidad) {
    this.unidad = unidad;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "nombre=" + nombre;
  }

  @Override
  public int compareTo(Alumno alumno) {
    return nombre.compareTo(alumno.getNombre());
  }
}