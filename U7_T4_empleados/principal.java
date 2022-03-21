package U7_collections.ejercicios.empleados;
// Escribir un programa que pida los datos de varios empleados. Los datos que nos interesan de
// dichos empleados son el nombre, dni, edad, estatura (heredados de la clase Persona) y sueldo.
//
// Al comenzar la ejecución, se le preguntará al usuario si desea cargar los datos de empleados de
// un fichero binario, o desea insertarlos desde consola (Se estarán insertando datos de empleados
// hasta que el usuario indique que no quiere insertar ninguno más).
//
// Sea de una u otra forma, la aplicación insertará estos datos en un Diccionario de datos (o Mapa),
// en el que la clave se corresponderá con el dni del empleado, y el valor, con el objeto empleado
// completo.
//
// Una vez cargados los datos en ese Mapa (que debe estar disponible para el resto de operaciones de
// la aplicación), se le darán varias opciones al usuario:
//
// 1. VISUALIZAR LISTADO. Visualizar los datos de todos los empleados en el mismo orden que se
// insertaron.
//
// 2. BORRAR EMPLEADO/S. Se le pedirá el dni de un empleado con el fin de borrarlo del map. Tener en
// cuenta que puede que no haya ningún empleado con ese dni. Esta operación se seguirá realizando
// hasta que el usuario indique su fin.
//
// 3. VISUALIZAR EMPLEADO. Se pedirá al usuario un dni con el fin de visualizar los datos de ese
// empleado.
//
// 4. MODIFICAR EMPLEADO. Permitirá al usuario modificar los datos de un empleado concreto,
// indicando para ello el dni del empleado que quiere cambiar. La modificación consistirá en pedir,
// de nuevo todos los datos de dicho empleado menos el dni, que no es modificable.
//
// 5. INSERTAR EMPLEADO/S. Por último, el programa dará la opción de insertar nuevos empleados.
//
// Después de cada operación, se visualizará la lista para ver cómo va quedando.
//
// Cuando el usuario indique que no desea hacer más operaciones, los datos han de ser volcados en el
// archivo binario que se cargó al principio (o en uno por defecto si el usuario no hubiera indicado
// ninguno).

import java.io.*;
import java.util.*;

public class principal {
  private static Scanner sc = new Scanner(System.in);
  private static Map<String, Empleado> MapaEmpleados = new LinkedHashMap<>();

  public static void main(String[] args) {

    //
    System.out.println("1) Leer datos desde fichero");
    System.out.println("2) Introducir manualmente los datos");
    System.out.println("¿Qué desea hacer? (1/2): ");
    Integer respuesta = sc.nextInt();
    sc.nextLine();

    if (respuesta == 1) {
      leer_fichero();
    } else if (respuesta == 2) {
      introducir_empleados();
    }
    visualizar_menu();
  }

  public static void visualizar_menu() {
    Integer respuesta;
    do {
      System.out.println("---- Menú ----");
      System.out.println("1. VISUALIZAR LISTADO");
      System.out.println("2. BORRAR EMPLEADO/S");
      System.out.println("3. VISUALIZAR EMPLEADO");
      System.out.println("4. MODIFICAR EMPLEADO");
      System.out.println("5. INSERTAR EMPLEADO/S");
      System.out.println("6. FINALIZAR");
      System.out.println("Introduzca la opción: ");
      respuesta = sc.nextInt();
      sc.nextLine();
      switch (respuesta) {
        case 1:
          visualizar_listado();
          break;
        case 2:
          borrar_empleado();
          break;
        case 3:
          visualizar_empleado();
          break;
        case 4:
          modificar_empleado();
          break;
        case 5:
          introducir_empleados();
          break;
        case 6:
          finalizar();
          break;
        default:
          System.out.println("Opción no válida");
          break;
      }
      visualizar_listado();
    } while (respuesta != 6);
  }

