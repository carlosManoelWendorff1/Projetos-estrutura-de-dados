package ListaDuplamenteLigada;

import Node.Node;

public class bothWayList<t> {
    
    private Node<t> primeira;
    private Node<t> ultima;
    
    public void adicionaUltimo(Object elemento){
        if(this.primeira == null){
            this.primeira = new Node<t>(this.ultima, null, elemento);
            this.ultima = this.primeira;
            System.out.println(elemento.toString());
        }
        else{
            Node<t> newElement = new Node<t>(null, this.ultima, elemento);
            this.ultima.setProximo(newElement);
            this.ultima = newElement;
            System.out.println(elemento.toString());

        }
    }
    public void adicionaPrimeiro(Object elemento){
        if(this.primeira == null){
            this.primeira = new Node<t>(this.ultima, null, elemento);
            this.ultima = this.primeira;
            System.out.println("adcionado como primeiro pois não havia outro para comparar \n"+elemento.toString());
        }
        else{
            Node<t> newElement = new Node<t>(this.primeira, null, elemento);
            this.primeira.setAnterior(newElement);
            this.primeira = newElement;
            System.out.println("adicionado substituindo primeiro\n " + elemento.toString() );
        }
    }           
    public void adicionaEm(Object elemento, int posicao){
        Node<t> nextElement = this.primeira;
        for(int i = 0; i <posicao;i++){
            nextElement = nextElement.getProximo();
        }
        Node<t> novaCelula = new Node<t>(nextElement.getProximo(), nextElement.getAnterior(), elemento);
    }
    public void removePrimeiro(){
       this.primeira =  this.primeira.getProximo();
       this.primeira.setAnterior(null);
    }
    public void removeUltimo(){
        this.ultima = this.ultima.getAnterior();
        this.ultima.setProximo(null);
    }
    public void removeOnde(int posicao){
        Node<t> element = this.primeira;
        for(int i = 0; i <posicao;i++){
            element = element.getProximo();
        }
        Node<t> nextElement = element.getProximo();
        Node<t> previousElement = element.getAnterior();
        nextElement.setAnterior(element.getAnterior());
        previousElement.setProximo(nextElement);
    }
}
