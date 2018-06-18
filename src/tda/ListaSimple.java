package tda;

public class ListaSimple extends ListaAbstracta implements Lista {
    
    @Override
    public <E> void addFirst(E e) {
        if (this.cabeza == null) {
            this.cabeza = new Nodo<>(e, null);
        } else {
            this.cabeza.setSig(new Nodo());
        }
    }
    
    @Override
    public <E> void addLast(E e) {
        if (this.cabeza == null) {
            this.cabeza = new Nodo<>(e, null);
        } else {
            Nodo aux = this.cabeza;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(new Nodo<>(e, null));
        }
    }
    
    @Override
    public <E> void addAfter(E e, Nodo<E> n) {
        Nodo aux = this.cabeza;
        do {
            if (aux == n) {
                aux.setSig(new Nodo<>(e, null));
                break;
            }
            aux = aux.getSig();
        } while (aux != null);
    }
    
    @Override
    public <E> void addBefore(E e, Nodo<E> n) {
        if (this.cabeza == n) {
            this.cabeza = new Nodo<>(e, this.cabeza);
        } else if (this.cabeza.getSig() == n) {
            this.cabeza.setSig(new Nodo<>(e, n));
        } else {
            Nodo aux = this.cabeza;
            do {
                if (aux.getSig().getSig() == n) {
                    aux.getSig().setSig(new Nodo<>(e, n));
                }
            } while (aux.getSig() != null);
        }
    }
    
    @Override
    public <E> void deleteHead(Nodo<E> n) {
    
    }
    
    @Override
    public <E> void deleteAny(Nodo<E> n) {
    
    }
}
