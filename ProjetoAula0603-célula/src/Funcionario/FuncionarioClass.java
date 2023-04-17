package Funcionario;

public class FuncionarioClass {

    private String Nome;
    private String CPF;
    private String Telefone;
    private String email;
    
    public FuncionarioClass(String Nome,String CPF,String Telefone,String email) {
        this.setNome(Nome);
        this.setCPF(CPF);
        this.setEmail(email);
        this.setTelefone(Telefone);
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "FuncionarioClass [Nome=" + Nome + ", CPF=" + CPF + ", Telefone=" + Telefone + ", email=" + email + "]";
    }
    

}
