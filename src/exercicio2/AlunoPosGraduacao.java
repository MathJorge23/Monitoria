
package exercicio2;

public class AlunoPosGraduacao extends Aluno{

    public String anoConclusaoGraduacao;
    public double nota1;
    public double nota2;

    public AlunoPosGraduacao(String anoConclusaoGraduacao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public AlunoPosGraduacao() {
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "AlunoPosGraduacao{" + "anoConclusaoGraduacao=" + anoConclusaoGraduacao +"\n"
                                    + ", nota1=" + nota1 +"\n"
                                    + ", nota2=" + nota2 +"\n" 
                                    + ", ra=" + ra +"\n" 
                                    + ", nome=" + nome +"\n" 
                                    + ", curso=" + curso + '}';
    }
    
    
    @Override
    public double calcularMedia() {
        return (nota1 + nota2)/2;
    }

    @Override
    public String verificarAprovacao() {
        
        if (calcularMedia() >=5) {
            return "aprovado";
        }
        else {
            return "reprovado";
        }
        
    }
    
}
