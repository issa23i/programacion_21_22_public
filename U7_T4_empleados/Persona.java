package U7_collections.ejercicios.empleados;

import java.io.Serializable;

public class Persona implements Serializable {
  String nombre;
  int edad;
  double estatura;
  String dni;

  public Persona(String nombre, int edad, double estatura, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
    this.dni = dni;
  }

  void mostrarDatos() {
    System.out.println(nombre);
    System.out.println(edad);
    System.out.println(estatura);
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + " edad: " + edad + " estatura: " + estatura + " dni: " + dni;
  }
}