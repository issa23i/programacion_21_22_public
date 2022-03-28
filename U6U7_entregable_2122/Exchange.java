package U7_collections.ejercicios.en2122tarde;

import java.io.*;
import java.util.*;

public class Exchange {
  private Map<Divisa, Set<ParCotizacion>> cotizaciones;

  public Exchange() {
    this.cotizaciones = new HashMap<>();
  }

  public void mostrarDivisasOrdenadas() {
    TreeSet<Divisa> divisas = new TreeSet<>(cotizaciones.keySet());
    System.out.println(divisas);
  }

  public Set<ParCotizacion> obtenerCotizaciones(String simbolo) {
    Divisa aux = new Fiat("", simbolo);
    Set<ParCotizacion> pares = new HashSet<>();
    Set<Divisa> divisas = cotizaciones.keySet();
    if (divisas.contains(aux)) {
      pares = cotizaciones.get(aux);
    }
    return pares;
  }

  public void mostrarCotizacionesAlAlza() {
    for (Map.Entry<Divisa, Set<ParCotizacion>> entrada : cotizaciones.entrySet()) {
      Set<ParCotizacion> cotizaciones = entrada.getValue();
      for (ParCotizacion cotizacion : cotizaciones) {
        if (cotizacion.getVariacion() > 0) {
          System.out.println(cotizacion);
        }
      }
    }
  }

  public void addCotizacion(ParCotizacion cotizacion) {
    if (cotizaciones.containsKey(cotizacion.getBase())) {
      cotizaciones.get(cotizacion.getBase()).add(cotizacion);
    } else {
      Set<ParCotizacion> nuevo_conjunto = new HashSet<>();
      nuevo_conjunto.add(cotizacion);
      cotizaciones.put(cotizacion.getBase(), nuevo_conjunto);
    }
  }

  public void guardarCotizaciones() {
    try (ObjectOutputStream out =
        new ObjectOutputStream(new FileOutputStream("ficheros/cotizaciones.dat"))) {
      out.writeObject(cotizaciones);
    } catch (IOException e) {
      System.out.println("Error al guardar el fichero: " + e.getMessage());
    }
  }

  public void recuperarCotizaciones() {
    try (ObjectInputStream in =
        new ObjectInputStream(new FileInputStream("ficheros/cotizaciones.dat"))) {
      // Esto sobra, pero borro por si acaso para añadir la info que cargo del fichero.
      cotizaciones.clear();
      while (true) {
        cotizaciones = (Map<Divisa, Set<ParCotizacion>>) in.readObject();
      }
    } catch (EOFException e) {
      System.out.println("Fin de fichero");
    } catch (IOException e) {
      System.out.println("Error en el fichero: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println("Error al leer datos del fichero: " + e.getMessage());
    }
  }
}
