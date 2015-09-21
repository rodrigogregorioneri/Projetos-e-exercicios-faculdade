

package exemploalunos;

import javax.swing.JOptionPane;



public class ExemploAlunos {

   
    public static void main(String[] args) 
    {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Cacique";
        aluno1.rgm = "1234567-8";
        aluno1.mostra();
        
        Aluno aluno2 = new Aluno("Marina","8765432-1");
        aluno2.mostra();
        
        String nome = JOptionPane.showInputDialog(null,"Qual o nome do aluno?");
        String rgm = JOptionPane.showInputDialog(null,"Qual o rgm do aluno?");
        Aluno aluno3 = new Aluno( nome, rgm );
        float notas3[] = new float[3];
        notas3[0] = 2.6f;
        notas3[1] = 4.8f;
        notas3[2] = 9.9f;
        aluno3.setNotas(notas3);
        aluno3.mostra();
        

    }
    
}
