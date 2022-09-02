package br.com.questao3.notasalunos;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private String curso;
	private int matricula;
	private int periodo;
	private float notaAV1;
	private float notaAV2;
	private float notaAE;
	
	public Aluno(String nome, String curso, int matricula, int periodo, float notaAV1, float notaAV2, float notaAE) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.periodo = periodo;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
	}

	
	public void alteraNota1(float notaAV1) {
		this.notaAV1 = notaAV1;
	}
	
	public void alteraNota2(float notaAV2) {
		this.notaAV2 = notaAV2;
	}
	
	public void alteraNotaAE(float notaAE) {
		this.notaAE = notaAE;
	}
	
	public String avaliarAluno() {

		if((this.notaAV1 + this.notaAV2) >= 60) {
			return "Aprovado";
		}
		else {
			return "Recuperação";
		}
	}
	
	public String avaliarRecuperacao() {
		if((this.notaAV1 + this.notaAV2 + this.notaAE)/2 >=60)
			return "Aprovado!";
		else
			return"Reprovado!";
					
	}
	

}
