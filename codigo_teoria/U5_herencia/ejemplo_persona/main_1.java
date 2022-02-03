package U5_herencia_interfaces.teoria.ejemplo_persona;

public class main_1 {
  public static void main(String[] args) {
    //
    Persona p1 = new Persona("Pepito Piscinas", 10, 100);
    Persona p2 = new Persona("Juanito Piscinas", 10, 100);
    Empleado e1 = new Empleado("John Cobra", 3, 90, 1000);

    Persona p3 = e1;

    String s1 = "";

    if (p1.equals(e1)) {
      System.out.println("son personas iguales");
    } else {
      System.out.println("son personas distintas");
    }

    System.out.println(p1);
  }
}