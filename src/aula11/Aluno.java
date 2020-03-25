package aula11;

public class Aluno extends Pessoa {
	private int matriucla;
	private String curso;

	public Aluno() {
		super();
	}
	
	public Aluno(int matriucla, String curso) {
		super();
		this.matriucla = matriucla;
		this.curso = curso;
	}

	public int getMatriucla() {
		return matriucla;
	}

	public void setMatriucla(int matriucla) {
		this.matriucla = matriucla;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void pagarMensalidade() {
		System.out.println("Mensalidade paga.");
	}
}
