package U7_collections.ejercicios.en2122tarde;

import java.util.Set;

public class en2122tarde_main {
  public static void main(String[] args) {
    //
    Divisa d1 = new Criptomoneda("BitCoin", "BTC");
    Divisa d2 = new Criptomoneda("Cardano", "ADA");
    Divisa d3 = new Criptomoneda("Ethereum", "ETH");
    Divisa d4 = new Fiat("Euro", "EUR");
    Divisa d5 = new Fiat("Dólar estadounidense", "USD");

    ParCotizacion p1 = new ParCotizacion(d1, d2);
    p1.setVariacion(0.01);
    ParCotizacion p2 = new ParCotizacion(d2, d3);
    ParCotizacion p3 = new ParCotizacion(d2, d4);
    p3.setVariacion(0.01);
    ParCotizacion p4 = new ParCotizacion(d4, d5);

    Exchange binalixar = new Exchange();

    binalixar.addCotizacion(p1);
    binalixar.addCotizacion(p2);
    binalixar.addCotizacion(p3);
    binalixar.addCotizacion(p4);

    Set<ParCotizacion> cotizaciones_btc = binalixar.obtenerCotizaciones("ADA");
    System.out.println(cotizaciones_btc);

    binalixar.mostrarDivisasOrdenadas();

    binalixar.mostrarCotizacionesAlAlza();
  }
}
