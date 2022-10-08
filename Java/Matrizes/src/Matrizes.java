import javax.swing.*;

public class Matrizes {
    public static void main(String[] args) {
        String[] alunos = {"JOAO","JOSÉ","MARIA"};
        float [][] notas = new float[3][3];
        float somaNotas, mediaAluno;
        String statusAluno;

        for(int i=0; i<3 ; i++) {
            System.out.println("Aluno : " + alunos[i]);
            somaNotas = 0;
            mediaAluno = 0;
            for (int j=0; j<3 ; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº" + (j+1) + "do aluno"
                        + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno = somaNotas/3;
            if(mediaAluno < 5.0) {
                statusAluno = "REPROVADO";
            } else if (mediaAluno >= 5.0 && mediaAluno <= 7.5) {
                statusAluno = "EM RECUPERAÇÃO";
            } else {
                statusAluno = "APROVADO";
            }
            System.out.println("\n**************BOLETIM**************");
            System.out.println("Aluno : " + alunos[i]);
            System.out.println("Notas");
            for(int k=0; k<3 ; k++) {
                System.out.println((k+1) + " - " + notas[i][k]);
                }
            System.out.println("Média : " + mediaAluno + " - " + statusAluno);
            }
        }
    }

