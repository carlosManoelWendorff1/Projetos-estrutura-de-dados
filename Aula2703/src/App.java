import java.sql.Wrapper;

import Peca.Peca;
import Pilha.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        
        Peca globo = new Peca("globo");
        Peca lampada = new Peca("lampada");
        Peca bocal = new Peca("bocal");    
        Peca helicie = new Peca("helicie");

        Pilha<Character> texto = new Pilha<Character>();
        
        String frase = "alo meu deus";

        for(int i = 0; i <frase.length();i++){
            texto.inserePeca(frase.charAt(i));
        };

        System.out.println(texto.palavraIvertida());
        
        Pilha<Peca> pilha = new Pilha<Peca>();
        pilha.inserePeca(globo);
        pilha.inserePeca(lampada);
        pilha.inserePeca(bocal);
        pilha.inserePeca(helicie);
        while(!pilha.vazia()){
            Peca peca = pilha.remove();
            System.out.println(peca);
        }
    }
}
