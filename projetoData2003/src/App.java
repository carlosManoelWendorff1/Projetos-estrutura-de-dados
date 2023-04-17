import ListaDuplamenteLigada.bothWayList;
import Node.Node;

public class App {
    public static void main(String[] args) throws Exception {
        bothWayList<Pessoa> lista1 = new bothWayList<Pessoa>();
        Pessoa pessoa1 = new Pessoa("carlos",19);
        Pessoa pessoa2 = new Pessoa("carlos",19);
        Pessoa pessoa3 = new Pessoa("carlos",19);
        Pessoa pessoa4 = new Pessoa("pedro",130);

        lista1.adicionaUltimo(pessoa1);
        lista1.adicionaUltimo(pessoa2);
        lista1.adicionaUltimo(pessoa3);
        lista1.adicionaPrimeiro(pessoa4);
        lista1.adicionaEm(pessoa4, 2);
        
        System.out.println(lista1);

    }
}
