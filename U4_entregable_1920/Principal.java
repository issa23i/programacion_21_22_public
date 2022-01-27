package U4_poo.ex_entregas.entregable_1920_bien_hecho;

// Queremos hacer las clases necesarias para gestionar el funcionamiento de una Pizzería. Todas esas
// clases estarán en el mismo paquete.
//
// Los atributos de las clases sólo podrán ser accedidos desde la misma clase.
//
// La pizzería únicamente sirve Pizzas de las que guardaremos el tamaño (size) que podrá ser
// (mediana o familiar) y una lista de hasta 3 ingredientes (no más).
//
// En caso de no especificar el tamaño, todas las pizzas serán de tamaño familiar. Esta clase debe
// tener un método de clase que nos muestre por pantalla todos los tamaños disponibles para la clase
// Pizza.
//
// De los ingredientes únicamente nos interesa el nombre del mismo y el número de calorías cada 100
// gramos. En caso de que al crear un ingrediente no se especifique nada el ingrediente será "Queso"
// con "250" calorías por cada 100 gramos.
//
// En todo momento debemos:
//
//    Poder saber cuantos ingredientes tiene una Pizza.
//    Añadir un ingrediente (si tenemos menos de 3 devolverá true, en caso contrario esa operación
// nos devolverá false. No compruebo si está repetido o no).
//    Mostrar toda la información de la pizza (tamaño e ingredientes)
//
// La pizzería guarda todos los pedidos que se le realizan. Los pedidos únicamente contendrán una
// pizza. De esos pedidos nos interesa saber la pizza que se pidió y el momento que se realizó (que
// es el momento en el que se crea el pedido). Como el producto estrella es la "Pizza familiar con
// jamón ibérico y queso" deberemos disponer de alguna forma para agilizar la creación de ese tipo
// de pedidos.
//
// Para guardar el momento preciso de la creación del pedido usad Calendar
// (http://www.w3api.com/wiki/Java:Calendar.getInstance())
//
// Deberemos por tanto:
//
//    Inicialmente reservar espacio para 5 pedidos, aunque si vamos a abrir una Pizzería con más
// capacidad podremos darle una capacidad inicial distinta. En caso de sobrepasar esa capacidad
// iremos añadiendo más espacio para guardarlos si es necesario.
//    Podremos añadir pedidos.
//    Podré mostrar todos los pedidos realizados a la pizzería.
//    Podré mostrar la cantidad de pedidos que se han realizado.

public class Principal {
  public static void main(String[] args) {
    //
    Pizzeria luigi = new Pizzeria();
    luigi.add_pedido(new Pedido());
    luigi.mostrar_cantidad_pedidos();
    luigi.mostrar_pedidos();

    Pizza.mostrar_tamanyos();
    Pizza p = new Pizza(Pizza.SizePizzas.MEDIANA);
    Ingrediente i1 = new Ingrediente("Alcaparras", 35);
    Ingrediente i2 = new Ingrediente("Anchoas", 45);
    Ingrediente i3 = new Ingrediente("Tomate rodajas", 55);
    Ingrediente i4 = new Ingrediente("Pimiento verde", 65);
    add_ingre(p, i1);
    add_ingre(p, i2);
    add_ingre(p, i3);
    add_ingre(p, i4);
    System.out.println("La pizza p tiene: " + p.num_ingredientes() + " ingredientes");
    Pedido ped = new Pedido(p);
    luigi.add_pedido(ped);

    luigi.mostrar_cantidad_pedidos();
    luigi.mostrar_pedidos();

    for (int i = 1; i < 7; ++i) {
      luigi.add_pedido(new Pedido());
    }

    luigi.mostrar_cantidad_pedidos();
    luigi.mostrar_pedidos();
  }

  public static boolean add_ingre(Pizza p, Ingrediente i) {
    boolean resultado = p.add_ingrediente(i);
    if (resultado) {
      System.out.println("Añadido ingrediente: " + i.getNombre());
    } else {
      System.out.println("No se pudo añadir el ingrediente: " + i.getNombre());
    }
    return resultado;
  }
}