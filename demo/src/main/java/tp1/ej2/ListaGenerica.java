package tp1.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica<T extends Comparable<T>> {
    private List<T> lista;

    public ListaGenerica() {
        this.lista = new ArrayList<>();
    }

    public void agregar(T elemento) {
        this.lista.add(elemento);
    }

    public List<T> obtenerLista() {
        return this.lista;
    }

    public int obtenerCantidadElementos() {
        return this.lista.size();
    }

    public void agregarAlPrincipio(T elemento) {
        this.lista.add(0, elemento);
    }

    public void ordenar() {
        Collections.sort(this.lista);
    }

    public void desordenar() {
        Collections.shuffle(this.lista);
    }

    public void almacenarEnPosicion(T elemento, int posicion) {
        this.lista.add(posicion, elemento);
    }

    public T obtenerEnPosicion(int posicion) {
        return this.lista.get(posicion);
    }

    public T obtenerPrimerElemento() {
        return this.lista.get(0);
    }

    public T obtenerUltimoElemento() {
        return this.lista.get(this.lista.size() - 1);
    }

    public void removerEnPosicion(int posicion) {
        this.lista.remove(posicion);
    }
}
