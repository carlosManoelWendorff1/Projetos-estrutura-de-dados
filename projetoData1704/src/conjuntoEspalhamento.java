import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class conjuntoEspalhamento {
    
    private List<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
    
    
    public conjuntoEspalhamento(){
        for(int i = 0;i <26;i++){
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }
    public int calculaIndiceDaTabela(String palavra){
        return palavra.toLowerCase().charAt(0) % 26;
    }
    public void adiciona(String palavra){
        if(!this.contem(palavra)){
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
        }
        else{
            System.out.println("palavra já existe !!!");
        }
    }
    public void remove(String palavra){
        if(this.contem(palavra)){
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
        }
        else{
            System.out.println("palavra não existe !!!");
        }
    }
    public boolean contem(String palavra){
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);
        return lista.contains(palavra);
    }

    public List<String> pegaTodas(){

        List<String> listaPalavras = new ArrayList<String>(); 
        for(int i = 0;i < this.tabela.size();i++){
            listaPalavras.addAll(tabela.get(i));
        }
        return listaPalavras;
    }
    public int tamanho(){
        int count = 0;
        List<String> listaPalavras = new ArrayList<String>(); 
        for(int i = 0;i < this.tabela.size();i++){
            listaPalavras.addAll(tabela.get(i));
            count += listaPalavras.size();
        }
        return count;
    }
}
