package Pilha;

import java.util.LinkedList;
import java.util.List;

import Peca.Peca;

public class Pilha<T> {
    
    private List<T> pecas = new LinkedList<T>();

    public void inserePeca(T peca){
        pecas.add(peca);
    }
    public T remove(){
        return pecas.remove(pecas.size() -1);
    }
    public boolean vazia(){
        return pecas.isEmpty();
    }
    public String palavraIvertida(){
        List<T> inverso = new LinkedList<T>();
        for(int i = pecas.size() -1 ;i>=0;i--){
            inverso.add(pecas.get(i));
        }
        return inverso.toString();
    }

    @Override
    public String toString() {
        return "Pilha [pecas=" + pecas + "]";
    }
}
