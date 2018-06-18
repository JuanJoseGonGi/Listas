package tda;

public interface Lista {
    <E> void addFirst(E e);
    <E> void addLast(E e);
    <E> void addAfter(E e, Nodo<E> n);
    <E> void addBefore(E e, Nodo<E> n);
    <E> void deleteHead(Nodo<E> n);
    <E> void deleteAny(Nodo<E> n);
}
