package U7_collections.ejercicios.empleados;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
  double sueldo;

  public Empleado(String nombre, int edad, double estatura, String dni, double sueldo) {
    super(nombre, edad, estatura, dni);
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + " sueldo: " + sueldo;
  }
}