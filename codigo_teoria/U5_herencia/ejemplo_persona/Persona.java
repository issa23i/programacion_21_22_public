package U5_herencia_interfaces.teoria.ejemplo_persona;

public class Persona {
  String nombre;
  int edad;
  double estatura;

  protected int dni;

  public Persona(String nombre, int edad, double estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  @Override
  public String toString() {
    return "Persona{"
        + "nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", estatura="
        + estatura
        + ", dni="
        + dni
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Persona)) return false;
    Persona persona = (Persona) o;
    return this.dni == persona.dni && this.nombre.equals(persona.nombre);
  }

  @Override
  public int hashCode() {
    return 0;
  }
}
