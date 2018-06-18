package tda;

public class Nodo<T> {
    private T t;
    private Nodo sig;
    
    public Nodo() {
    }
    
    public Nodo(T t, Nodo sig) {
        this.t = t;
        this.sig = sig;
    }
    
    @Override
    public String toString() {
        return "Nodo{" +
                "t=" + t +
                ", sig=" + sig +
                '}';
    }
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
    
    public Nodo getSig() {
        return sig;
    }
    
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
