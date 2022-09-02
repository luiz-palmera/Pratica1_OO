package br.com.questao2.empregofaculdade;

public class Faculdade {

	public static void main(String[] args) {
		
		EmpregadoDaFaculdade empregadoFaculdade;
		empregadoFaculdade = new EmpregadoDaFaculdade("Maria", 500, 20);
		
		System.out.println(empregadoFaculdade.getInfo());
		
	}

}
