package tda;

public class NodoDoble extends Nodo{
    private Nodo ant;
    
    public NodoDoble() {
    }
    
    public NodoDoble(Object o, Nodo sig, Nodo ant) {
        super(o, sig);
        this.ant = ant;
    }
    
    @Override
    public String toString() {
        return "NodoDoble{" +
                "ant=" + ant +
                "} " + super.toString();
    }
    
    public Nodo getAnt() {
        return ant;
    }
    
    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}
