package teoria;

public class clases_wrapper_integer {
  public static void main(String[] args) {
    // int es el tipo primitivo. Integer la clase envolvente

    // Constructor a partir de un int
    Integer n1 = 20;
    Integer n2 =
        new Integer(20); // En versiones nuevas está deprecado (obsoleto). IntelliJ lo tacha por
    // innecesario.

    // Constructor a partir de un String
    Integer n3 = new Integer("24");

    // Devuelve el valor equivalente
    Integer n4 = 30;
    int x = n4.intValue(); // lo que hace es devolver el int interno que alberga este Integer
    double y = n3.doubleValue(); // lo mismo, pero además convirtiéndolo a double

    // Método estático que devuelve un int a partir de un String.
    String s2 = "123456";
    int z = Integer.parseInt(s2);

    // Métodos estáticos que devuelven un String con la representación binaria, octal o hexadecimal
    // del número.
    int numero = 12;
    String binario = Integer.toBinaryString(numero);
    String octal = Integer.toOctalString(numero);
    String hexadecimal = Integer.toHexString(numero);
    System.out.println(binario);
    System.out.println(octal);
    System.out.println(hexadecimal);

    // Método Estático. Devuelve un Integer a partir de un String.
    Integer m = Integer.valueOf("123");
    System.out.println(m);
  }
}