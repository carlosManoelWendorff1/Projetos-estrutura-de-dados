package aula_aluno;

public class Aluno {
    private String name;
    private  Aluno nextAluno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Aluno getNextAluno() {
        return nextAluno;
    }
    public void setNextAluno(Aluno nextAluno) {
        this.nextAluno = nextAluno;
    }

    
}
