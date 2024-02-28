public class Aluno{

    //atributos
    private String nome;
    private int matricula;
    private String curso;

    //metodos
   
    public void setNome(String nome){
        this.nome =nome;
    }
    public String getNome() {
        return nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}