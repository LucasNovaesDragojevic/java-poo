package aula11;

public class aula11 {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa(); Não se pode instanciar classe abstrata.
		Aluno aluno = new Aluno();
		aluno.setSexo("M");
		aluno.setIdade(20);
		aluno.setNome("Ruberval");
		aluno.setMatriucla(341);
		aluno.setCurso("TI");
		aluno.fazerAniversario();
		aluno.pagarMensalidade();
		System.out.println(aluno.toString());
		
		Bolsista bolsista = new Bolsista();
		bolsista.setBolsa(43);
		bolsista.setCurso("Web Design");
		bolsista.setIdade(18);
		bolsista.setMatriucla(76);
		bolsista.setNome("Juliana");
		bolsista.setSexo("F");
		bolsista.pagarMensalidade();
		bolsista.renovarBolsa();
		System.out.println(bolsista.toString());
	}

}
