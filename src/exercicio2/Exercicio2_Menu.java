/*Regras:

Código deve estar indentado (-1 ponto se não estiver);
Obrigatório usar JOptionPane (-1 ponto se não usar);
Cada classe deverá estar em um arquivo separado (-1 ponto se não estiver);
Método main() deve estar em uma classe separada das demais (-1 ponto se não estiver).
Trabalhos idênticos serão zerados.

Formato de entrega:

Todos os arquivos dentro de uma pasta compactada (.zip).
Criar um projeto para cada exercício, colocá-los dentro de uma pasta e compactar a pasta.*/
 
package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Exercicio2_Menu {

  
    public static void main(String[] args) {
        
      int opcao;
      
      ArrayList <Aluno> alunos = new ArrayList<>();
      AlunoGraducao alunoG = new AlunoGraducao();
      AlunoPosGraduacao alunoP ;
    
        do {                
            String input =  JOptionPane.showInputDialog( " 1 – Inserir Aluno\n" +
                                   " 2 – Exibir Alunos\n" +
                                   " 3 – Sair");
            
            opcao  = Integer.parseInt(input);
        switch (opcao) {
            case 1:
                String a =  JOptionPane.showInputDialog( " 1 – Aluno graduacao\n" +
                                   " 2 – Aluno Pos graduacao\n" +
                                   " 3 – Voltar");
                int b = Integer.parseInt(a);
                
                switch (b) { // começo switch inclusao de alunos
                    case 1:
                        String nome =  JOptionPane.showInputDialog( "Qual o nome do aluno?");
                        String ra =  JOptionPane.showInputDialog( "Qual o rs do aluno?");
                        String curso =  JOptionPane.showInputDialog( "Qual o curso do aluno?");
                        alunoG.setNome(nome);
                        alunoG.setCurso(curso);
                        alunoG.setRa(ra);
                        
                       alunos.add(alunoG);
                    
                       break;
                    case 2:
                        nome =  JOptionPane.showInputDialog( "Qual o nome do aluno?");
                        ra =  JOptionPane.showInputDialog( "Qual o ra do aluno?");
                        curso =  JOptionPane.showInputDialog( "Qual o curso do aluno?");
                        alunoP= new AlunoPosGraduacao("202305", ra, nome, curso);
                        
                       alunos.add(alunoP);
                       break;
                    case 3:
                        break;
                        
                    default: 
                           JOptionPane.showMessageDialog(null, "Opcao invalida");
                   
                }// final switch para inclusao de alunos 
            break;
            case 2:
                for (Aluno varTemporaria : alunos) {
                    JOptionPane.showMessageDialog(null, varTemporaria.toString());
                }
                break;
        }
        } while (opcao!=3);
    }
    
}
    