  public static void visualizar_listado() {
    Set<Map.Entry<String, Empleado>> entradas = MapaEmpleados.entrySet();
    Iterator<Map.Entry<String, Empleado>> it = entradas.iterator();

    while (it.hasNext()) {
      Map.Entry<String, Empleado> entrada = it.next();
      System.out.println(entrada.getValue());
    }
  }

  public static void borrar_empleado() {
    boolean seguir_introduciendo = true;
    do {
      System.out.println("Introduzca el DNI del empleado que quiere borrar: ");
      String dni_a_borrar = sc.nextLine();

      if (MapaEmpleados.containsKey(dni_a_borrar)) {
        MapaEmpleados.remove(dni_a_borrar);
      } else {
        System.out.println("El dni no está en la BD");
      }

      System.out.println("¿Desea seguir borrando empleados? (true/false)");
      seguir_introduciendo = sc.nextBoolean();
      sc.nextLine();
    } while (seguir_introduciendo);
  }

  public static void visualizar_empleado() {
    System.out.println("Introduzca el DNI del empleado que quiere visualizar: ");
    String dni = sc.nextLine();

    if (MapaEmpleados.containsKey(dni)) {
      System.out.println(MapaEmpleados.get(dni));
    } else {
      System.out.println("El dni no está en la BD");
    }
  }

  public static void modificar_empleado() {
    System.out.println("Introduzca el DNI del empleado que quiere modificar: ");
    String dni = sc.nextLine();

    if (MapaEmpleados.containsKey(dni)) {
      System.out.println("Introduzca el nombre del empleado: ");
      String nombre = sc.nextLine();
      System.out.println("Introduzca la edad del empleado: ");
      Integer edad = sc.nextInt();
      sc.nextLine();
      System.out.println("Introduzca la altura del empleado: ");
      Double estatura = sc.nextDouble();
      sc.nextLine();
      System.out.println("Introduzca el sueldo del empleado: ");
      Double sueldo = sc.nextDouble();
      sc.nextLine();
      Empleado e = new Empleado(nombre, edad, estatura, dni, sueldo);
      MapaEmpleados.put(dni, e);
    } else {
      System.out.println("El dni no está en la BD");
    }
  }

  public static void finalizar() {
    try (ObjectOutputStream flujo_salida =
        new ObjectOutputStream(new FileOutputStream("datos_empleados.dat"))) {
      flujo_salida.writeObject(MapaEmpleados);

    } catch (IOException e) {
      System.out.println("¡Error al escribir el fichero!");
    }
  }

  public static void introducir_empleados() {
    System.out.println("Introduzca los datos de los empleados");
    boolean seguir_introduciendo = true;
    while (seguir_introduciendo) {
      System.out.println("Introduzca el dni del empleado: ");
      String dni = sc.nextLine();
      System.out.println("Introduzca el nombre del empleado: ");
      String nombre = sc.nextLine();
      System.out.println("Introduzca la edad del empleado: ");
      Integer edad = sc.nextInt();
      sc.nextLine();
      System.out.println("Introduzca la altura del empleado: ");
      Double estatura = sc.nextDouble();
      sc.nextLine();
      System.out.println("Introduzca el sueldo del empleado: ");
      Double sueldo = sc.nextDouble();
      sc.nextLine();
      Empleado e = new Empleado(nombre, edad, estatura, dni, sueldo);
      MapaEmpleados.put(dni, e);
      System.out.println("¿Introducir más? (true/false)");
      seguir_introduciendo = sc.nextBoolean();
      sc.nextLine();
    }
  }

  public static void leer_fichero() {
    try (ObjectInputStream flujo_entrada =
        new ObjectInputStream(new FileInputStream("datos_empleados.dat"))) {
      MapaEmpleados = (Map<String, Empleado>) flujo_entrada.readObject();

    } catch (IOException e) {
      System.out.println("¡Error al leer el fichero!");
    } catch (ClassNotFoundException e) { // <- esto es una excepción que se lanza cuando
      // no se encuentra la clase que se está leyendo.
      System.out.println(e.getMessage());
    }
  }
}