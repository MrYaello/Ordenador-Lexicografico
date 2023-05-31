package mx.unam.ciencias.edd;

/**
 * Clase para pilas genéricas.
 */
public class Pila<T> extends MeteSaca<T> {

    /**
     * Regresa una representación en cadena de la pila.
     * @return una representación en cadena de la pila.
     */
    @Override public String toString() {
      if (cabeza == null) return "";
      String cadena = "";
      Nodo n = cabeza;
      while(n != null) {
        cadena += n.elemento + "\n";
        n = n.siguiente;
      }
      return cadena;
    }

    /**
     * Agrega un elemento al tope de la pila.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *         <code>null</code>.
     */
    @Override public void mete(T elemento) {
      if (elemento == null) throw new IllegalArgumentException("Se está intentando crear un Nodo con contenido null");
      Nodo n = new Nodo(elemento);
      if (cabeza ==  null) { cabeza = rabo = n;  return; }
      n.siguiente = cabeza;
      cabeza = n;
    }
}