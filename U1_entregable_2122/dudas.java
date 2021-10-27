package U1.entregable2122;

public class dudas {
  public static void main(String[] args) {
    //
    long cociente = 2355;
    int a_saltar = 0;

    do {
      if (a_saltar == 0) {
        // Operaciones que quiero hacer alternativamente
        a_saltar = 1;
      } else {
        a_saltar--;
      }
      cociente = cociente / 10;

    } while (cociente != 0);
  }
}