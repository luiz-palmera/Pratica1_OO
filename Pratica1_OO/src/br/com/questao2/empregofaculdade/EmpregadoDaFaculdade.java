package br.com.questao2.empregofaculdade;

public class EmpregadoDaFaculdade {
		private String nome;
		private double salario;
		private int horasAula;
		
		EmpregadoDaFaculdade(String nome, double salario, int horasAula){
			this.nome = nome;
			this.salario = salario;
			this.horasAula = horasAula;
		}
		
		public double getGastos(){
			
			double bonus = 40 * horasAula;
			return this.salario + bonus;
		}
		
		public String getInfo(){
			return "nome: " + this.nome + " com salário de " + getGastos();
		}

}
