public class App {
    public static void main(String[] args) throws Exception {
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
        System.out.println(conj.pegaTodas());
        System.out.println(conj.tamanho());

        conj.remove("mesa");

        System.out.println(conj.pegaTodas());
        System.out.println(conj.tamanho());

    }
}
