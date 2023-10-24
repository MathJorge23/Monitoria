
package exercicio2;


public class AlunoGraducao extends Aluno {

    public String anoConclusaoEnsinoMedio;
    public double ac1;
    public double ac2;
    public double af;
    public double ag;

    public AlunoGraducao() {
    }

    public AlunoGraducao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }
    
    
    
    
    
    @Override
    public double calcularMedia() {
        /*  O método calcularMedia() deverá implementar:
            o Graduação: (ac1 * 0,1) + (ac2 * 0,3) + (ag * 0,2) + (af * 0,4)*/
        return (ac1 * 0.15) + (ac2 * 0.3) + (ag * 0.1) + (af * 0.4);
    }

    @Override
    public String toString() {
        return "AlunoGraducao{" + "anoConclusaoEnsinoMedio=" + anoConclusaoEnsinoMedio+"\n"
                + ", ac1=" + ac1 +"\n"
                + ", ac2=" + ac2 +"\n"
                + ", af=" + af +"\n"
                + ", ag=" + ag + '}';
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
