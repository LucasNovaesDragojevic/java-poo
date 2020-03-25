package ProjetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Funcionario funcionario = new Funcionario();
		
		pessoa.setNome("Pedro");
		aluno.setNome("Maria");
		professor.setNome("Cláudia");
		funcionario.setNome("Fabiana");
		
		pessoa.setSexo("M");
		aluno.setSexo("F");
		professor.setSexo("F");
		funcionario.setSexo("F");
		
		pessoa.setIdade(18);
		aluno.setIdade(20);
		professor.setIdade(40);
		funcionario.setIdade(100);
		
		aluno.setCurso("Infomática");
		
		professor.setSalario(2500.75f);
		
		funcionario.setSetor("Estoque");
		
		System.out.println(pessoa.toString());
		System.out.println(aluno.toString());
		System.out.println(professor.toString());
		System.out.println(funcionario.toString());
	}
}