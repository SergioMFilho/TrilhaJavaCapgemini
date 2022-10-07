package Construtores;

public class Construtor {
    public static void main(String[] args) {
        Aluno alu = new Aluno(8 , 8, 8);
        double mediaAlunoFinal = alu.calcularMediaAluno();

        if(mediaAlunoFinal < 6) {
            alu.situacaoAluno = Aluno.STATUS.REPROVADO;
        } else {
            alu.situacaoAluno = Aluno.STATUS.APROVADO;
        }
        System.out.println("A media do aluno é: " + alu.calcularMediaAluno() + " e o status é:" + alu.situacaoAluno);

        alu.situacaoMatricula = Aluno.Matricula.MATRICULADO;
        System.out.println("O aluno está: " + alu.situacaoMatricula);
    }
}
