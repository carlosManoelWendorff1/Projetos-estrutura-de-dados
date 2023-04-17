public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        conjuntoEspalhamento conj = new conjuntoEspalhamento();
        conj.adiciona("palavra");
        conj.adiciona("Computador");
        conj.adiciona("Apostila");
        conj.adiciona("instrutor");
        conj.adiciona("mesa");
        conj.adiciona("Telefone");
        if(!conj.contem("Apostila")){
            System.out.println("erro: tabela não possuí apostila");
        }

    }
}
