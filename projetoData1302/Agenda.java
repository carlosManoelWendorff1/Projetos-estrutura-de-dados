import java.util.List;
import java.util.ArrayList;

public class Agenda
{
   private List<contato> contatos = new ArrayList<contato>();
   
   public void setContato(contato contato){
    this.contatos.add(contato);
    System.out.println(contato.getName());
   }
   
   public List<contato> getContatos(){
    return contatos;
    }
}
