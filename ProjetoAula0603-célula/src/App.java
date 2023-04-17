import java.util.List;

import Celula.Celula;
import Celula.ListaLigada;
import Funcionario.FuncionarioClass;

public class App {
    public static void main(String[] args) throws Exception {
        //FuncionarioClass object =  new FuncionarioClass("Pedro","12313","12313123131","1231312312312@");

        //ListaLigada<String> lista = new ListaLigada <String>();
        //lista.adiciona("Carlos");
        //lista.adiciona("Pedro");
        //lista.adiciona("Gabriel");
        //lista.adiciona("lista");
        //lista.adiciona("pedrin");
        //System.out.println(lista.pega(5));
        //lista.remover(1);
        //System.out.println( lista.pega(1));
        //lista.adicionaEm("édrin", 1);
        //System.out.println(lista.tamanho());
        //System.out.println(lista.contem("João"));
//
        ListaLigada<FuncionarioClass> listaFuncionario = new ListaLigada<FuncionarioClass>();
        listaFuncionario.adiciona(new FuncionarioClass("Carlos","1111111","1111111232","adwadwa@"));

        ListaLigada<FuncionarioClass> listaFuncionario2 = new ListaLigada<FuncionarioClass>();
        listaFuncionario2.adiciona(new FuncionarioClass("Pedro", "qdawadad", "dwadwad", "adadwawd@"));

        System.out.println(listaFuncionario.toString());
        System.out.println(listaFuncionario2.toString());
        System.out.println(listaFuncionario.concatenar(listaFuncionario, listaFuncionario2).pega(0));

        //listaFuncionario.AdicionaPrimeiro(new FuncionarioClass("32dawad","dasdas","adsasd","wfrf@"));
        //listaFuncionario.adiciona(new FuncionarioClass("adwad","1111111","1111111232","adwadwa@"));
        //listaFuncionario.adiciona(object);
        //listaFuncionario.adiciona(new FuncionarioClass("Gabriel","313123","1111111232","adwadwa@"));

        //System.out.println(((FuncionarioClass)listaFuncionario.pega(0)).toString());
        
        //System.out.println(((FuncionarioClass)listaFuncionario.pega(3)).toString());
        //System.out.println(listaFuncionario.Indice(object));
        //listaFuncionario.removerCom(object);
        //System.out.println(((FuncionarioClass)listaFuncionario.pega(3)).toString());
        //System.out.println(listaFuncionario.Indice(object));
        //listaFuncionario.TrocaEm(object,4);

    }
}
