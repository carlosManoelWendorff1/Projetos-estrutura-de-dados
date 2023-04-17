package Node;

public class Node<t> {
    
    public Node<t> proximo;
    public Node<t> anterior;
    public Object elemento;

    public Node<t> getProximo() {
        return proximo;
    }
    public void setProximo(Node<t> proximo) {
        this.proximo = proximo;
    }
    public Node(Node<t> proximo, Node<t> anterior, Object elemento) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    public Node<t> getAnterior() {
        return anterior;
    }
    public void setAnterior(Node<t> anterior) {
        this.anterior = anterior;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
