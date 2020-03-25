package ProjetoPessoas;

public class Aluno extends Pessoa{
	private String curso;
	private int matricula;
	
	public Aluno () {
		
	}
	
	public Aluno(String curso, int matricula) {
		this.curso = curso;
		this.matricula = matricula;
	}

	private String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	private int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	private void cancelarMatricula() {
		System.out.println("Matrícula cancelada.");
	}
}
