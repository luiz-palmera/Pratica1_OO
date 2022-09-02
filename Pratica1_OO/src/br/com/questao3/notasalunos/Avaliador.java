package br.com.questao3.notasalunos;

public class Avaliador {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Matias", "Admnistração", 24, 3, 12, 40, 3);
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.alteraNotaAE(70);
		System.out.println("Alterar nota da Prova Especial");
		System.out.println(aluno1.avaliarRecuperacao());

	}

}
