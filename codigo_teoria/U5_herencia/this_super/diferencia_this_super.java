package U5_herencia_interfaces.teoria.this_super;

public class diferencia_this_super {
  public static void main(String[] args) {
    //
    Padre p1 = new Padre("Papito");
    Hijo h1 = new Hijo("Hijito");

    h1.set_nombre("Joaquín");

    System.out.println(p1);
    System.out.println(h1);
  }
}