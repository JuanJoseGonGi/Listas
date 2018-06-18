package tda;

public abstract class ListaAbstracta {
    protected Nodo<E> cabeza;
    protected Nodo<E> cola;
    protected int numNodos;
    
    @Override
    public String toString() {
        return "ListaAbstracta{" +
                "cabeza=" + cabeza +
                ", cola=" + cola +
                ", numNodos=" + numNodos +
                '}';
    }
    
    public Nodo<E> getCabeza() {
        return cabeza;
    }
    
    public Nodo<E> getCola() {
        return cola;
    }
    
    public int getNumNodos() {
        return numNodos;
    }
}
