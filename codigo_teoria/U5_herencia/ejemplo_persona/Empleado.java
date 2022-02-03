package U5_herencia_interfaces.teoria.ejemplo_persona;

public class Empleado extends Persona {
  double salario;
  String estatura = "";

  public Empleado(String nombre, int edad, double estatura, double salario) {
    super(nombre, edad, estatura);
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Empleado{"
        + "nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", estatura="
        + super.dni
        + ", salario="
        + salario
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Empleado)) return false;
    Empleado empleado = (Empleado) o;
    return this.dni == empleado.dni && this.nombre.equals(empleado.nombre);
  }
}