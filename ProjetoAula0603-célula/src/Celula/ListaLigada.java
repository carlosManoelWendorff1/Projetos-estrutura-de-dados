package Celula;

import java.util.ArrayList;

import Funcionario.FuncionarioClass;

public class ListaLigada<t> {
    private Celula<t> primeira;
    private Celula<t> ultima;

    public void adiciona(Object elemento){
        if (this.primeira == null) {
            this.primeira = new Celula<t>(ultima, elemento);
            this.ultima = this.primeira;
        }
        else {
            var celula = new Celula<t>(null,elemento);
            this.ultima.setProxima(celula);
            this.ultima = celula;
        }

    }
    public void AdicionaPrimeiro(Object elemento) {
        if (this.primeira == null) {
            this.primeira = new Celula<t>(ultima, elemento);
            this.ultima = this.primeira;
        }
        else{
            Celula<t> novaPrimeira = new Celula<t>(primeira, elemento);
            this.primeira = novaPrimeira;
        }
    }
    public void adicionaEm(Object elemento,int posicao){
        Celula<t> nextElement = primeira;
        Celula<t> previousElement = primeira;
        if(posicao != 0){
            for(int i =0 ; i <= posicao ;i++){
                nextElement = nextElement.getProxima();
            }
            for(int i =0 ; i <= posicao-1 ;i++){
                previousElement = previousElement.getProxima();
            }
            var celula =  new Celula<t>(nextElement, elemento);

            previousElement.setProxima(celula);
        }
        else{
            AdicionaPrimeiro(elemento);
        }
    }
      public void TrocaEm(Object elemento,int posicao){
        if(posicao != 0){
            Celula<t> element = primeira;
            for(int i =0 ; i < posicao;i++){
                element = element.getProxima();
            }
            var nextElement = element.getProxima();
            Celula<t> previousComparedElement = primeira;
            for(int i =0 ; i < posicao -1 ;i++){
                previousComparedElement = previousComparedElement.getProxima();
            }
            Celula<t> novaCelula = new Celula<t>(nextElement, elemento);
            previousComparedElement.setProxima(novaCelula);
        }
        }

    public Object pega (int posicao){
        
        if (posicao >=0) {    
            Celula<t> elemento = primeira;
            for(int i =0 ; i < posicao;i++){
                elemento = elemento.getProxima();
            }
            return elemento.getElemento();
        }
        return null;
    }
    public void remover (int posicao){
        if(posicao != 0){
            if (posicao >=0) {    
                Celula<t> elemento = primeira;
                for(int i =0 ; i < posicao;i++){
                    elemento = elemento.getProxima();
                }
                var nextElement = elemento.getProxima();
                Celula<t> previousComparedElement = primeira;
                for(int i =0 ; i < posicao -1 ;i++){
                    previousComparedElement = previousComparedElement.getProxima();
                }
                previousComparedElement.setProxima(nextElement);
                System.out.println("removido");
            }
        }
    }
    public void removerCom ( Object o){
        int indice =this.Indice(o);
        this.remover(indice);
    }
    public int tamanho(){
        Celula<t> elemento = primeira;
        int x =1;
        for(x =1 ; elemento.getProxima() != null;x++){
            elemento = elemento.getProxima();
        }
        return x;
    }
    public boolean contem(Object o){
        Celula<t> elemento = primeira;
        var size = this.tamanho();
        boolean tem = false;
        for(int i = 0;i <size ;i++){
            elemento.getProxima();
            if(elemento.getElemento() == o){
                tem = true;
                break;
            }
        }
        return tem;
    }
    public int Indice(Object o){
        Celula<t> elemento = primeira;
        var size = this.tamanho();
        int indice = -150;

        for(int i = 0;i <size ;i++){
            if(elemento.getElemento().equals(o)){
                indice = i;
                break;
            }
        elemento = elemento.getProxima();
        }
        return indice;
    }
    public ListaLigada<t> concatenar(ListaLigada<t> lista1,ListaLigada<t> lista2){
        ListaLigada<t> lista3 = new ListaLigada<t>();
        lista1.ultima.setProxima(lista2.primeira);
        lista3.primeira = lista1.primeira;
        lista3.ultima = lista2.ultima;
        return lista3;
    }
}
